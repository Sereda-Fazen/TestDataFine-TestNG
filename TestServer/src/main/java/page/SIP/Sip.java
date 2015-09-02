package page.SIP;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Sip extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Sip*/

    @FindBy(css  = "#network-sip-menu-li > a")
    private WebElement clickSip;
    @FindBy(css = "#tel-host-name")
    private WebElement inputIP;
    @FindBy (css = "#tel-login")
    private WebElement loginSip;
    @FindBy (css  = "#tel-pwd")
    private WebElement passSip;
    @FindBy (css  = "#tel-registerstrategy")
    private WebElement clickReistration;
    @FindBy (xpath  = "//*[@id='tel-registerstrategy']")
    private WebElement checkReistration;
    @FindBy (css  = "#save-sip-tel-and-default")
    private WebElement saveSip;


    /*Sip Proxy*/

    @FindBy(css = "#default-host-name")
    private WebElement inputIPProxy;
    @FindBy (css = "#default-login")
    private WebElement loginSipProxy;
    @FindBy (css  = "#default-pwd")
    private WebElement passSipProxy;
    @FindBy (css  = "#default-registerstrategy")
    private WebElement clickReistrationProxy;
    @FindBy (xpath  = "//*[@id='default-registerstrategy']")
    private WebElement checkReistrationProxy;



    /*AssertTrue*/
    @FindBy (css = "#tel-status > span.green")
    private WebElement assertSip;
    @FindBy (linkText = "successfully connected")
    private WebElement successfully;

    /*Assert server*/
    @FindBy (css = "span.red")
    private WebElement assertFalseSip;
    /*Assert login*/
    @FindBy (css = "span.red")
    private WebElement assertPleaseWait;




    /*Assert True Proxy*/
    @FindBy (css = "#tel-status > span.green")
    private WebElement assertSipProxy;

    public Sip(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setClickSip() {
        clickOn(clickSip);
    }
    public void setIp()  {enter("asterisk.trueconf.ua").into(inputIP);}

    public void setLoginSip() {enter("sereda").into(loginSip);}
    public void setPassSip() { enter("riuaspeslo").into(passSip);}
    public void setRegistration() {
        clickOn(clickReistration);
        clickOn(checkReistration);
    }

    /*Invalid case*/

    public void setIpWrong()  {enter("retsret").into(inputIP);}
    public void setLoginWrongSip() {enter("petya").into(loginSip);}


    public void setSave() {
        clickOn(saveSip);
    }


    public void setAssertSip () {

        assertTrue(element(assertSip).isPresent());
    }
    public void setAssertServer () {
        assertTrue(element(assertFalseSip).isPresent());
        assertFalse("Ошибка валидации сервера", element(assertFalseSip).isPresent());
    }
    public void setAssertLogin () {
        assertTrue(element(assertPleaseWait).isPresent());
        assertFalse("Ошибка валидации логина",element(assertPleaseWait).isPresent());
    }














   /*Подключение Sip Proxy */

    public void setIpProxy()  {enter("asterisk.trueconf.ua").into(inputIPProxy);}
    public void setLoginSipProxy() {enter("sereda").into(loginSipProxy);}
    public void setPassSipProxy() { enter("riuaspeslo").into(passSipProxy);}

    public void setRegistrationProxy() {
        clickOn(clickReistrationProxy);
        clickOn(checkReistrationProxy);
    }

    public void setSaveTrueSipProxy() {
        clickOn(saveSip);
        assertTrue (element(assertSip).isPresent());
        assertFalse("Ошибка авторизации Sip Proxy или Сервер Voip", element(assertPleaseWait).isPresent());
    }





}





