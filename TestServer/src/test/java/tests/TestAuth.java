package tests;



import net.thucydides.core.annotations.ManagedPages;

import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Server.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://localhost:8888/admin/general/info/")
    public Pages pages;

    @WithTag("Group Conference")
  //  @Test
    public void TestGroupConf() throws InterruptedException {

        groupConf.addGroupConf();
        create.addCreateConf();
        name.addName();
        Thread.sleep(3000);
        save.addSave();


    }
    @WithTag("Web RTC")
    @Ignore
   // @Test
    public void TestWebGroupСonferenceRtc() throws InterruptedException {

        groupConf2.addGroupConf();
        checkbox.addCheckbox();
        edit.addEditGroup();
        clickRtcUrl.addClickRtcUrl();
        enterName.addNameRtc();
        enterPass.addPassRtc();
        enter.addEnter();
        Thread.sleep(2000);
        connectRtc.addConnectRtc();

    }
    @WithTag("SIP - valid date")

   // @Test
    public void TestSipValidDate() throws InterruptedException {

        clickSip.addClickSip();
        ip.addIp();
        login.addLogin();
        pass.addPass();
        registration.addRegistration();
        saveSip.addSaveSip();
        Thread.sleep(25000);
        assertResult.addAssertSip();

    }
    @WithTag("SIP - invalid server ")

  //  @Test
    public void TestSipInvalidServer() throws InterruptedException {

        clickSip.addClickSip();
        ip2.addIp();
        login.addLogin();
        pass.addPass();
        registration.addRegistration();
        wrong.addSaveSipWrong();
        Thread.sleep(25000);
        assertServer.addAssertServer();
    }
    @WithTag("SIP - invalid authorization ")
    @Ignore
   // @Test
    public void TestSipInvalidAuthorization() throws InterruptedException {

        clickSip.addClickSip();
        ip3.addIp();
        loginWrong.addWrongLogin();
        pass.addPass();
        registration.addRegistration();
        wait.addSaveSipWait();
        Thread.sleep(25000);
        assertLogin.addAssertLogin();


    }
    @WithTag("SIP Proxy + Сервер VoIP")
    @Ignore
   // @Test
    public void TestSipProxy() throws InterruptedException {

        clickSip.addClickSip();
        ip.addIp();
        login.addLogin();
        pass.addPass();
        registration.addRegistration();

        ipProxy.addIpProxy();
        loginProxy.addLoginProxy();
        passProxy.addPassProxy();
        registrationProxy.addRegistrationProxy();
        waitProxy.addSaveSipProxy();
        Thread.sleep(15000);

    }
    @WithTag("Settings")
 @Test
    public void TestSettings() throws InterruptedException {

        settings.addSettings();
        path.addPath();
        reports.addReports();
        config.addConfig();
        app.addApp();
        setApp.addSetApp();
        saveSet.addSet();
        assertSet.addAssert();

    }

    @WithTag("Settings Net")
   @Test
    public void TestSettingsNet() throws InterruptedException {

        settings.addSettings();
        settingsNet.addSettingsNet();
        checkBox.addCheckBox();
        addIpNet.addIpNet();
        reset.addResetNet();
        checkBox.addCheckBox();
        apply.addApply();
        restart.addRestart();

    }

}



