package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.GroupConference;


public class GroupConferenceSteps extends ScenarioSteps {
    GroupConference ConferonPage;

    public GroupConferenceSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        GroupConference loginPage = getPages().get(GroupConference.class);
        loginPage.open();
    }


    @Step("РљР»РёРєРЅСѓР» 'Р“СЂСѓРїРїРѕРІС‹Рµ РєРѕРЅС„РµСЂРµРЅС†РёРё' ")
    public void addGroupConf() {
        ConferonPage.setGroupConf();
    }

    @Step("РљР»РёРєРЅСѓР» 'РЎРѕР·РґР°С‚СЊ'")
    public void addCreateConf(){
        ConferonPage.setCreateConf();
    }

    @Step("Р’РІРµР» РёРјСЏ РіСЂСѓРїРїС‹' ")
    public void addName() {
        ConferonPage.setName();
    }

    @Step("РљР»РёРєРЅСѓР» 'РЎРѕС…СЂР°РЅРёС‚СЊ' ")
    public void addSave() {
        ConferonPage.setSave();


    }
}


