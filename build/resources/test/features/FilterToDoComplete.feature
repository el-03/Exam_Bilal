@Android
Feature: Filtering To-Do for "Complete" only

  @FilterComplete
  Scenario: Filtering 2 To-Do
    Given There is To-Do entitled of "Going to shopping"
    And There is also To-Do entitled of "Going to jogging"
    And Going to jogging To-Do is checked
    When Filter icon is pressed
    And Completed text is pressed
    Then There is only To-Do entitled of "Going to jogging"