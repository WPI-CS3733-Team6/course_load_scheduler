package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.callback.AccountInfoCallback;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.callback.UpdateAccountCallback;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UpdateAccountInfoActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.AccountInfoTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class UserServiceImpl extends BaseServiceImpl implements UserService
{
	public UserServiceImpl()
	{
		
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
		
		registration = eventBus.addHandler(SendLoginEvent.TYPE, this);
		eventBusRegistration.put(SendLoginEvent.TYPE, registration);
	}
	
	@Override
	public void onSendLogin(SendLoginEvent evt)
	{
		SendLoginAction action = evt.getAction();
		LoginActionTranslatorImpl loginActionTranslator = new LoginActionTranslatorImpl();
		JSONObject json = loginActionTranslator.translateToJson(action);
		SendLoginCallback loginCallback = new SendLoginCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, loginCallback, json);
		request.send();
	}
	
	@Override
	public void onSendAccountInfo(SendAccountInfoEvent evt)
	{
		SendAccountInfoAction action = evt.getAction();
		AccountInfoTranslatorImpl sendAccountInfoActionTranslator = new AccountInfoTranslatorImpl();
		JSONObject json = sendAccountInfoActionTranslator.translateToJson(action);
		AccountInfoCallback sendAccountInfoCallback = new AccountInfoCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, sendAccountInfoCallback, json);
		request.send();
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
}