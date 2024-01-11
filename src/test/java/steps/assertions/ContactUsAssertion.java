package steps.assertions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;

public class ContactUsAssertion {

    ContactUsPage contactUsPage = new ContactUsPage();

    @Then("[UI] Validation message about invalid email should displays")
    public void uiValidationMessageAboutInvalidEmailShouldDisplays() {
        contactUsPage.getEmailErrorMessage().shouldHave(Condition.exactText("Your e-mail address must be in the following format: name@domain.com"));
    }

    @Then("[UI] Captcha block should displays")
    public void uiCaptchaBlockShouldDisplays() {
        contactUsPage.getCaptchaDiv().shouldBe(Condition.appear);
    }
}
