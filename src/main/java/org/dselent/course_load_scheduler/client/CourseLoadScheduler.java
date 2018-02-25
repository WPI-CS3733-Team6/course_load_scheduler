package org.dselent.course_load_scheduler.client;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
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
import org.dselent.course_load_scheduler.client.presenter.impl.InstructorHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ReportProblemPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchClassesPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ViewCurrentCoursesPresenterImpl;
import org.dselent.course_load_scheduler.client.service.impl.BaseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.CourseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.HomeServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ExamplePresenterImpl;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.AddCourseView;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;
import org.dselent.course_load_scheduler.client.view.AddSectionView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.examples.SimplePanelExample;
import org.dselent.course_load_scheduler.client.view.examples.TabLayoutPanelExample;
import org.dselent.course_load_scheduler.client.view.impl.AccountInfoViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddCourseViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddInstanceViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddSectionViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminAddEditUserViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CourseRegistrationCartViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.DetailedCourseInformationViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyCourseMapViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.InstructorHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ReportProblemViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SearchClassesViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.TestPanels;
import org.dselent.course_load_scheduler.client.view.impl.ViewCurrentCoursesViewImpl;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CourseLoadScheduler implements EntryPoint
{

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		RootLayoutPanel root = RootLayoutPanel.get();

		// Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;

		BaseServiceImpl baseServiceImpl = injector.getBaseServiceImpl();
		baseServiceImpl.init();
		CourseServiceImpl courseServiceImpl = injector.getCourseServiceImpl();
		courseServiceImpl.init();
		HomeServiceImpl homeServiceImpl = injector.getHomeServiceImpl();
		homeServiceImpl.init();
		UserServiceImpl userServiceImpl = injector.getUserServiceImpl();
		userServiceImpl.init();

		/*
		 * Uncomment the panel you want to have displayed on the index panel
		 */

		//Setup Index panel
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
		IndexView indexView = indexPresenter.getView();	
		indexPresenter.go(root);

		//Dosen't work anymore
		//		TestPanels testPanel = new TestPanels();
		//		root.add(testPanel);

		//Don't touch
		//		SearchClassesViewImpl d = new SearchClassesViewImpl();
		//		root.add(d);


		//--------------------------------Testing Field-------------------------------------------------

		//AccountInfoViewImpl d = new AccountInfoViewImpl();		
		//AddCourseViewImpl d = new AddCourseViewImpl();
		//AddInstanceViewImpl d = new AddInstanceViewImpl();
		//AddSectionViewImpl d = new AddSectionViewImpl();
		//AdminAddEditUserViewImpl d = new AdminAddEditUserViewImpl();
		//CourseRegistrationCartViewImpl d = new CourseRegistrationCartViewImpl();
		//DetailedCourseInformationViewImpl d = new DetailedCourseInformationViewImpl();
		//FacultyCourseMapViewImpl d = new FacultyCourseMapViewImpl();
		//IndexViewImpl d = new IndexViewImpl();//make this work!!!!!!!!!
		//InstructorHomepageViewImpl d = new InstructorHomepageViewImpl();
		//AdminHomepageViewImpl d = new AdminHomepageViewImpl();
		//LoginViewImpl d = new LoginViewImpl();
		//ReportProblemViewImpl d = new ReportProblemViewImpl();
		//SearchClassesViewImpl d = new SearchClassesViewImpl();
		//ViewCurrentCoursesViewImpl d = new ViewCurrentCoursesViewImpl();
		//root.add(d);

		//----------------------------------------------------------------------------------------

		/* ACCOUNT INFO*/
		AccountInfoPresenterImpl accountInfoPresenter = injector.getAccountInfoPresenter();
		accountInfoPresenter.init();

		/* ADD COURSE*/
		AddCoursePresenterImpl addCoursePresenter = injector.getAddCoursePresenter(); 
		addCoursePresenter.init();
		//addCoursePresenter.go(indexView.getMiddlePanel());

		/* ADD INSTANCE*/
		AddInstancePresenterImpl addInstancePresenter = injector.getAddInstancePresenter(); 
		addInstancePresenter.init();
		//addInstancePresenter.go(indexView.getMiddlePanel());

		/* ADD SECTION*/
		AddSectionPresenterImpl addSectionPresenter = injector.getAddSectionPresenter(); 
		addSectionPresenter.init();
		//addSectionPresenter.go(indexView.getMiddlePanel());

		/*ADD EDIT USER*/
		AdminAddEditUserPresenterImpl adminAddEditUserPresenter = injector.getAdminAddEditUserPresenter();
		adminAddEditUserPresenter.init();
		//adminAddEditUserPresenter.go(indexView.getMiddlePanel());

		/* HOMEPAGE*/
		AdminHomepagePresenterImpl adminHomepagePresenter = injector.getAdminHomepagePresenter();
		adminHomepagePresenter.init();
		//adminHomepagePresenter.go(indexView.getMiddlePanel());

		/* BASE*/
		BasePresenterImpl basePresenter = injector.getBasePresenter();
		basePresenter.init();
		//basePresenter.go(indexView.getMiddlePanel());

		/* REGISTRATION CART*/
		CourseRegistrationCartPresenterImpl courseRegistrationCartPresenter = injector.getCourseRegistrationCartPresenter();
		courseRegistrationCartPresenter.init();
		//courseRegistrationCartPresenter.go(indexView.getMiddlePanel());

		/* COURSE INFROMATION*/
		DetailedCourseInformationPresenterImpl detailedCourseInformationPresenter = injector.getDetailedCourseInformationPresenter();
		detailedCourseInformationPresenter.init();
		//detailedCourseInformationPresenter.go(indexView.getMiddlePanel());

		/*EXAMPLES*/
		ExamplePresenterImpl examplePresenterImpl = injector.getExamplePresenter();
		examplePresenterImpl.init();
		//examplePresenterImpl.go(indexView.getMiddlePanel());

		/* FACULTY */
		FacultyCourseMapPresenterImpl facultyCourseMapPresenter = injector.getFacultyCourseMapPresenter();
		facultyCourseMapPresenter.init();
		//facultyCourseMapPresenter.go(indexView.getMiddlePanel());

		/* INSTRUCTOR HOM"E"PAGE	*/	 
		InstructorHomepagePresenterImpl instructorHompagePresenter = injector.getInstructorHomepagePresenter();
		instructorHompagePresenter.init();
		//instructorHompagePresenter.go(indexView.getMiddlePanel());

		/*LOGIN*/
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
		//loginPresenter.go(indexView.getMiddlePanel());

		/* REPORT PROBLEM*/
		ReportProblemPresenterImpl reportProblemPresenter = injector.getReportProblemPresenter();
		reportProblemPresenter.init();
		//reportProblemPresenter.go(indexView.getMiddlePanel());

		/* SEARCH CLASSES*/
		SearchClassesPresenterImpl searchClassesPresenterPresenter = injector.getSearchClassesPresenter();
		searchClassesPresenterPresenter.init();
		//searchClassesPresenterPresenter.go(indexView.getMiddlePanel());

		/* VIEW CURRENT COURSES*/
		ViewCurrentCoursesPresenterImpl viewCurrentCoursesPresenter = injector.getViewCurrentCoursesPresenter();
		viewCurrentCoursesPresenter.init();
		//viewCurrentCoursesPresenter.go(indexView.getMiddlePanel());


		//----------------------------------------------------------------------------------------
		//---------------------------PROFESSORS EXAMPLES------------------------------------------
		//SimplePanelExample simplePanelExample = new SimplePanelExample();
		//root.add(simplePanelExample);

		//SimplePanelExample2 simplePanelExample2 = new SimplePanelExample2();
		//root.add(simplePanelExample2);

		//HTMLPanelExample htmlPanelExample = new HTMLPanelExample();
		//root.add(htmlPanelExample);

		//FlowPanelExample flowPanelExample = new FlowPanelExample();
		//root.add(flowPanelExample);

		//VerticalPanelExample verticalPanelExample = new VerticalPanelExample();
		//root.add(verticalPanelExample);

		//HorizontalPanelExample horizontalPanelExample = new HorizontalPanelExample();
		//root.add(horizontalPanelExample);

		//DockLayoutPanelExample dockLayoutPanelExample = new DockLayoutPanelExample();
		//root.add(dockLayoutPanelExample);

		//GridExample gridExample = new GridExample();
		//root.add(gridExample);

		//		TabLayoutPanelExample tabLayoutPanelExample = new TabLayoutPanelExample();
		//		root.add(tabLayoutPanelExample);

		//ExamplesPanel examplesPanel = new ExamplesPanel();
		//root.add(examplesPanel);
		//-------------------------------END OF EXAMPLES--------------------------------------------
	}
}
