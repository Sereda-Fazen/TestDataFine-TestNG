package com.example.pages;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public abstract class Page {
	
	protected WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void type (WebElement webElement, String text) {
		
		webElement.clear();
		webElement.sendKeys(text);

	}
	protected  void typeClick (WebElement webElement) throws InterruptedException, IOException {
		webElement.click();
		typeScreen();

	}
	protected  void typeClickHome (WebElement webElement) throws InterruptedException, IOException {
		webElement.click();

	}
	protected  void typeClickSocial (WebElement webElement) throws InterruptedException, IOException {
		webElement.click();
		typeScreen();
		Thread.sleep(3000);
		driver.navigate().to("http://datapine.com");
	}

	protected  void typeClose () throws InterruptedException {
		driver.quit();
	}
	protected  void typeScreen () throws IOException, InterruptedException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "./target/screenshots/" + screenshot.getName();
		FileUtils.copyFile(screenshot, new File(path));

	}

	public abstract void open();
	
	public boolean isElementPresent(WebElement element) {
	    try {
	      element.isDisplayed();
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	
	
	
}
