Feature:Tima Navigation Galavail 
Navigate Galavail as user and select year and month in 

Scenario: User is able to login with valid credentials
    Given Navitage to the login page
    When I enter valid credentials
    And I click on login button
    Then I should be able to login successfully
    #When I go to a section usign the navigation bar
    
    
