package steps.definitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ContactUsPage;

public class ContactUsDefinition {

    ContactUsPage contactUsPage = new ContactUsPage();

    @When("\\[UI] User fill ContactUs form with data (.*), (.*), (.*)$")
    public void uiUserFillContactUsFormWithDataNameEmailTextArea(String name, String email, String textArea) {
        contactUsPage.fillForm(name, email, textArea);

    }

    @When("[UI] User check Privacy Policy checkbox")
    public void uiUserCheckPrivacyPolicyCheckbox() {
        contactUsPage.checkPrivacyPolicy();
    }


    @Given("[UI] User opens Who We Are page")
    public void uiUserOpensWhoWeArePage() {
        contactUsPage.openContactUsPage();
    }
}
