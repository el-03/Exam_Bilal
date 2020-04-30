@Android
Feature: Clearing To-Do App

  @ClearToDo
  Scenario: Clearing when there is only 1 To-Do list
    Given there is one to do task on to do home page with the title of "Going to shopping"
    And The column is checked
    When User press more options menu
    And User press clear completed text
    Then Complete task is cleared
