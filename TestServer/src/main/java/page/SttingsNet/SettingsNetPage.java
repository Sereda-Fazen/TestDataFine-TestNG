package page.SttingsNet;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SettingsNetPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Settings*/

    @FindBy(css = "#network-address-menu-li > a")
    private WebElement clickSettingsNet;

    @FindBy(css = "#network_inside_all_ip")
    private WebElement clickCheckBoxNet;


    // Add
    @FindBy(css = "#add-accept-address")
    private WebElement clickAddSet;
    @FindBy(css = "#host")
    private WebElement inputHost;
    @FindBy(css = "#port")
    private WebElement inputPort;
    @FindBy(css = "div.ui-dialog-buttonset > button:nth-of-type(3) > span.ui-button-text")
    private WebElement hoseSave;


    @FindBy(css = "#reset-accept-address")
    private WebElement reset;

    @FindBy(css = "#update-accept-hosts")
    private WebElement update;

    //Restart server
    @FindBy(css = "span.note-msg > a")
    private WebElement restart;
    @FindBy(css = "div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-draggable.ui-dialog-buttons.dialog-question-form > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement doYouWantRestart;

    //Assert
    @FindBy(css = "#server-status > span:nth-of-type(2)")
    private WebElement assertServer;

    public SettingsNetPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setSettingsNet() {
        clickOn(clickSettingsNet);
    }

    public void setCheckBox() throws InterruptedException {
        clickOn(clickCheckBoxNet);
    }

    public void setAddIpNet() {
        clickOn(clickAddSet);
        enter("192.168.90.1").into(inputHost);
        enter("4136").into(inputPort);
        clickOn(hoseSave);

    }

    public void setResetNet() throws InterruptedException {
        clickOn(reset);
        clickOn(clickCheckBoxNet);
    }

    public void setApply() throws InterruptedException {
        clickOn(update);
        Thread.sleep(3000);
    }

    public void setRestart() throws InterruptedException{
        clickOn(restart);
        clickOn(doYouWantRestart);
        Thread.sleep(25000);
        assertTrue(element(assertServer).isPresent());
    }




}


























