
@FindCenter
 Feature: Day Care Center Search

  As a user on the home page
  I want to search for day care centers by zipcode
  So that I can see a list of nearby day care facilities

  Scenario Outline: User searches for day care centers by zipcode and sees a list of facilities
    Given the user is on the home page
    When the user clicks on Find a center
    And the user enters a valid <zipcode> into the search field
    And the user clicks on the search button
    Then the user should see a list of day care facilities in that zipcode area

    Examples: 
     | zipcode  | radius |
     | 55434    | 15     |
