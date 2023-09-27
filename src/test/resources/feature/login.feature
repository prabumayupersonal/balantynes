@login
Feature: User Login

  Background: 
    Given a user is on the home page
    When user clcik login link
    Then user should be navigated to login page

  @valid
  Scenario Outline: Login with valid credential
    Given a user is on the login page
    When user enter valid information (email, password) "<email>" "<password>"
    And user click login button
    Then user should verify login successfully

    @valid
    Examples: 
      | email                     | password   |
      | prabuchinnasamy@gmail.com | mayusri*1A |

    @invalid
    Examples: 
      | email                        | password     |
      | prabuchinnasamy@gmailprs.com | mayusri*1A55 |
