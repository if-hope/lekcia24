package steps.definitions;

import io.cucumber.java.en.When;
import pages.ContactUsPage;

public class ContactUsDefinition {

    ContactUsPage contactUsPage = new ContactUsPage();

    @When("\\[UI] User fill ContactUs form with data (.*), (.*), (.*)$")
    public void uiUserFillContactUsFormWithDataNameEmailTextArea(String name, String email, String textArea) {
        contactUsPage.openContactUsPage()
                .fillForm(name, email, textArea);

    }

    @When("[UI] User check Privacy Policy checkbox")
    public void uiUserCheckPrivacyPolicyCheckbox() {
        contactUsPage.checkPrivacyPolicy();
    }
}
