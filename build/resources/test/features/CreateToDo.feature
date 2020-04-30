@Android
Feature: Creating To-Do on To-Do-MVP App

  @Create1ToDo
  Scenario: Creating To-Do with string input data
    Given User is on all to do list page
    When User press the add button on to do home page
    And User input "Going to shopping" in input bar on New To-Do page
    And User press done button on New To-Do page
    Then User can see a new To-Do with the title of "Going to shopping" on to do home page


