package com.example.tests;

import com.example.data.UserData;
import com.example.utils.ConfigProperties;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {


	protected static WebDriver driver;
	
	public UserData page = new UserData("datapine.com");
	@Before
	protected WebDriver getWebDriver(){
		  if  (driver == null) {
			   driver = new FirefoxDriver();
		       driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")),TimeUnit.SECONDS);
			  	driver.manage().window().maximize();
		  }
		 return driver;
	}
	  @After
	  public void tearDown() {
		  try {
		  driver.quit();
	  }
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("not close");
	}

	  }
}
