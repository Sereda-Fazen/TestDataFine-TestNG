package steps.SIPSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SIP.Sip;


public class SipNegativeSteps extends ScenarioSteps {
    Sip SipPage;

    public SipNegativeSteps(Pages pages) {
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

    @Step("Ввел сервер VoIP ")
    public void addIp(){
        SipPage.setIp();
    }
    @Step("Ввел  'Логин'")
    public void addWrongLogin(){
        SipPage.setLoginWrongSip();
    }

    @Step("Ввел 'Пароль' ")
    public void addPass() {
        SipPage.setPassSip();
    }

    @Step("Выбрал  регистрацию")
    public void addRegistration() {
        SipPage.setRegistration();

    }
    @Step ("Кликнул 'Сохранить'")
    public void addSaveSipWait() {SipPage.setSave();}

    @Step ("<b>Ожидаемый результат - 'Невалидный логин'</strong>")
    public void addAssertLogin() {SipPage.setAssertLogin();}

}


