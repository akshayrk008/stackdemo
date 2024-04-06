Feature: validate login scenario

  Scenario Outline: Check login with valid credentials
    Given user is on the login page
    When user enters valid "<username>" and "<password>"
    Then clicks on login button
    And user navigated to home page
    Examples:
      | username | password       |
      | demouser | testingisfun99 |