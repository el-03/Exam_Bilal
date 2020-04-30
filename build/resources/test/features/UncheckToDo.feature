@Android
Feature: Un-checking The To Do Check Column

  @Uncheck
  Scenario: Un-Checking One To Do Check Column
    Given There is one to do task on to do home page with the title of "Going to shopping"
    And The column is checked
    When User press the checked column besides the title in the to do home page
    Then The check column turns un-checked