package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;
import org.dselent.course_load_scheduler.client.event.AddSectionEvent;
import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import org.dselent.course_load_scheduler.client.event.CourseRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.DeleteInstanceEvent;
import org.dselent.course_load_scheduler.client.event.DeleteSectionEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditUserEvent;
import org.dselent.course_load_scheduler.client.event.FacultyCourseMapEvent;
import org.dselent.course_load_scheduler.client.event.GoToAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddEditUserEvent;
import org.dselent.course_load_scheduler.client.event.GoToCartEvent;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditSectionEvent;
import org.dselent.course_load_scheduler.client.event.GoToFacultyCourseMapEvent;
import org.dselent.course_load_scheduler.client.event.InvalidAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseIdEvent;
import org.dselent.course_load_scheduler.client.event.InvalidInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.InvalidReportEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.SaveInstanceEvent;
import org.dselent.course_load_scheduler.client.event.SaveSectionEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SubmitCourseToCartEvent;
import org.dselent.course_load_scheduler.client.event.SubmitReportEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;

/**
 * Adapter class for convenience
 * All classes that need to implement an event handler can extend from this class
 * This allows for presenters or other classes not to implement a large number of handler interfaces
 * Need to register all event handling functions with this class by implementing the handler and
 * overriding with an empty method
 * 
 * @author dselent
 * 
 */
public abstract class EventHandlerAdapter
implements InvalidLoginEventHandler, SendLoginEventHandler, InvalidCourseEventHandler, ReceiveLoginEventHandler, AddCourseEventHandler, AddInstanceEventHandler, AddSectionEventHandler,
AddUserEventHandler, CourseRegistrationCartEventHandler, DeleteCourseEventHandler, DeleteInstanceEventHandler, DeleteSectionEventHandler, 
EditCourseEventHandler, EditUserEventHandler, FacultyCourseMapEventHandler, GoToAccountInfoEventHandler, GoToAddCourseEventHandler, GoToAddEditUserEventHandler, GoToCartEventHandler, 
GoToClassSearchEventHandler, GoToCurrentCoursesEventHandler, GoToEditCourseEventHandler, GoToEditInstanceEventHandler, GoToEditSectionEventHandler, InvalidCourseIdEventHandler, 
InvalidInstanceEventHandler, InvalidReportEventHandler, SaveInstanceEventHandler, SaveSectionEventHandler, SubmitReportEventHandler, UpdateAccountEventHandler, InvalidAccountInfoEventHandler, 
SubmitCourseToCartEventHandler, GoToFacultyCourseMapEventHandler
{
	@Override
	public void onUpdateAccount(UpdateAccountEvent evt) {}
	
	@Override
	public void onSubmitReport(SubmitReportEvent evt) {}
	
	@Override
	public void onSaveSection(SaveSectionEvent evt) {}
	
	@Override
	public void onSaveInstance(SaveInstanceEvent evt) {}
	
	@Override
	public void onInvalidReport(InvalidReportEvent evt) {}
	
	@Override
	public void onInvalidInstance(InvalidInstanceEvent evt) {}
	
	@Override
	public void onInvalidCourseId(InvalidCourseIdEvent evt) {}
	
	@Override
	public void onGoToEditSection(GoToEditSectionEvent evt) {}
	
	@Override
	public void onGoToInstanceEdit(GoToEditInstanceEvent evt) {}
	
	@Override
	public void onGoToEditCourse(GoToEditCourseEvent evt) {}
	
	@Override
	public void onGoToCurrentCourses(GoToCurrentCoursesEvent evt) {}
	
	@Override
	public void onGoToClassSearch(GoToClassSearchEvent evt) {}
	
	@Override
	public void onGoToCart(GoToCartEvent evt) {}
	
	@Override
	public void onGoToAddEditUser(GoToAddEditUserEvent evt) {}
	
	@Override
	public void onGoToAddCourse(GoToAddCourseEvent evt) {}
	
	@Override
	public void onGoToAccountInfo(GoToAccountInfoEvent evt) {}
	
	@Override
	public void onGetFaculty(FacultyCourseMapEvent evt) {}
	
	@Override
	public void onEditUser(EditUserEvent evt) {}
	
	@Override
	public void onEditCourse(EditCourseEvent evt) {}
	
	@Override
	public void onInvalidLogin(InvalidLoginEvent evt) {}
	
	@Override
	public void onSendLogin(SendLoginEvent evt) {}
	
	@Override
	public void onInvalidCourse(InvalidCourseEvent evt) {}
	
	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {}
	
	@Override
	public void onAddCourse(AddCourseEvent evt) {}
	
	@Override
	public void onAddInstance(AddInstanceEvent evt) {}
	
	@Override
	public void onAddSection(AddSectionEvent evt) {}
	
	@Override
	public void onAddUser(AddUserEvent evt) {}
	
	@Override
	public void onSubmitCart(CourseRegistrationCartEvent evt) {}
	
	@Override
	public void onDeleteCourse(DeleteCourseEvent evt) {}
	
	@Override
	public void onDeleteInstance(DeleteInstanceEvent evt) {}
	
	@Override
	public void onDeleteSection(DeleteSectionEvent evt) {}
	
	@Override
	public void onInvalidAccountInfo(InvalidAccountInfoEvent evt) {}
	
	@Override
	public void onSubmitCourseToCart(SubmitCourseToCartEvent evt) {}
	
	@Override
	public void onGoToFacultyCourseMap(GoToFacultyCourseMapEvent evt) {}
	
}
