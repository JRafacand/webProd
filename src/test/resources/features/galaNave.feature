Feature: Navigation Galavail 
Navigate Galavail as user and select year and month in 

Background: Login sucessfully 
    Given I am on the login page
    When I enter valid credentials
    Then I should be able to login successfully
 
Scenario: User is able to login with valid credentials
    Given Navitage to the login page
    When I go to a section using the navigation bar
    Then I go to navigate section Fleet Management

Scenario: Validate selector content  
   When I click in Action menu
   Then I should see the following options
 
Scenario Outline: Navigate in different years and months
    Given Input boat Galapagos
    When I select year <year> and month <month>
    Then I should see the following options
    When I go to a section using the navigation bar
    Then I go to navigate section <section>
    
    Examples: 
    |section|
    |Fleet Management|
    |Management|
    |My Activity    |
    |Notifications  |
    |Log-out|   
 # Examples: 
 # |section|
 # |Fleet Management|
 # |Management|
 # |My Activity    |
 # |Notifications  |
 # |Log-out|
    #Then I should be able to login successfully
    
    
    
