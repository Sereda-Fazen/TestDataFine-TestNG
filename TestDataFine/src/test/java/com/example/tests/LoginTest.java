package com.example.tests;

import com.example.pages.DataFinePage;
import com.example.pages.HomePage;
import com.example.pages.RegPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTestCase {

	private RegPage RegPage = PageFactory.initElements(getWebDriver(),RegPage.class);
	
	private HomePage homepage;
	DataFinePage forLinks;


	
	@Test
	public void testDataFine() throws Exception {

		/**
		 * Open browser and google.com
 		 */
		RegPage.open();
		/**
		 * Input in search 'datafine.com'
		 * Click search
		 */
		homepage = RegPage.pageData(page);
		/**
		 * If found this page
		 */
		assertTrue(homepage.isLogOut());
		/**
		 * Open datafine.com
		 * Down ib footer
		 * Click for links on footer
		 */
		forLinks = RegPage.pageDatafine();

	}
	@Test
	public void testSocialLinks() throws Exception {

		RegPage.open();
		homepage = RegPage.pageData(page);
		assertTrue(homepage.isLogOut());
		/**
		 *
		 * Down ib footer
		 * Click for social links
		 */
		forLinks = RegPage.pageForSocial();
	}

	

	
}
