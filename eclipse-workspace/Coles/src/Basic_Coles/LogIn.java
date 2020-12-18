package Basic_Coles;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.Main;

public class LogIn {

	public static void main(String[] args) {
		//String absolutePath = new File(Main.class.getClassLoader().getResource("chromedriver-79.0.3945.36").getFile()).getAbsolutePath();
		//System.setProperty("webdriver.chrome.driver", absolutePath);
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		System.setProperty("webdriver.gecko.driver","⁨geckodriver");
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");

	}

}
