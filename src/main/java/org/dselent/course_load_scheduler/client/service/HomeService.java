package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.SendReportEvent;

public interface HomeService extends BaseService{
	void onReportProblem(SendReportEvent evt);
}
