Feature: test searching something on Google
  Scenario: validate google search is working
    Given open the Browser
    And user is on Google search page
    When user enters a text in google search
    And hits Enter
    Then user is navigated to search result

