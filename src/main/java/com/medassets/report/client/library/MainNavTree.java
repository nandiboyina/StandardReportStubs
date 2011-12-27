package com.medassets.report.client.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.component.MAWindowCallback;
import com.medassets.report.client.component.MAWindowPrompt;
import com.medassets.report.client.service.MainService;
import com.medassets.report.client.service.MainServiceAsync;
import com.medassets.report.shared.TreeItemDTO;

public class MainNavTree extends Composite {

    private final MainServiceAsync service = GWT.create(MainService.class);
    private static MainNavTreeUiBinder uiBinder = GWT.create(MainNavTreeUiBinder.class);
    @UiField
    ScrollPanel scrollPanel;
    @UiField
    FlowPanel buttonPanel;
    @UiField
    Label collapseAll;
    @UiField
    Label expandAll;
    private Images images;
    private Tree tree;
    private Button newTB;
    private Button deleteTB;
    private Button renameTB;

    private ReportTable reportTable;

    TreeItemDTO selectedDto;
    TreeItem selectedTreeItem;
    private Map<Object, Boolean> treeState;


    interface MainNavTreeUiBinder extends UiBinder<Widget, MainNavTree> {
    }

    public MainNavTree() {
        initWidget(uiBinder.createAndBindUi(this));

        treeState = new HashMap<Object, Boolean>();

        images = GWT.create(Images.class);
        tree = new Tree();
        tree.addSelectionHandler(new SelectionHandler<TreeItem>() {
        	

            public void onSelection(SelectionEvent<TreeItem> event) {
                selectedTreeItem = event.getSelectedItem();
               

                selectedDto = (TreeItemDTO) selectedTreeItem.getUserObject();
                enableButtons(selectedDto);
            }
        });
        scrollPanel.add(tree);
        setupToolbarButtons();
    }


    public void setReportTable(ReportTable reportTable) {
        this.reportTable = reportTable;
    }


    private void enableButtons(TreeItemDTO dto) {
        newTB.setEnabled(isNewable(dto));
        deleteTB.setEnabled(isDeletable(dto));
        renameTB.setEnabled(isRenamable(dto));
    }

    private boolean isNewable(TreeItemDTO dto) {
        return dto != null && dto.getType() == 2;
    }

    private boolean isDeletable(TreeItemDTO dto) {
        return (dto != null && dto.getType() == 2 && dto.getObjectId() != dto.getParentFolderId()) &&
            !(dto.getName().equals("General") && dto.getParent().getObjectId() == dto.getParent().getParentFolderId());
    }

    private boolean isRenamable(TreeItemDTO dto) {
        //	return dto != null && dto.getType() == 2 && dto.getObjectId() != dto.getParentFolderId();
        return isDeletable(dto);
    }

    public void addSelectionHandler(SelectionHandler<TreeItem> handler) {
        tree.addSelectionHandler(handler);
    }

    @UiHandler("expandAll")
    public void onExpandAllClick(ClickEvent event) {
        Iterator<TreeItem> iter =  tree.treeItemIterator();
        while (iter.hasNext()) {
            TreeItem item = iter.next();
            item.setState(true);
        }
    }

    @UiHandler("collapseAll")
    public void onCollapseAllClick(ClickEvent event) {
        Iterator<TreeItem> iter =  tree.treeItemIterator();
        while (iter.hasNext()) {
            TreeItem item = iter.next();
            item.setState(false);
        }
    }

    /**
     * TODO: Localize!!
     */
    private void setupToolbarButtons() {
        newTB = new Button("New Folder");
        newTB.setStyleName("toolbarButton");
        newTB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(final ClickEvent event) {
                createNewFolder();
            }
        });
        buttonPanel.add(newTB);

        renameTB = new Button("Rename Folder");
        renameTB.setStyleName("toolbarButton");
        renameTB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                renameFolder(selectedDto.getName());
            }
        });
        buttonPanel.add(renameTB);

        deleteTB = new Button("Delete Folder");
        deleteTB.setStyleName("toolbarButton");
        deleteTB.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                deleteFolder(event);
            }
        });
        buttonPanel.add(deleteTB);
        enableButtons(null);
    }

    private boolean folderExists(TreeItemDTO parent, String childName) {
        boolean returnVal = false;
        List<TreeItemDTO> siblings = parent.getChildren();
        for (int i = 0; i < siblings.size(); i++) {
            if (siblings.get(i).getName().equalsIgnoreCase(childName)) {
                returnVal = true;
                break;
            }
        }
        return returnVal;

    }

    private String getNewFolderName(TreeItemDTO parent) {
        String returnVal = null;
        String folderName;

        if (!folderExists(parent, "New Folder")) {
            returnVal = "New Folder";
        } else {
            for (int i = 1; i < 100; i++) {
                folderName = "New Folder(".concat(Integer.toString(i)).concat(")");
                if (!folderExists(parent, folderName)) {
                    returnVal = folderName;
                    break;
                }
            }
        }
        return returnVal;
    }


    private void createNewFolder() {
        if (!isNewable(selectedDto)) {
            return;
        }

        String folderName = getNewFolderName(selectedDto);
        if (folderName == null) {
            new MAWindowAlert("Error",
                "Please rename your folders before creating more.", null, "Ok").center();
        }

        // Create a temporary entry, add it to the folder and open the folder
        // on success it'll refresh to a real folder
        TreeItem dummy = new TreeItem(folderName);
        tree.getSelectedItem().addItem("<i>" + dummy + "</i>");
        tree.getSelectedItem().setState(true);

        service.newFolder(selectedDto, folderName,
            new AsyncCallback<String>() {
                public void onFailure(Throwable caught) {
                    GWT.log(caught.getMessage(), caught);
                }

                @Override
                public void onSuccess(String result) {
                    refresh();
                }
            });
    }

    private void renameFolder(final String defaultName) {
        if (!isRenamable(selectedDto)) {
            return;
        }

        // Create a callback function for the prompt window...
        MAWindowCallback cb = new MAWindowCallback() {
            /**
             * Called when one of the buttons are clicked
             * @param buttonIndex - Index of button that was clicked
             * @param input - Value user entered
             */
            @Override
            public void onClick(int buttonIndex, Object input) {
                if (buttonIndex == 0) {
                    continueRenameFolder(String.valueOf(input), defaultName);
                }
            }
        };
        // Show prompt...
        new MAWindowPrompt(
            "Rename Folder", // Title
            "Please enter the new folder name:", // Message
            defaultName, // Default value
            cb, // Callback
            "Ok", "Cancel" // button text
            ).center();
    }

    private void continueRenameFolder(String newFolderName, final String defaultName) {
        // User canceled operation...
        if (newFolderName == null) {
            return;
        }

        newFolderName = newFolderName.trim();

        // Folder name must not be empty..
        if (newFolderName.length() == 0) {
            showInvalidFolderNamePrompt("Invalid Folder Name",
                "Please enter a valid folder name that is not blank.", defaultName);
            return;
        }

        // 50 character max...
        if (newFolderName.length() > 40) {
            showInvalidFolderNamePrompt("Invalid Folder Name",
                "The new folder name you have entered is too long.  Please enter a name with 40 characters or less.",
                defaultName);
            return;
        }

        // Duplicate name
        if (selectedDto.getParent() != null) {
            List<TreeItemDTO> children = selectedDto.getParent().getChildren();
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i).getName().equalsIgnoreCase(newFolderName)
                    && children.get(i).getObjectId() != selectedDto.getObjectId()) {
                    showInvalidFolderNamePrompt("Invalid Folder Name",
                        "There is already a folder named '[folder name]' under the same parent folder.  A parent folder cannot have two or more child folders with the same name",
                        defaultName);
                    return;
                }
            }
        }

        selectedDto.setName(newFolderName);
        service.renameFolder(selectedDto,
            new AsyncCallback<Void>() {

                @Override
                public void onFailure(Throwable caught) {
                    GWT.log(caught.getMessage(), caught);
                }

                @Override
                public void onSuccess(Void v) {
                    refresh();
                }
            });
    }

    /**
     *
     * @param title
     * @param message
     * @param folderName
     */
    private void showInvalidFolderNamePrompt(final String title, final String message,
        final String folderName) {
        MAWindowCallback cb = new MAWindowCallback() {
            @Override
            public void onClick(int buttonIndex, Object input) {
                renameFolder(folderName);
            }
        };
        new MAWindowAlert(title, message, cb, "Ok").center();
    }

    private void deleteFolder(final ClickEvent event) {

        if (reportTable.hasChildren((TreeItemDTO) selectedTreeItem.getUserObject())) {
            new MAWindowAlert(
                "Error", // Title
                "You are trying to delete a folder that contains reports or folders. " + // Message
                "You must move or delete the reports and/or folders before you can " +
                "delete the folder.",
                null, // Callback (not needed in this case)
                "Ok").center();
        } else {
            // Create a callback function for the Message window...
            MAWindowCallback cb = new MAWindowCallback() {
                /**
                 * Called when one of the buttons are clicked
                 * @param buttonIndex - Index of button that was clicked
                 * @param input - Value user entered (Only applicable in MAWindowPrompt!!)
                 */
                @Override
                public void onClick(int buttonIndex, Object input) {
                    if (buttonIndex == 0) { // user clicked the "Delete" button
                        service.deleteFolder(selectedDto, new AsyncCallback<String>() {
                            @Override
                            public void onFailure(Throwable caught) {
                                GWT.log(caught.getMessage(), caught);
                            }

                            @Override
                            public void onSuccess(String result) {
                                tree.removeItem(selectedTreeItem);
                                refresh();
                            }
                        });
                    }
                }
            };
            // Show message dialog...
            new MAWindowAlert(
                "Delete Folder?", // Title
                selectedDto.getName() + " will be deleted. Do you want to continue?", // Message
                cb, // callback
                "Delete", "Cancel" // Buttons (order is important!!)
                ).center();
        }
    }

    public void refresh() {
        saveTreeState();
        service.getAllTreeData(new AsyncCallback<List<TreeItemDTO>>() {
            public void onFailure(Throwable t) {
                GWT.log(t.getMessage());
            }

            public void onSuccess(List<TreeItemDTO> result) {
                setData(result);
                restoreTreeState();
            }
        });
    }

    /**
     * TODO: Save and reselect selected row
     *
     * @param data d
     */
    private void setData(List<TreeItemDTO> data) {
        TreeItem selectedItem = tree.getSelectedItem();
        tree.clear();
        for (TreeItemDTO dto : data) {
            ImageResource ir = images.folder();
            switch (dto.getType()) {
                case 0:
                    ir = images.template();
                    break;
                case 1:
                    ir = images.report();
                    break;
                default:
                    ir = images.folder();
                    break;
            }
            TreeItem ti = new TreeItem(imageItemHTML(ir, dto.toString()));
            ti.setUserObject(dto);
            addChildren(ti, ir, dto.getChildren());
            tree.addItem(ti);
            ti.setState(true);
        }

        if (selectedItem != null) {
            selectTreeItem(selectedItem);
        } else {
            tree.setSelectedItem(tree.getItem(0));
        }
    }

    private void selectTreeItem(TreeItem treeItem) {
        if (treeItem == null) {
            return;
        }
        TreeItemDTO sDTO = (TreeItemDTO) treeItem.getUserObject();
        List<TreeItem> list = new ArrayList<TreeItem>();
        for (int i = 0; i < tree.getItemCount(); i++) {
            getAllChildren(list, tree.getItem(i));
        }
        for (TreeItem aList : list) {
            TreeItemDTO dto = (TreeItemDTO) aList.getUserObject();
            if (dto.getObjectId() != null && dto.getObjectId().equals(sDTO.getObjectId())
                && dto.getType() == sDTO.getType()) {
                tree.setSelectedItem(aList);
                break;
            }
        }
    }

    private void getAllChildren(List<TreeItem> list, TreeItem ti) {
        for (int i = 0; i < ti.getChildCount(); i++) {
            list.add(ti.getChild(i));
            getAllChildren(list, ti.getChild(i));
        }
    }

    private void addChildren(TreeItem parent, ImageResource ir, List<TreeItemDTO> children) {
        for (TreeItemDTO dto : children) {
            TreeItem ti = new TreeItem(imageItemHTML(ir, dto.toString()));
            TreeItemDTO parentDTO = (TreeItemDTO) parent.getUserObject();
            dto.setParent(parentDTO);
            ti.setUserObject(dto);
            parent.addItem(ti);
            if (dto.getChildren().size() > 0) {
                addChildren(ti, ir, dto.getChildren());
            }
        }
    }

    private void saveTreeState() {
        Iterator<TreeItem> iter = tree.treeItemIterator();

        while (iter.hasNext()) {
            TreeItem treeItem = iter.next();
            TreeItemDTO dto = (TreeItemDTO) treeItem.getUserObject();
            if (dto != null) {
                treeState.put(dto.getObjectId(), treeItem.getState());
            }
        }
    }

    private void restoreTreeState() {
        if (treeState == null || treeState.isEmpty()) {
            return;
        }

        Iterator<TreeItem> iter = tree.treeItemIterator();

        while (iter.hasNext()) {
            TreeItem treeItem = iter.next();
            TreeItemDTO dto = (TreeItemDTO) treeItem.getUserObject();

            if (dto.getParent() == null) {
                if (dto.getName().equals("Templates") || dto.getName().equals("Reports")) {
                    treeItem.setState(true);
                    continue;
                }
            }

            Boolean state = treeState.get(dto.getObjectId());
            if (state != null) {
                treeItem.setState(state);
            }
        }

    }

    /*
    private static TreeItem addImageItem(TreeItem root, String title, ImageResource imageProto) {
    TreeItem item = new TreeItem(imageItemHTML(imageProto, title));
    root.addItem(item);
    return item;
    }*/
    private static String imageItemHTML(ImageResource imageProto, String title) {
        AbstractImagePrototype aip = AbstractImagePrototype.create(imageProto);
        String html = aip.getHTML() + "&nbsp;" + title + "&nbsp;";
        return html.replace("style='", "style='vertical-align:middle;height:100%;padding-top:2px;padding-bottom:2px;");
    }

    public interface Images extends ClientBundle, Tree.Resources {

        @Source("../resources/folder.png")
        ImageResource folder();

        @Source("../resources/template.png")
        ImageResource template();

        @Source("../resources/report.png")
        ImageResource report();

        @Source("../resources/noimage.png")
        ImageResource treeLeaf();
    }

    public Tree getTree() {
        return tree;
    }
}
