$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ClearToDo.feature");
formatter.feature({
  "name": "Clearing To-Do App",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Android"
    }
  ]
});
formatter.scenario({
  "name": "Clearing when there is only 1 To-Do list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@ClearToDo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "there is one to do task on to do home page with the title of \"Going to shopping\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.steps.CheckToDoStepsDefinition.thereIsOneToDoTaskOnToDoHomePageWithTheTitleOf(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The column is checked",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.UncheckToDoStepsDefinition.theColumnIsChecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User press more options menu",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.RefreshToDoStepsDefinition.userPressMoreOptionsMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User press clear completed text",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.ClearToDoStepsDefinition.userPressClearCompletedText()"
});
