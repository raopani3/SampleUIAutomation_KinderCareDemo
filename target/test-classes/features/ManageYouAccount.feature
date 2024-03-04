@ManageAccount
Feature: Account Management Access

  As a user on the Homepage
  I want to click on "Manage your account"
  So that I am redirected to the Family Connection Login Page
  I can verify that I can log in



  Scenario: User is redirected to the Family Connection Login Page and can log in
    Given the user is on the Homepage
    When the user clicks on Login
    Then the user should be redirected to the Family Connection Login Page
    When the user enters valid "raopani3@gmail.com" and "test@123" credentials
    And the user clicks on the login button
    Then the user should be logged in successfully