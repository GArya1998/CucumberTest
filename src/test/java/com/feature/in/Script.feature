Feature: Verify the PHPTravelsDemo application home page.

  Scenario: Verify the Instant Demo Request Form using Firstname,Lastname,Bussiness name and Email.
  
    Given page should be launched.
    When user enters the Firstname in the First Name field.
    And user enters LastName in the Last Name field.
    And user enters Businessname in the Business Name field.
    And user enters email in the Email field.
    Then click on Submit button.
    

 