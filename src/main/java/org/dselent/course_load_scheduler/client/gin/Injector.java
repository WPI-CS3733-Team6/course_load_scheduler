package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.impl.AccountInfoPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddInstancePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddSectionPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminAddEditUserPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.BasePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CourseRegistrationCartPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.DetailedCourseInformationPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyCourseMapPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.InstructorHompagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ReportProblemPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchClassesPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ViewCurrentCoursesPresenterImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * Interface required by gin due to lack of runtime reflections
 * Provide methods to get all objects that are to be injected
 * 
 * GinModules annotation: indicates what the module file is
 * 
 * @author dselent
 *
 */
@GinModules(InjectorModule.class)
public interface Injector extends Ginjector
{
	// GIN generator will instantiate this
	// GWT.create uses deferred bindings where many permutations are created but only one
	// is used at runtime (the one for the specific browser)
    public static final Injector INSTANCE = GWT.create(Injector.class);
 
    // event bus
    public SimpleEventBus getEventBus();
    
    // presenters
    public IndexPresenterImpl getIndexPresenter();
    public LoginPresenterImpl getLoginPresenter();
    public AccountInfoPresenterImpl getAccountInfoPresenter();
    public AddCoursePresenterImpl getAddCoursePresenter(); 
    public AddInstancePresenterImpl getAddInstancePresenter();
    public AddSectionPresenterImpl getAddSectionPresenter();
    public AdminAddEditUserPresenterImpl getAdminAddEditUserPresenter();
    public AdminHomepagePresenterImpl getAdminHomepagePresenter();
    public BasePresenterImpl getBasePresenter();
    public CourseRegistrationCartPresenterImpl getCourseRegistrationCartPresenter();
    public DetailedCourseInformationPresenterImpl getDetailedCourseInformationPresenter();
    public FacultyCourseMapPresenterImpl getFacultyCourseMapPresenter();
    public InstructorHompagePresenterImpl getInstructorHomepagePresenter();
    public ReportProblemPresenterImpl getReportProblemPresenter();
    public SearchClassesPresenterImpl getSearchClassesPresenter();
    public ViewCurrentCoursesPresenterImpl getViewCurrentCoursesPresenter();
    
    //views
    public IndexViewImpl getIndexView();
    public LoginViewImpl getLoginView();
    public AccountInfoPresenterImpl getAccountInfoView();
    public AddCoursePresenterImpl getAddCourseInfoView();
    public AddInstancePresenterImpl getAddInstanceInfoView();
    public AddSectionPresenterImpl getAddSectionInfoView();
    public AdminAddEditUserPresenterImpl getAdminAddEditUserInfoView();
    public AdminHomepagePresenterImpl getAdminHomepageInfoView();
    public BasePresenterImpl getBaseInfoView();
    public CourseRegistrationCartPresenterImpl getCourseRegistrationCartView();
    public DetailedCourseInformationPresenterImpl getDetailedCourseInformationView();
    public FacultyCourseMapPresenterImpl getFacultyCourseMapView();
    public InstructorHompagePresenterImpl getInstructorHomepageView();
    public ReportProblemPresenterImpl getReportProblemView();
    public SearchClassesPresenterImpl getSearchClassesView();
    public ViewCurrentCoursesPresenterImpl getViewCurrentCoursesView();
   
}
