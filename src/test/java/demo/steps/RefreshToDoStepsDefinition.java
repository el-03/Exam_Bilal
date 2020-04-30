package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RefreshToDoStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User press more options menu")
    public void userPressMoreOptionsMenu() {
        toDoHomePage.pressMore();
    }

    @When("User press refresh text")
    public void userPressRefreshText() {
        toDoHomePage.pressRefresh();
    }

    @Then("The app is refreshed")
    public void theAppIsRefreshed() {
    }
}
