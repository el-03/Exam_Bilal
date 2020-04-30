@Android
Feature: Checking The To Do Check Column

  @CheckToDo
  Scenario: Checking One To Do Check Column
    Given there is one to do task on to do home page with the title of "Going to shopping"
    When User press the unchecked column besides the title in the to do home page
    Then The check column turns checked