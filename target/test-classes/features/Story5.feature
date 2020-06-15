
@story5
Feature: As an admin user should be able to add different skills in qualifications

  

  @tag1
  Scenario: add skills in qualification
    And user is logged with valid admin credentials
    Then navigated to qualification page and click add button
    And user modified different skills "User Friendly" and "can be work any person"
   
   

 
