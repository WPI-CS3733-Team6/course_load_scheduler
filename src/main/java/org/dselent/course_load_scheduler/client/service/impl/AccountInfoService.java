package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.callback.UpdateAccountCallback;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.translator.impl.UpdateAccountInfoActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class AccountInfoService extends BaseServiceImpl
		implements org.dselent.course_load_scheduler.client.service.AccountInfoService {

	public AccountInfoService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(UpdateAccountEvent.TYPE, this);
		eventBusRegistration.put(UpdateAccountEvent.TYPE, registration);
	}
	
	@Override
	public void onUpdateAccount(UpdateAccountEvent evt) {
		SendUpdateAccountInfoAction action = evt.getAction();
		UpdateAccountInfoActionTranslatorImpl accountInfoActionTranslator = new UpdateAccountInfoActionTranslatorImpl();
		JSONObject json = accountInfoActionTranslator.translateToJson(action);
		UpdateAccountCallback accountCallback = new UpdateAccountCallback(eventBus, evt.getContainer());
		
		// TODO write network request here
	}

}
