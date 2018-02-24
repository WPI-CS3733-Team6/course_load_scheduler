package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;

public interface AccountInfoService extends BaseService {

	void onUpdateAccount(UpdateAccountEvent evt);
	void onSendAccountInfo(SendAccountInfoEvent evt);
}
