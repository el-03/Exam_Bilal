package demo.steps;

import demo.pages.NewToDoPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterActiveStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    NewToDoPage newToDoPage = new NewToDoPage();

    @Given("There is To-Do entitled of {string}")
    public void thereIsToDoEntitledOf(String text) {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
        toDoHomePage.pressAddButton();
        newToDoPage.inputNewToDo(text);
        newToDoPage.pressDoneButton();
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }

    @Given("There is also To-Do entitled of {string}")
    public void thereIsAlsoToDoEntitledOf(String text) {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
        toDoHomePage.pressAddButton();
        newToDoPage.inputNewToDo(text);
        newToDoPage.pressDoneButton();
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }

    @Given("Going to jogging To-Do is checked")
    public void goingToJoggingToDoIsChecked() {
        toDoHomePage.pressCheckColumn(2);
        Boolean status = Boolean.valueOf(toDoHomePage.checkCheckColumn(2));
        Assert.assertEquals(true, status);
    }

    @When("Filter icon is pressed")
    public void filterIconIsPressed() {
        toDoHomePage.pressFilterMenu();
    }

    @When("Active text is pressed")
    public void activeTextIsPressed() {
        toDoHomePage.pressActive();
    }


    @Then("There is only To-Do entitled of {string}")
    public void thereIsOnlyToDoEntitledOf(String text) {
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }
}
