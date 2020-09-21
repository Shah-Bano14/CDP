Feature: Amazon HomePage Functionality Check
  
  Background:
  Given I navigate to amazon HomePage

@abc 
  Scenario Outline: The user verifies the Count of search Result on clicking Prime button on Search Page
   When I search using "<search Term>"
   And I count the search result on the page
   And I click on Prime button"
   And I count the search result on the page
   Then I print the result list
  
   Examples:
 |search Term |
 | Mobile  |
 | wallet  |
  
@fgh
  Scenario: The user verifies the adding item to cart functionality.
  When I enter search Term
  |search Term| Mobile |
  And I select an Item
  And I checkout the selected item
  Then I verify the title of the page should be "Amazon.in : Mobile"
  
  

   
 