package DemoTestng;

import org.testng.annotations.Test;

public class NewTest {
	
  @Test(priority=1)
  public void logIn() {
	  
	  System.out.println(" LogIn method");
  }
  @Test(priority=2)
  public void signUp()
  {
	  System.out.println(" Sign up method "); 
  }
}
