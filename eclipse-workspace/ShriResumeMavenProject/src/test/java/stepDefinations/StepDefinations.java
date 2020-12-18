package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Basic.BaseShriResume;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;
import cucumber.api.*;

@RunWith(Cucumber.class)
public class StepDefinations extends BaseShriResume{
	
	 //  public WebDriver driver;
		// need to assign driver 
		//driver = BaseShriResume.getDriver();

	    @Given("^User is on HomePage$")
	    public void user_is_on_homepage() throws Throwable {
	    //driver.findElement(By.xpath("")).click();	
	    	System.out.println("Home Page");
	    	
	        
	    }

	    @When("^User click on SignIn button$")
	    public void user_click_on_signin_button() throws Throwable {
	    	System.out.println("Home Page");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/a[2]")).click();	  
	    }

	    @Then("^User enter email \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_email_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("Email");
	    	
	        
	    }

	    @And("^Click on LogIn button$")
	    public void click_on_login_button() throws Throwable {
	    	System.out.println("LogIn Button");
	        
	    }

	    @And("^Dashboard Page displayed $")
	    public void dashboard_page_displayed() throws Throwable {
	    	System.out.println("Dashboard");
	    }

}

