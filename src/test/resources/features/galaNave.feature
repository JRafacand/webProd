Feature: Navigation Galavail 
Navigate Galavail as user and select year and month in 

Scenario: User is able to login with valid credentials
    Given Navitage to the login page
    When I go to a section using the navigation bar
Scenario Outline: Navigat to a section bar link  
    When I go to a "<section>" in navigate link
    Examples: 
    |section|
    |Fleet Management|
    |Management|
    |My Activity    |
    |Notifications  |
    |Log-out|
    #Then I should be able to login successfully
    
    
    
