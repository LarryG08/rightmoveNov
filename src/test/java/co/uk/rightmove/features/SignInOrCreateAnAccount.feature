Feature: Sign in or create an account
  As a customer looking for property to rent or buy
  I want to have a personal online account so that I can manage my activities
  Scenario Outline:
    Given I navigate to the homepage
    And I accept all cookies
    When I click on sign in or create an account
    And I enter my "<emailAddress>"
    And I click on continue button
    And I enter my "<firstName>"
    And I enter my "<lastName>"
    And I enter my "<postCode>"
    And I enter my "<passWord>"
    And checked the stay signed in box
    And I click create account button
    Then Your communication preferences page should diplay
    Examples: Test data for account creation
      | emailAddress             | firstName | lastName | postCode | passWord         |
      | larrygbadegesin@gmail.com | Lanre      | Test      | GU15 1RD  | CreateAccount123 |