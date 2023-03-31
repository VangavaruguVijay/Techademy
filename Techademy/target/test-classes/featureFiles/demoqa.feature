
@tag
Feature: Register new user to a book store and login to the book store, choose any book and logout.
  
  @tag2
  Scenario Outline: Register a new user to the book store
    Given URL is launched and user is on login page
    When User enters "<firstName>", "<lastName>","<userName>","<password>" and click on register button
    Then User should be registered succesfully

    Examples: 
      | firstName  | lastName | userName  |	password	|
      | Vijaya		 | Bhaskar  | vvireddy  |	Test@1234		|
     

    Scenario Outline: Login to the book store using registered username and password
    Given user is on register page and click on BackToLogin button
    When User enters "<userName>","<password>" and click on login button
    Then User should be logged in succesfully
    

    Examples: 
     | userName  |	password	|
     | vvireddy  |	Test@1234	|
     
     
      Scenario Outline: Add a book to collections and logout from the book store
    Given user is on home page of book store
    When User select a book and click on Add to collection button
    Then Book should be added to collection
    And User should be logged out succesfully
    

    Examples: 
     | userName  |	password	|
     | vvireddy  |	Test@1234	|