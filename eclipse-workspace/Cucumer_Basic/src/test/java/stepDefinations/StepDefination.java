package stepDefinations;


import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;
import cucumber.api.*;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^Validate browser$")
    public void validate_browser() throws Throwable {
        //throw new PendingException();
		System.out.println("abc");
    }

    @When("^Browser launched$")
    public void browser_launched() throws Throwable {
        //throw new PendingException();
    	System.out.println("abcd");
    }

    @Then("^Validate if browser launched$")
    public void validate_if_browser_launched() throws Throwable {
        //throw new PendingException();
    }
	
	@Given("^User is on NetBanking page$")
    public void user_is_on_netbanking_page() throws Throwable {
       // throw new PendingException();
        System.out.println("11");
        //driver.navigate.to.xpath(url)
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
   //     throw new PendingException();
    	System.out.println("12");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	//driver.findelement.by.xpath(username);
    	//driver.findelement.by.xpath(password);
    	
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       // throw new PendingException();
    	System.out.println("13");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
   //     throw new PendingException();
    	System.out.println("41");
    	System.out.println(strArg1);
       // throw new PendingException();
    }
    
    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
        //    throw new PendingException();
    	System.out.println(data.asList().toString());
    	/*
    	 * String  => har column type hai string
    	 * Suno List<String> => ye represent krta hai ak row ko
    	 * 
    	 * List<List<String>> => many rows
    	 */
    	List<List<String>> employeeList=data.asLists();
    	
    	for(int rowNumber=0;rowNumber<employeeList.size();rowNumber++)
    	{
    		for(int columnNumber=0;columnNumber<employeeList.get(rowNumber).size();columnNumber++)
    		{
    			System.out.print(" | " + employeeList.get(rowNumber).get(columnNumber));
    
    		}
    		System.out.print(" |");
    		System.out.println();
    	}
    	
    
    	
    }
    @When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
    
    
    
    
    
    
}