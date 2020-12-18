package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public static void before_Validationmethod()
	{
		//this will execute firstly
		//before tb lgate jb sbse phle execute krna h nd particular
		// test cases m hi run krna h to tag lga skte h
		
	}
	@After("@MobileTest")
	public static void afterValidation_method()
	{
		System.out.println("mobile test");
	}

	@Before("@WebTest")
	public static void beforeWebTest_method()
	{
		System.out.println("web test");
	}
	
	@After("@PortalTest")
	public static void portalTest()
	{
		System.out.println("portal test");
	}
}
