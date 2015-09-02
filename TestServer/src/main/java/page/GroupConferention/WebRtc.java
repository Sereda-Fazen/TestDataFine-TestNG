package page.GroupConferention;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class WebRtc extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Web Configuration*/

    @FindBy(id  = "conferences-list-menu-li")
    private WebElement groupConfer;

    @FindBy(name = "key")
    private WebElement checkbox;

    @FindBy (css = "#edit-button")
    private WebElement edit;

    @FindBy (css  = "div.outsideAddressBlock > span.leftMargin > a")
    private WebElement clickRtc;


   /*Page WebRTC*/

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[1]/form/table/tbody/tr[1]/td[1]/input[2]")
    private WebElement nameRtc;

    @FindBy (css = " tbody > tr:nth-of-type(2) > td:nth-of-type(1) > input.placeholder")
    private WebElement passRtc;

    @FindBy (css  = "#userAuthForm > input:nth-of-type(2)")
    private WebElement enterRtc;

    @FindBy (xpath  = "//*[@id='joinBtn']/div")
    private WebElement connectRtc;



    /*Assert*/
    @FindBy (className = "webrtcRemoteVideo")
    private WebElement assertWebRtc;


    public WebRtc(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    public void setGroupConf2() {
        clickOn(groupConfer);
    }
    public void setCheckbox() {
        clickOn(checkbox);
    }
    public void setEditGroup() {
        clickOn(edit);
    }

    public void setClickRtcUrl() {
        clickOn(clickRtc);
    }


    public void setNameRtc() {
        getDriver().switchTo().frame("conferenceInterfacePlugin");
        enter("fazen").into(nameRtc);

    }

    public void setPassRtc() {
        enter("123456").into(passRtc);
    }

    public void setEnterRtc() {
        clickOn(enterRtc);

    }
    public void setConnectRtc() {
        clickOn(connectRtc);
        assertEquals(true, element(assertWebRtc).isPresent());
    }




}





