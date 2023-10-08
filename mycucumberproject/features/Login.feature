#Author: your.email@your.domain.com
Feature: Login feature of Orange HR application
  Here I am maintaing all the test scenarios of Login feature of Orange HR application

  Background: 
    Given user is on the browser
    When user navigated to the login page

  Scenario: Test the login with valid credentials
    And user enters user name as 'Admin' and password as 'admin123'
    And click on Login button
    Then the home page is displayed
    And close the browser

  Scenario: Test the login with invalid credentials
    And user enters user name as 'Admin' and password as '839084'
    And click on Login button
    Then error message is displayed in Login page
    And close the browser

  Scenario Outline: Test login with various credentials
    And user enters user name as '<username>' and password as '<password>'
    And click on Login button
    Then error message is displayed in Login page
    And close the browser

    Examples: 
      | username | password |
      | user1    | welcome1 |
      | user2    | xyz212   |

  Scenario Outline: Test login with various credentials
    And user enters user name as '<username>' and password as '<password>'
    And click on Login button
    Then error message is displayed in Login page '<validLogin>'
    And close the browser

    Examples: 
      | username | password |validLogin|
      | user1    | welcome1 |true|
      | user2    | xyz212   |false|
