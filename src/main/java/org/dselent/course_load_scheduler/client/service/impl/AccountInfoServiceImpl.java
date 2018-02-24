package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.callback.AccountInfoCallback;
import org.dselent.course_load_scheduler.client.callback.UpdateAccountCallback;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.translator.impl.AccountInfoTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UpdateAccountInfoActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class AccountInfoServiceImpl extends BaseServiceImpl
implements org.dselent.course_load_scheduler.client.service.AccountInfoService {

	public AccountInfoServiceImpl() {
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
		
		registration = eventBus.addHandler(SendAccountInfoEvent.TYPE, this); 
		eventBusRegistration.put(SendAccountInfoEvent.TYPE, registration);
	}

	@Override
	public void onUpdateAccount(UpdateAccountEvent evt) {
		SendUpdateAccountInfoAction action = evt.getAction();
		UpdateAccountInfoActionTranslatorImpl accountInfoActionTranslator = new UpdateAccountInfoActionTranslatorImpl();
		JSONObject json = accountInfoActionTranslator.translateToJson(action);
		UpdateAccountCallback accountCallback = new UpdateAccountCallback(eventBus, evt.getContainer());

		// TODO write network request here
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_INFO_UPDATE, accountCallback, json);
		request.send();

		//WARNING: will return nothing but errors until the relevant actions match up properly with the server side services and responses

	}
	@Override
	public void onSendAccountInfo(SendAccountInfoEvent evt) {
		SendAccountInfoAction action = evt.getAction();
		AccountInfoTranslatorImpl accountInfoTranslator = new AccountInfoTranslatorImpl();
		JSONObject json = accountInfoTranslator.translateToJson(action);
		AccountInfoCallback accountInfoCallback = new AccountInfoCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.ACCOUNT, accountInfoCallback, json);
		request.send();
	}

}
