package steps.SIPSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SIP.Sip;


public class ProxySipSteps extends ScenarioSteps {
    Sip SipPage;

    public ProxySipSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        Sip SipPage = getPages().get(Sip.class);
        SipPage.open();
    }

    @Step("Кликул на сслыку 'Sip шлюз'" )
    public void addClickSip() {
        SipPage.setClickSip();
    }

    @Step("Ввел сервер Sip Proxy ")
    public void addIpProxy(){
        SipPage.setIpProxy();
    }
    @Step("Ввел  'Логин'")
    public void addLoginProxy(){
        SipPage.setLoginSipProxy();
    }

    @Step("Ввел 'Пароль' ")
    public void addPassProxy() {
        SipPage.setPassSipProxy();
    }

    @Step("Выбрал  регистрацию")
    public void addRegistrationProxy() {
        SipPage.setRegistrationProxy();

    }
    @Step ("Кликнул 'Сохранить'")
    public void addSaveSipProxy() {SipPage.setSaveTrueSipProxy();}



}


