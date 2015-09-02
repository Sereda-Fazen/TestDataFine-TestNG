package steps.SettingsSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Settings.SettingsPage;


public class SettingsSteps extends ScenarioSteps {
    SettingsPage SettingsPage;

    public SettingsSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        SettingsPage loginPage = getPages().get(SettingsPage.class);
        loginPage.open();
    }

    @Step("Клик на ссылку - <strong>Настройки</strong>" )

    public void addSettings() {
        SettingsPage.setSettings();
    }


    /*Путь к папке*/
    @Step("Клик на путь")
    public void addPath2() throws InterruptedException{
         }
    @Step("Выбор папки")
    public void addPath3() throws InterruptedException{
        }
    @Step("Применить")
    public void addPath4() throws InterruptedException{
        SettingsPage.setPath();  }
    @Step ("Выбор пути для папки")
    public void addPath () throws InterruptedException {
        addPath2();
        addPath3();
        addPath4();

    }

    /*Отчеты*/
    @Step("Клик чекбокс")
    public void addReports2() throws InterruptedException{
    }
    @Step("Просмотр журнала")
    public void addReports3() throws InterruptedException{
    }
    @Step("Отчет использования")
    public void addReports4() throws InterruptedException{
        SettingsPage.setReports();  }
    @Step ("Отчеты ")
    public void addReports () throws InterruptedException {
        addReports2();
        addReports3();
        addReports4();

    }

    /*Конфинурация*/
    @Step("Конфигурации")
    public void addConfig() throws InterruptedException {
        SettingsPage.setConfig();
    }



    /*Приложения*/
    @Step("Клик TrueConf для Windows")
    public void addApp2() throws InterruptedException{
    }
    @Step("Клик TrueConf для MacOS")
    public void addApp3() throws InterruptedException{
        SettingsPage.setApp();  }
    @Step ("Приложения")
    public void addApp () throws InterruptedException {
        addApp2();
        addApp3();
    }


    /*Настройки приложения*/

    @Step("Ввод ключа для гостевых соединений")
    public void addSetApp2() throws InterruptedException{
    }
    @Step("Выбор ограничение битрейта пользователя")
    public void addSetApp3() throws InterruptedException{
    }
    @Step("Выбор FPS пользователя")
    public void addSetApp4() throws InterruptedException{
    }
    @Step("Выбор ограничение размера кадра в пикселях")
    public void addSetApp5() throws InterruptedException{
        SettingsPage.setSetApp();
         }
    @Step ("Настройки приложения")

    public void addSetApp () throws InterruptedException {
        addSetApp2();
        addSetApp3();
        addSetApp4();
        addSetApp5();

    }

    @Step ("Клик 'Сохранить'")
    public void addSet() {SettingsPage.setSet();}

    @Step ("Ожидаемый результат - <strong>Настройки сохранены</strong>")
    public void addAssert() {SettingsPage.setAssert();}




}


