@regression
Feature: Captcha appearing in ContactUs form

  Scenario Outline: User can see captcha block after filling ContactUs form and checking PrivacyPolicy checkbox
    Given [UI] User opens Who We Are page
    When [UI] User fill ContactUs form with data <name>, <email>, <textArea>
    When [UI] User check Privacy Policy checkbox
    Then [UI] Captcha block should displays


    Examples:
      | name  | email                  | textArea          |
      | Nadia | tester234532@gmail.com | Some text message |
