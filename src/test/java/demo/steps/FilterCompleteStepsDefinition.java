package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;

public class FilterCompleteStepsDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @And("Completed text is pressed")
    public void completedTextIsPressed() {
        toDoHomePage.pressCompleted();
    }
}
