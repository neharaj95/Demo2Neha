package Basic;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseShriResume {
	
	public static WebDriver driver; // to call in other class , made it public [static used so that no need to create object ]
	// just need to extend base class to use WebDriver in other class
	
	public static Properties prop; // we create one file that is obj repository to store all 
	// we should not hard code as in future if we do changes then only need to do chnages to one file 
	// use FileInputStream to give path of prop file
	
	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		BaseShriResume.prop = prop;
	}

	public static WebDriver getDriver() throws IOException 
	{
	// define prop before system.set property 
		System.out.println("test0");
	prop = new Properties();
	System.out.println("test1");
	//FileInputStream file= new FileInputStream("Users/neharaj/eclipse-workspace/ShriResumeMavenProject/src/test/java/Basic/OR.properties");
	FileInputStream file= new FileInputStream("/Users/neharaj/eclipse-workspace/ShriResumeMavenProject/src/test/java/Basic/OR.properties");
	
	System.out.println("test2");
	prop.load(file);
	System.out.println("test3");
	//System.setProperty("webDriver.chrome.driver", "Users\\neharaj\\Downloads⁩");	
	System.setProperty("webdriver.gecko.driver","⁨geckodriver"); // for mac use gecko driver
    driver = new ChromeDriver();
	//driver.get("https://www.shriresume.com");
    //driver.get("URL");
    driver.get(prop.getProperty("URL"));
	System.out.println(prop.getProperty("URL"));
	
	return driver;
	

	
		
	}
	

}
