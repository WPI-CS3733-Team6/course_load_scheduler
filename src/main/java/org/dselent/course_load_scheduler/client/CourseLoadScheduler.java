package org.dselent.course_load_scheduler.client;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AccountInfoPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddInstancePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddSectionPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.AddCourseView;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;
import org.dselent.course_load_scheduler.client.view.AddSectionView;
import org.dselent.course_load_scheduler.client.view.IndexView;
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

		//TabLayoutPanelExample tabLayoutPanelExample = new TabLayoutPanelExample();
		//root.add(tabLayoutPanelExample);
		
		//ExamplesPanel examplesPanel = new ExamplesPanel();
		//root.add(examplesPanel);

		// Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;
		
		/*
		 * Uncomment the panel you want to have displayed on the indexd panel
		 */
		
		//Setup Index panel
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
		IndexView indexView = indexPresenter.getView();	
		indexPresenter.go(root);
		
		/* LOGIN
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
		LoginPresenter.go(indexView.getCenterPanel());
		*/
		
		/* ADD COURSE
		AddCoursePresenterImpl addCoursePresenter = injector.getAddCoursePresenter(); 
		addCoursePresenter.init();
		addCoursePresenter.go(indexView.getCenterPanel());
		*/
		
		/* ADD INSTANCE
		AddInstancePresenterImpl addInstancePresenter = injector.getAddInstancePresenter(); 
		addInstancePresenter.init();
		addInstancePresenter.go(indexView.getCenterPanel());
		*/
		
		/* ADD SECTION
		AddSectionPresenterImpl addSectionPresenter = injector.getAddSectionPresenter(); 
		addSectionPresenter.init();
		addSectionPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		AdminAddEditUserPresenterImpl adminAddEditUserPresenter = injector.getAdminAddEditUserPresenter();
		adminAddEditUserPresenter.init();
		adminAddEditUserPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		AdminHomepagePresenterImpl adminHomepagePresenter = injector.getAdminHomepagePresenter();
		adminHomepagePresenter.init();
		adminHomepagePresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		BasePresenterImpl basePresenter = injector.getBasePresenter();
		basePresenter.init();
		basePresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		CourseRegistrationCartPresenterImpl courseRegistrationCartPresenter = injector.getCourseRegistrationCartPresenter();
		courseRegistrationCartPresenter.init();
		courseRegistrationCartPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		DetailedCourseInformationPresenterImpl detailedCourseInformationPresenter = injector.getDetailedCourseInformationPresenter();
		detailedCourseInformationPresenter.init();
		detailedCourseInformationPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		FacultyCourseMapPresenterImpl facultyCourseMapPresenter = injector.getFacultyCourseMapPresenter();
		facultyCourseMapPresenter.init();
		facultyCourseMapPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter();
		indexPresenter.init();
		indexPresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		InstructorHompagePresenterImpl instructorHompagePresenter = injector.getInstructorHompagePresenter();
		instructorHompagePresenter.init();
		instructorHompagePresenter.go(indexView.getCenterPanel());
		*/
		
		/* TEMPLATE
		ReportProblemPresenterImpl reportProblemPresenter = injector.getReportProblemPresenter();
		reportProblemPresenter.init();
		reportProblemPresenter.go(indexView.getCenterPanel());
		*/
		
		/* VIEW CURRENT COURSES
		ViewCurrentCoursesPresenterImpl viewCurrentCoursesPresenter = injector.getViewCurrentCoursesPresenter();
		viewCurrentCoursesPresenter.init();
		viewCurrentCoursesPresenter.go(indexView.getCenterPanel());
		*/
		
		/* SEARCH CLASSES
		SearchClassesPresenterPresenterImpl searchClassesPresenterPresenter = injector.getSearchClassesPresenterPresenter();
		searchClassesPresenterPresenter.init();
		searchClassesPresenterPresenter.go(indexView.getCenterPanel());
		*/
	}
}
