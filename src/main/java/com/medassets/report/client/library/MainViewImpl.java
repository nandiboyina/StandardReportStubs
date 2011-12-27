package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import org.apache.velocity.runtime.parser.node.GetExecutor;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainViewImpl extends Composite implements  MainView{
    private static MainViewImplUiBinder uiBinder = GWT.create(MainViewImplUiBinder.class);

	interface MainViewImplUiBinder extends UiBinder<Widget, MainViewImpl>
	{
	}


	@UiField
	MainNavTree tree;

	@UiField
	ReportTable table;

    private Presenter listener;
	public MainViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));

	}


    public MainNavTree getTree() {
        return tree;
    }

    @Override
    public ReportTable getTable() {
        return table;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTree(MainNavTree tree) {
       this.tree= tree;
    }

    public void setTable(ReportTable table){
        this.table= table;
        //this.tree.setReportTable(table);
    }

    public void setPresenter(Presenter presenter){
        this.listener=presenter;
    }

    public static void setUiBinder(MainViewImplUiBinder uiBinder) {
        MainViewImpl.uiBinder = uiBinder;
    }
}
