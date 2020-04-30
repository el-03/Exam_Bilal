package demo.steps;

import demo.pages.NewToDoPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UncheckToDoStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    NewToDoPage newToDoPage = new NewToDoPage();

    @Given("There is one to do task on to do home page with the title of {string}")
    public void thereIsOneToDoTaskOnToDoHomePageWithTheTitleOf(String text) {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
        toDoHomePage.pressAddButton();
        newToDoPage.inputNewToDo(text);
        newToDoPage.pressDoneButton();
        String newToDo = toDoHomePage.getNewToDoTitle(text);
        Assert.assertEquals(text, newToDo);
    }

    @Given("The column is checked")
    public void theColumnIsChecked() {
        toDoHomePage.pressCheckColumn(1);
        Boolean status = Boolean.valueOf(toDoHomePage.checkCheckColumn(1));
        Assert.assertEquals(true, status);
    }

    @When("User press the checked column besides the title in the to do home page")
    public void userPressTheCheckedColumnBesidesTheTitleInTheToDoHomePage() {
        toDoHomePage.pressCheckColumn(1);
    }

    @Then("The check column turns un-checked")
    public void theCheckColumnTurnsUnChecked() {
        Boolean status = Boolean.valueOf(toDoHomePage.checkCheckColumn(1));
        Assert.assertEquals(false, status);
    }

}
