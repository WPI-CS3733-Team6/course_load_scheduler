package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;

public interface UserService extends BaseService
{
	public void onSendLogin(SendLoginEvent evt);
	
	public void onSendAccountInfo(SendAccountInfoEvent evt);
}