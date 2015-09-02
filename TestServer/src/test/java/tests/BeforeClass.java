

package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import steps.GroupConferenceSteps;

import steps.GroupConferention.WebRtcSteps;

import steps.SIPSteps.ProxySipSteps;
import steps.SIPSteps.SipNegativeSteps;
import steps.SIPSteps.SipNegativeWrongSteps;
import steps.SIPSteps.SipSteps;
import steps.SettingsNetSteps.SettingsNetSteps;
import steps.SettingsSteps.SettingsSteps;


import java.io.IOException;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "chrome")



    public WebDriver driver;

    public String IEPath = "C:\\Users\\Alex\\.jenkins\\jobs\\TestServerSip\\webDrivers\\IEDriverServer.exe";
    public String ChromePath = "C:\\Users\\Alex\\.jenkins\\jobs\\TestServerSip\\webDrivers\\chromedriver.exe";




    /*Group Conference*/

    @Steps
    public GroupConferenceSteps groupConf;
    @Steps
    public GroupConferenceSteps create;
    @Steps
    public GroupConferenceSteps name;
    @Steps
    public GroupConferenceSteps save;

     /*Web Rtc*/



    @Steps
    public WebRtcSteps groupConf2;
    @Steps
    public WebRtcSteps checkbox;
    @Steps
    public WebRtcSteps edit;
    @Steps
    public WebRtcSteps clickRtcUrl;
    @Steps
    public WebRtcSteps enterName;
    @Steps
    public WebRtcSteps enterPass;
    @Steps
    public WebRtcSteps enter;
    @Steps
    public WebRtcSteps connectRtc;

    /*SIP*/

    @Steps
    public SipSteps clickSip;
    @Steps
    public SipSteps ip;
    @Steps
    public SipNegativeWrongSteps ip2;
    @Steps
    public SipNegativeSteps ip3;
    @Steps
    public SipSteps login;
    @Steps
    public SipSteps pass;
    @Steps
    public SipSteps registration;

    //Assert
    @Steps
    public SipSteps assertResult;
    @Steps
    public SipNegativeWrongSteps assertServer;
    @Steps
    public SipNegativeSteps assertLogin;

    @Steps
    public SipSteps saveSip;
    @Steps
    public SipNegativeWrongSteps wrong;
    @Steps
    public SipNegativeSteps wait;
    @Steps
    public SipNegativeSteps loginWrong;
    /*Proxy sip*/
    @Steps
    public ProxySipSteps ipProxy;
    @Steps
    public ProxySipSteps loginProxy;
    @Steps
    public ProxySipSteps passProxy;
    @Steps
    public ProxySipSteps registrationProxy;
    @Steps
    public ProxySipSteps waitProxy;


        /*Settings*/
    @Steps
    public SettingsSteps settings;
    @Steps
    public SettingsSteps path;
    @Steps
    public SettingsSteps reports;
    @Steps
    public SettingsSteps config;
    @Steps
    public SettingsSteps app;
    @Steps
    public SettingsSteps setApp;
    @Steps
    public SettingsSteps saveSet;
    @Steps
    public SettingsSteps assertSet;

    /*Settings Net*/
    @Steps
    public SettingsNetSteps settingsNet;
    @Steps
    public SettingsNetSteps checkBox;
    @Steps
    public SettingsNetSteps addIpNet;
    @Steps
    public SettingsNetSteps reset;
    @Steps
    public SettingsNetSteps apply;

    @Steps
    public SettingsNetSteps restart;



    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath );
        System.setProperty("webdriver.chrome.driver", ChromePath);
        settings.start_browser();
        driver.manage().window().maximize();


    }
    @After
    public void close() throws IOException {
        driver.close();
    }




    }



