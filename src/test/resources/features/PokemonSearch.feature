@Web
Feature: Get Pokemon Data From API And Search Pokemon on Wikipedia Indonesia by Using Google

  # Pikachu
  Scenario: Search Pikachu data and search it information
    Given User get the name and id data of pokemon with name "Pikachu"
    And User open Google search-page
    When User input "Pikachu" Wikipedia Indonesia on input search bar on Google search-page
    And User press ENTER key on input search bar
    And User click the first article of "Pikachu" on the result-page
    Then User see pokemon article with the pokemon name same as API Data
    And User see pokemon article with the pokemon ID same as API Data

  # Charizard
  Scenario: Search Charizard data and search it information
    Given User get the name and id data of pokemon with name "Charizard"
    And User open Google search-page
    When User input "Charizard" Wikipedia Indonesia on input search bar on Google search-page
    And User press ENTER key on input search bar
    And User click the first article of "Charizard" on the result-page
    Then User see pokemon article with the pokemon name same as API Data
    And User see pokemon article with the pokemon ID same as API Data

  # Bulbasaur
  Scenario: Search Bulbasaur data and search it information
    Given User get the name and id data of pokemon with name "Bulbasaur"
    And User open Google search-page
    When User input "Bulbasaur" Wikipedia Indonesia on input search bar on Google search-page
    And User press ENTER key on input search bar
    And User click the first article of "Bulbasaur" on the result-page
    Then User see pokemon article with the pokemon name same as API Data
    And User see pokemon article with the pokemon ID same as API Data

  # Mewtwo
  Scenario: Search Mewtwo data and search it information
    Given User get the name and id data of pokemon with name "Mewtwo"
    And User open Google search-page
    When User input "Mewtwo" Wikipedia Indonesia on input search bar on Google search-page
    And User press ENTER key on input search bar
    And User click the first article of "Mewtwo" on the result-page
    Then User see pokemon article with the pokemon name same as API Data
    And User see pokemon article with the pokemon ID same as API Data


