package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AccountInfoPresenterImpl extends BasePresenterImpl implements AccountInfoPresenter{
	
	private IndexPresenter parentPresenter;
	private AccountInfoView view;
	
	@Inject
	public AccountInfoPresenterImpl(IndexPresenter parentPresenter, AccountInfoView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
	}
	
	@Override
	public void go(HasWidgets container) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BaseView<? extends BasePresenter> getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexPresenter getParentPresenter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AccountInfo() {
		// TODO Auto-generated method stub
		
	}

}
