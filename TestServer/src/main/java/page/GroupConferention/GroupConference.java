package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class GroupConference extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Group Conferantion*/
    @FindBy(id  = "conferences-list-menu-li")
    private WebElement groupConfer;
    @FindBy(className = "button")
    private WebElement createConf;

    @FindBy (className = "fullBlock")
    private WebElement nameConf;

    @FindBy (xpath  = "//*[@id='plugin']/div/div[9]/span[2]")
    private WebElement saveConf;

    /*Assert*/
    @FindBy (className  = "long-field")
    private WebElement assertConf;


    public GroupConference(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void setGroupConf() {
        clickOn(groupConfer);
    }

    public void setCreateConf() {
        clickOn(createConf);
    }

    public void setName() {
        enter("TestGroup").into(nameConf);
    }

    public void setSave() {
        clickOn(saveConf);
        assertEquals(true, element(assertConf).isPresent());
    }


}





