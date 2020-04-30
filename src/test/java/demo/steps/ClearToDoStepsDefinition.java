package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClearToDoStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User press clear completed text")
    public void userPressClearCompletedText() {
        toDoHomePage.pressClear();
    }


    @Then("Complete task is cleared")
    public void completeTaskIsCleared() {
    }
}
