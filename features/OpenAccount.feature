@tag
Feature: Open credit card account

  @dataprovider
  Scenario Outline: Navigation to the credit card open account page
    Given The user is in home page
    Then the user  clicks on Open Account
    Then the user  clicks on credit card
    Then the user clicks on card details
    And the subheading will be
    When the user clicks Apply Now
    Then the url of the page is
    And the user clicks Start
    And the url of this page is
    When The user clicks No
    And the user inputs zipcode
    Then The user clicks continue
    And The subheading of the page is
    Given The user is in personal info form page
    When the user write first name <first name>
    And the user write last name "<last name>"
    Then the user opens citizenship question
    And the user selects permanent resident
    Then the user inputs dob <DOB>
    And the user inputs SSN <SSN>

    Examples: 
      | first name | last name | DOB      | SSN         |
      | 'Brian'    | Mondol    | 11101995 | '500504000' |
      | 'Robi'     | Margot    | 11101998 | '500505000' |
