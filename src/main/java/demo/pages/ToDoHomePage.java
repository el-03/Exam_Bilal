package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoHomePage {

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed(); // Checking if it is displayed
    }

    public void pressAddButton() {
        AndroidElement addButton = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        addButton.click();
    }

    public String getNewToDoTitle(String text) {
        String path = String.format("//android.widget.TextView[@text = '%s']", text);
        AndroidElement newToDoTitle = AndroidDriverInstance.androidDriver.findElement(By.xpath(path));
    return newToDoTitle.getText();
    }

    public void pressCheckColumn(int elNum) {
        String path = String.format("//android.widget.LinearLayout[%s]/android.widget.CheckBox", elNum);
        AndroidElement checkColumn = AndroidDriverInstance.androidDriver.findElement(By.xpath(path));
        checkColumn.click();
    }

    public String checkCheckColumn(int elNum) {
        String path = String.format("//android.widget.LinearLayout[%s]/android.widget.CheckBox", elNum);
        AndroidElement checkColumn = AndroidDriverInstance.androidDriver.findElement(By.xpath(path));
        return checkColumn.getAttribute("checked") ;
    }

    public void pressFilterMenu() {
        AndroidElement filterMenu = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filterMenu.click();
    }

    public void pressActive() {
        AndroidElement active = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        active.click();
    }

    public void pressCompleted() {
        AndroidElement completed = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
        completed.click();
    }

    public void pressMore() {
        AndroidElement more = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
        more.click();
    }

    public void pressRefresh() {
        AndroidElement refresh = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        refresh.click();
    }



    public void pressClear() {
        AndroidElement clear = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
        clear.click();
    }

}
