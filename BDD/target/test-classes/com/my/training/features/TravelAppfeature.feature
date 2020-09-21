Feature: travel app
In order to check the login capabilities
as a customer
I use this site

Background:
Given I navigate to the site

Scenario: registration and login validation
Given I am on the HomePage
And I click on MyAccount
And I enter login
And I enter the details
| email | password |
|shahbano776@gmail.com | Pull14shah0|
Then I navigate to the welcome page
