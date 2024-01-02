Feature:  Validating login functionality of an application

 # Scenario:User is able to login into the application successfully
  #Given User navigates to the application page
  #When User provides login details
  #And User clicks on login
  #Then User is navigated to the dashboard page


  Scenario Outline: User login in functionality with multiple test data
    Given User navigates to the application page
    When User provides login details "<Userid>","<pwd>"
    And User clicks on login
    Then User is navigated to the dashboard page
 Examples:
    |Userid|pwd|
    |gfdd |1234|
    |adrdsff |124|
    |swad|134|

