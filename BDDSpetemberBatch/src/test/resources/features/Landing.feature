#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@LandingCS @Regression @Sanity
Feature: VAlidate Customer service page banner
  I want VAlidate homepage/Landing page banner

  @bannervalidation 
  Scenario: Validate CS tiles
    Given I am on CS page
  	Then I see 9 tiles
   Then I see 9 learn more buttons

   
    @Regression 
    Scenario Outline: Validate Signup page
    Given I click on sign up button

    Then I see "<Email>" field
    
    Then I see "<FN>" field and enter the value
    And I see "<Ln>" field to enter the value
    And I see "<Postalcode>" filed to enter the data
    
    Examples:
    |Email|FN|Ln|Postalcode|
    |abc@gmail.com|Pooja|kapoor|L7a2g5|
    |xyz@gmail.com|duke|Ton|L6y4g5|
    |cbd@gmial.com|george|ton|h3t5ht|
    
    
  
  
 
