package com.example.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(css = "#lst-ib")
	public WebElement googlePage;



	@Override
	public void open() {
		
	}
	public boolean isLogOut() {
		if (isElementPresent(googlePage)) {
			return true;
		} else
			return false;
	}
	
	
	
	
}
	


