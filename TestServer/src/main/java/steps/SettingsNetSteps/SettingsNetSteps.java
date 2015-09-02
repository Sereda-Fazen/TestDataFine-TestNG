package steps.SettingsNetSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SttingsNet.SettingsNetPage;


public class SettingsNetSteps extends ScenarioSteps {
    SettingsNetPage SettingsPage;

    public SettingsNetSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        SettingsNetPage loginPage = getPages().get(SettingsNetPage.class);
        loginPage.open();
    }

    @Step("Клик на ссылку - <strong>Настройки сети</strong>" )

    public void addSettingsNet() {
        SettingsPage.setSettingsNet();
    }


    @Step("Клик - 'Использовать все IP адреса'")
    public void addCheckBox() throws InterruptedException{
        SettingsPage.setCheckBox();
        }
    @Step("Клик - 'Добавить Ip адрес' ")
    public void addIpNet() throws InterruptedException{
        SettingsPage.setAddIpNet();
    }

    @Step("Клик - 'Сброс Ip адрес' ")
    public void addResetNet() throws InterruptedException{
        SettingsPage.setResetNet();
    }

    @Step("Клик - 'Применить Ip адрес' ")
    public void addApply() throws InterruptedException{
        SettingsPage.setApply();
    }
    @Step("Применить")
    public void addRestart() throws InterruptedException{
        SettingsPage.setRestart();
    }

}


