package com.example.pages;

import com.example.data.UserData;
import com.example.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegPage extends Page {

	@FindBy(css = "span.sbico")
	public WebElement clickSearchGoogle;
	@FindBy(css = "#lst-ib")
	public WebElement googlePage;


	@FindBy(css = "li.g > div > div.rc > h3.r > a")
	public WebElement clickForDatafine;


	//All links BUSINESS INTELLIGENCE
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(1) > a")
	public WebElement clickMysql;

	@FindBy(css = "#datapinelogo")
	public WebElement homePage;



	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(2) > a")
	public WebElement clickByTools;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(3) > a")
	public WebElement clickSelfByTools;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(4) > a")
	public WebElement clickSqlBisiness;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(5) > a")
	public WebElement clickBusinessAnalysisTools;



	//All links DATA VISUALIZATION
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(1) > a")
	public WebElement clickDataVisualization;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(2) > a")
	public WebElement clickDataAnalisis;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(3) > a")
	public WebElement clickVisualAnalisis;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(4) > a")
	public WebElement clickBestTools;
	@FindBy(css = "div.menus > div:nth-of-type(1) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(5) > a")
	public WebElement clickDataTools;


	//All links DASHBOARDS AND REPORTING
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(1) > a")
	public WebElement clickDashboardCreator;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(2) > a")
	public WebElement clickBestSoftware;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(3) > a")
	public WebElement clickDashboardBuilder;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(4) > a")
	public WebElement clickDashboardKPI;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(1) > ul > li:nth-of-type(5) > a")
	public WebElement clickKPIReporting;
	//All links SQL QUERIES
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(1) > a")
	public WebElement clickOnlineSql;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(2) > a")
	public WebElement clickOnlineSqlQuerry;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(3) > a")
	public WebElement clickMysqlQuery;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(4) > a")
	public WebElement clickMysqlReporting;
	@FindBy(css = "div.menus > div:nth-of-type(2) > div.holder > div:nth-of-type(2) > ul > li:nth-of-type(5) > a")
	public WebElement clickMysqlOnlineEditor;

	//All sicial links

	@FindBy(css = "#index_facebook")
	public WebElement clickFacebook;
	@FindBy(css = "#index_twitter")
	public WebElement clickTwiter;
	@FindBy(css = "#index_xing")
	public WebElement clickXing;
	@FindBy(css = "#index_linkedin")
	public WebElement clickLinked;
	@FindBy(css = "#index_googleplus")
	public WebElement clickGoogle;


	public RegPage(WebDriver driver) {
		super(driver);
	}
	
	
	public HomePage pageData(UserData page) {
		type(googlePage, page.dataFineUrl);

		return PageFactory.initElements(driver, HomePage.class);
	}
	public DataFinePage pageDatafine () throws InterruptedException, IOException {

		typeClick(clickSearchGoogle);
		typeClick(clickForDatafine);

		typeClick(clickMysql);
		typeClickHome(homePage);
		typeClick(clickByTools);
		typeClickHome(homePage);
		typeClick(clickSelfByTools);
		typeClickHome(homePage);
		typeClick(clickSqlBisiness);
		typeClickHome(homePage);
		typeClick(clickBusinessAnalysisTools);
		typeClickHome(homePage);

		typeClick(clickDataVisualization);
		typeClickHome(homePage);
		typeClick(clickDataAnalisis);
		typeClickHome(homePage);
		typeClick(clickVisualAnalisis);
		typeClickHome(homePage);
		typeClick(clickBestTools);
		typeClickHome(homePage);
		typeClick(clickDataTools);
		typeClickHome(homePage);

		typeClick(clickDashboardCreator);
		typeClickHome(homePage);
		typeClick(clickBestSoftware);
		typeClickHome(homePage);
		typeClick(clickDashboardBuilder);
		typeClickHome(homePage);
		typeClick(clickDashboardKPI);
		typeClickHome(homePage);
		typeClick(clickKPIReporting);
		typeClickHome(homePage);

		typeClick(clickOnlineSql);
		typeClickHome(homePage);
		typeClick(clickOnlineSqlQuerry);
		typeClickHome(homePage);
		typeClick(clickMysqlQuery);
		typeClickHome(homePage);
		typeClick(clickMysqlReporting);
		typeClickHome(homePage);
		typeClick(clickMysqlOnlineEditor);
		typeClickHome(homePage);
		return PageFactory.initElements(driver, DataFinePage.class);

	}
	public DataFinePage pageForSocial () throws InterruptedException, IOException {

		typeClick(clickSearchGoogle);
		typeClick(clickForDatafine);

		typeClickSocial(clickFacebook);
		typeClickSocial(clickTwiter);
		typeClickSocial(clickXing);
		typeClickSocial(clickLinked);
		typeClickSocial(clickGoogle);
		typeClose();
		return PageFactory.initElements(driver, DataFinePage.class);
	}


    @Override
	public void open(){
		driver.get(ConfigProperties.getProperty("login.url"));
	}



	
		

}
