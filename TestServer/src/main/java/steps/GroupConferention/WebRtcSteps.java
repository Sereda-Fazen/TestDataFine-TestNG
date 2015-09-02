package steps.GroupConferention;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.GroupConferention.WebRtc;


public class WebRtcSteps extends ScenarioSteps {
    WebRtc WebRtcPage;

    public WebRtcSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        WebRtc RtcPage = getPages().get(WebRtc.class);
        RtcPage.open();
    }

    @Step("Кликнул 'Групповые конференции'")
    public void addGroupConf(){
        WebRtcPage.setGroupConf2();
    }

    @Step("Кликнул радио группы")
    public void addCheckbox() {
        WebRtcPage.setCheckbox();
    }
    @Step("Кликнул 'Редактировать'")
    public void addEditGroup() {
        WebRtcPage.setEditGroup();
    }
    @Step("Кликнул на ссылку Web RTC")
    public void addClickRtcUrl() {
        WebRtcPage.setClickRtcUrl();
    }


    @Step("Ввел  'Имя'")
    public void addNameRtc(){
        WebRtcPage.setNameRtc();
    }

    @Step("Ввел 'Пароль' ")
    public void addPassRtc() {
        WebRtcPage.setPassRtc();
    }

    @Step("Кликнул 'Войти' ")
    public void addEnter() {
        WebRtcPage.setEnterRtc();


    }

    @Step ("Кликнул 'Присоединиться'")
    public void addConnectRtc() {WebRtcPage.setConnectRtc();}
}


