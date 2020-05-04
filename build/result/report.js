$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PokemonSearch.feature");
formatter.feature({
  "name": "Get Pokemon Data From API And Search Pokemon on Wikipedia Indonesia by Using Google",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Web"
    }
  ]
});
formatter.scenario({
  "name": "Search Pikachu data and search it information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Web"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User get the name and id data of pokemon with name \"Pikachu\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.steps.PokemonStepsDefinition.userGetTheNameAndIdDataOfPokemonWithName(java.lang.String)"
});
