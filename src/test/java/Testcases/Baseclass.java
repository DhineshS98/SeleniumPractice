package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 WebDriver driver;
		@BeforeClass
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.tanishq.co.in/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();			
			}	

	

      @AfterClass
      public void close()
     {
    	  driver.close();
	 
    }
      
}


