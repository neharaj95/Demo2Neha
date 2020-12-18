package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Basic.BaseShriResume;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseShriResume{
	public static WebDriver driver;
	@Before("@SmokeTest")
	public static void afterValidation_method() throws IOException
	{
		System.out.println("Smoke test");
		BaseShriResume.getDriver();
		System.out.println("Smoke test 2");
		
		//driver=BaseShriResume.getDriver();
		//new BaseShriResume();
		//BaseShriResume.getDriver();
	}
	@After("@SmokeTest")
	public static void LogIN()
	{
		System.out.println("pass");
	}

}
