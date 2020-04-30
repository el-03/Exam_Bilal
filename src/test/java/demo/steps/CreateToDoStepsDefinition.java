package demo.steps;

import demo.pages.NewToDoPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateToDoStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    NewToDoPage newToDoPage = new NewToDoPage();

    @Given("User is on all to do list page")
    public void userIsOnAllToDoListPage() {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
    }

    @When("User press the add button on to do home page")
    public void userPressTheAddButtonOnToDoHomePage() {
        toDoHomePage.pressAddButton();
    }

    @When("User input {string} in input bar on New To-Do page")
    public void userInputInInputBarOnNewToDoPage(String text) {
        newToDoPage.inputNewToDo(text);
    }

    @When("User press done button on New To-Do page")
    public void userPressDoneButtonOnNewToDoPage() {
        newToDoPage.pressDoneButton();
    }

    @Then("User can see a new To-Do with the title of {string} on to do home page")
    public void userCanSeeANewToDoWithTheTitleOfOnToDoHomePage(String text) {
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }
}
