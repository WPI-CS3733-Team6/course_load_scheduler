package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;
import org.dselent.course_load_scheduler.client.view.ReportProblemView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class ReportProblemViewImpl extends BaseViewImpl<ReportProblemPresenter> implements ReportProblemView {

	private static ReportProblemViewImplUiBinder uiBinder = GWT.create(ReportProblemViewImplUiBinder.class);

	interface ReportProblemViewImplUiBinder extends UiBinder<Widget, ReportProblemViewImpl> {
	}

	public ReportProblemViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(ReportProblemPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}
}
