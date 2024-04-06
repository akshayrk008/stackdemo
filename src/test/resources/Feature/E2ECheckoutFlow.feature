@E2ECheckout
Feature: validate E2E Checkout

  Scenario Outline: validate E2E Checkout
    Given user is On HomePage
    When user click on any item
    And click on cart icon
    And click on checkout button
    And enters "<FirstName>" and "<LastName>" and "<ZipCode>"
    And click on continue Button
    And click on finish button
    Then order placed successfully
    And user navigate back to home screen after successfull order
    Examples:
      | FirstName | LastName | ZipCode |
      | akshay    | kulkarni | 10358   |