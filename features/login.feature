@tag
Feature: login to walmart

  @tag1
  Scenario: successfully login with valid credential
    Given user is on the homepage
    When user click source Sign in button
    And user enters email
    And user enters  password
    And user click sign in button
    Then user capture page title
    Then user close the browser

  @tag2
  Scenario Outline: login to walmart with valid credential
    Given user want to sign into walmart website
    When user enter "<email>" address and "<password>"
    Then user click sign up button

    Examples: 
      | email              | password         |
      | jannat10@gmail.com | JannatulJamila10 |
      