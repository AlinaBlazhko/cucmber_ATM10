import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import emailpages.CenterPart;

import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static divermanager.WebDriverSingleton.kill;

/**
 * Created by X240 on 8/21/2018.
 */
public class MyHoocs {
    @Before
    public void setUp(){
    }

    @After
    public void after(){
        new CenterPart().deleteAllDraftsFromFolder();
        kill();
    }
}
