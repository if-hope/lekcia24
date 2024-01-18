@regression
Feature: Email Validation in ContactUs form

  Scenario Outline: User can see email validation message after fill email field in ContactUs form with invalid data
    Given [UI] User opens Who We Are page
    When [UI] User fill ContactUs form with data <name>, <email>, <textArea>
    Then [UI] Validation message about invalid email should displays


    Examples:
      | name  | email  | textArea              |
      | Nadia | email  | Some     text message |
      | Nad   | email@ | Some text message jh  |
