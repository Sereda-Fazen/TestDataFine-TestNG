package page.Settings;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SettingsPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Settings*/

    @FindBy(css  = "#general-config-menu-li > a")
    private WebElement clickSettings;


    //Path
    @FindBy(css = "#workingdirectory-path")
    private WebElement clickPath;
    @FindBy (css = "#TrueConf_anchor")
    private WebElement clickPathFolder;
    @FindBy (css = "body > div:nth-of-type(8) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement clickSaveFolder;
    @FindBy (css = "#workingdirectory > a.button")
    private WebElement clickApply;



    //Reports
    @FindBy (css = "#server-debug")
    private WebElement clickReports;
    @FindBy (css = "table.general-buttons > tbody > tr:nth-of-type(2) > td:first-child > a.button")
    private WebElement clickMagazine;
    @FindBy (css = "tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a.button")
    private WebElement clickUses;



    //Config
    @FindBy (css  = "#save-config")
    private WebElement clickSaveConfig;



    //App
    @FindBy (css  = "tr.TrueConf-Client > td.app-setup-url > a")
    private WebElement clickApp;
    @FindBy (css  = "tr.TrueConf-Mac-Os-X > td.app-setup-url > a")
    private WebElement clickAppMac;


    // Settings App
    @FindBy (css  = "#shared-key")
    private WebElement inputKey;


   //////////// //Runner////////
    @FindBy (css  = "#cb_maxbw")
    private WebElement checkBit;

    @FindBy (css  = "a.ui-slider-handle.ui-state-default.ui-corner-all")
    private WebElement clickRunner;


    @FindBy (css  = "div.slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all")
    private WebElement drop;




    @FindBy (css  = "#maxfps")
    private WebElement checkFps;
    @FindBy (xpath  = "//*[@id='maxfps']/option[2]")
    private WebElement checkNumFps;
    @FindBy (css  = "#framesize")
    private WebElement checkFramesize;
    @FindBy (xpath  = "//*[@id='framesize']/option[3]")
    private WebElement checkNumSize;












    //Save
    @FindBy (css  = "#save-application-settings")
    private WebElement clickSaveSet;



    /*Assert setting*/
    @FindBy (css = "span.note-msg")
    private WebElement saveAssert;


    public SettingsPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setSettings() {
        clickOn(clickSettings);
    }
    public void setPath() throws InterruptedException{
        clickOn(clickPath);
        Thread.sleep(2000);
        clickOn(clickPathFolder);
        Thread.sleep(2000);
        clickOn(clickSaveFolder);
        Thread.sleep(2000);
        clickOn(clickApply);
        Thread.sleep(2000);
    }
    public void setReports() throws  InterruptedException{
        clickOn(clickReports);
        clickOn(clickMagazine);
        clickOn(clickUses);
        Thread.sleep(2000);
    }

    public void setConfig() throws InterruptedException{
        clickOn(clickSaveConfig);
        Thread.sleep(2000);

    }
    public void setApp() throws InterruptedException{
        clickOn(clickApp);
        clickOn(clickAppMac);
        Thread.sleep(2000);
    }
    public void setSetApp() throws InterruptedException{

        enter("test").into(inputKey);

        clickOn(checkBit);
        clickOn(clickRunner);
        clickOn(drop);

        clickOn(checkFps);
        clickOn(checkNumFps);
        clickOn(checkFramesize);
        clickOn(checkNumSize);

    }
    public void setSet() {
        clickOn(clickSaveSet);

    }
    public void setAssert (){
        assertTrue(element(saveAssert).isPresent());
    }



















}





