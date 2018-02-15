package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyCourseMapPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyCourseMapView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;

public class FacultyCourseMapImpl extends BaseViewImpl<FacultyCourseMapPresenter> implements FacultyCourseMapView {

	private static FacultyCourseMapImplUiBinder uiBinder = GWT.create(FacultyCourseMapImplUiBinder.class);
	@UiField Button backButton;
	@UiField Label titleLabel;
	@UiField FlexTable dataTable;
	@UiField HTMLPanel basePanel;
	@UiField LayoutPanel layoutPanel;

	interface FacultyCourseMapImplUiBinder extends UiBinder<Widget, FacultyCourseMapImpl> {
	}

	public FacultyCourseMapImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public FlexTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(FlexTable dataTable) {
		this.dataTable = dataTable;
	}

	public Button getBackButton() {
		return backButton;
	}

	@Override
	public void setPresenter(FacultyCourseMapPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return basePanel;
	}

}
