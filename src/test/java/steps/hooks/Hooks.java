package steps.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static void startBrowser(){
        Configuration.browser = "chrome";

    }

    @After
    public static void quitBrowser(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
