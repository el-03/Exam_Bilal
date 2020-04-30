package demo.steps;

import demo.pages.NewToDoPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckToDoStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    NewToDoPage newToDoPage = new NewToDoPage();

    @Given("there is one to do task on to do home page with the title of {string}")
    public void thereIsOneToDoTaskOnToDoHomePageWithTheTitleOf(String text) {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
        toDoHomePage.pressAddButton();
        newToDoPage.inputNewToDo(text);
        newToDoPage.pressDoneButton();
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }

    @When("User press the unchecked column besides the title in the to do home page")
    public void userPressTheUncheckedColumnBesidesTheTitleInTheToDoHomePage() {
        toDoHomePage.pressCheckColumn(1);
    }

    @Then("The check column turns checked")
    public void theCheckColumnTurnsChecked() {
        Boolean status = Boolean.valueOf(toDoHomePage.checkCheckColumn(1));
        Assert.assertEquals(true, status);
    }
}
