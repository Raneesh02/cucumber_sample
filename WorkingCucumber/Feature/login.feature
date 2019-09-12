Feature: Login Action
Background: User is Logged In
 Given I navigate to the login page
 When I submit username and password
 Then I should be logged in 
 
Scenario Outline: Successful Login with Valid Credentials
    User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |

@DataTable
Scenario: Successful Login with Valid Credentials Datatable
    Given User is on Home Page
    * User Navigate to LogIn Page
    And User enters credentials
    | Username   | Password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@154 |
    Then Message displayed Login Successfully


  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

