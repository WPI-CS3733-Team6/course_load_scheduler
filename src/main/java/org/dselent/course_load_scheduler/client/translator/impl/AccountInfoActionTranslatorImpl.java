package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.UpdateAccountAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveAccountInfoKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.UpdateAccountKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class AccountInfoActionTranslatorImpl
		implements ActionTranslator<UpdateAccountAction, ReceiveAccountInfoAction> {

	@Override
	public JSONObject translateToJson(UpdateAccountAction action) {
		
		JSONObject jsonObject = new JSONObject();
		
		//helpers, to put strings in necessary fields
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UpdateAccountKeys.OLD_PASSWORD), action.getOldPassword());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UpdateAccountKeys.NEW_PASSWORD), action.getNewPassword());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(UpdateAccountKeys.NEW_EMAIL), action.getNewEmail());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(UpdateAccountKeys.NEW_PHONE_NUM), action.getNewPhoneNum());
		
		return jsonObject;
	}

	@Override
	public ReceiveAccountInfoAction translateToAction(JSONObject json) {
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		//finish later
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.EMAIL));
		Long phoneNum = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.PHONE_NUM));
		String secondaryEmail = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.SECONDARY_EMAIL));
		Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.USER_STATE_ID));
		Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.UPDATED_AT));
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNum(phoneNum);
		user.setSecondaryEmail(secondaryEmail);
		user.setUserStateId(userStateId);
		user.setCreatedAt(new Date(createdAt));
		user.setUpdatedAt(new Date(updatedAt));
		
		ReceiveAccountInfoAction action = new ReceiveAccountInfoAction(user);
		
		return action;
	}

}
