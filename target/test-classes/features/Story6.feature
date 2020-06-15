@tag
Feature: Title of your feature

  Background: 
    And user is logged with valid admin credentials
    Then user navigate employee search page

  @Story6
  Scenario Outline: modify employee qualification
    Given admin search employee "<Id>"
    And navigate to Personal Details page and click Qualification
    Then modified employee "<skill>","<yearsExperience>","<Comments>"

    Examples: 
      | Id    | skill     | yearsExperience | Comments             |
      | 12674 | Open mind |               3 | learning fast        |
      | 10518 | Creative  |               2 | thinking differently |
 #As an admin user should be able to add employee's skills by specifiying 
