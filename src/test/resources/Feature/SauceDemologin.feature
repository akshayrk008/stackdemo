Feature: validate login functionality

  @SauceDemo
  Scenario Outline: validate login functionality with valid login
    Given user is on the sauce demo login page
    When user enter "<username>" and "<password>"
    Then After clicking on login button user should be landed on home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
