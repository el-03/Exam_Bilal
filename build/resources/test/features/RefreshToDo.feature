@Android
Feature: Refreshing To-Do App

  @Refresh
  Scenario: Refreshing when there is only 1 To-Do list
    Given there is one to do task on to do home page with the title of "Going to shopping"
    When User press more options menu
    And User press refresh text
    Then The app is refreshed
