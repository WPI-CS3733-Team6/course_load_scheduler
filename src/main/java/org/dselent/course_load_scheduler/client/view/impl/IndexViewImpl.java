package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.IndexView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;

public class IndexViewImpl extends BaseViewImpl<IndexPresenter> implements IndexView
{
	private static IndexViewImplUiBinder uiBinder = GWT.create(IndexViewImplUiBinder.class);

	interface IndexViewImplUiBinder extends UiBinder<Widget, IndexViewImpl> {}
	
	@UiField
	HTMLPanel topPanel;
	@UiField LayoutPanel layoutPanel;
	@UiField AbsolutePanel absolutePanel;
	@UiField LayoutPanel innerlayoutPanel;
	@UiField Label identification;
	@UiField LayoutPanel lowerPanel;
	@UiField HTMLPanel bottonPanel;
	@UiField HTMLPanel middlePanel;
	@UiField Button viewCurrentClasses;
	
	public IndexViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public HTMLPanel getMainPanel()
	{
		return topPanel;
	}

	@Override
	public void setMainPanel(HTMLPanel mainPanel)
	{
		this.topPanel = mainPanel;
	}

	@Override
	public void setPresenter(IndexPresenter presenter)
	{
		this.presenter = presenter;
	}

// Part of the template code from Doug:
// Not necessary for now, but keep it for reference
	
	@Override
	public PopupPanel getGlassLoadingPanel()
	{
		return null; //glassLoadingPanel;
	}
	
	@Override
	public Image getLoadingImage()
	{
		return null; //loadingImage;
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return topPanel;
	}

}
