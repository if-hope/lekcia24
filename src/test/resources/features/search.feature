@regression
Feature: Search feature

  Scenario Outline: User can see relevant search results after filling Search form with search request
    When [UI] User fill Search form with data <text>
    Then [UI] Relevant search results should appear

    Examples:
      | text |
      | test |