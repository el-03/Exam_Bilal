package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class NewToDoPage {

    public void inputNewToDo(String toDoInput) {
        AndroidElement inputBar = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputBar.sendKeys(toDoInput);
    }

    public void pressDoneButton() {
        AndroidElement addButton = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        addButton.click();
    }
}
