package demo.pages;

import demo.driver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage {
    // Go to web-page
    public void openSearchPage() {
        WebdriverInstance.driver.get("https://www.google.com");
    }

    // Finding search-input bar, and typing "<pokemonName>"
    public void inputSearch(String pokemonName) {
        WebElement inputSearch = WebdriverInstance.driver.findElement(By.xpath("//input[@name = 'q']"));
        inputSearch.sendKeys(pokemonName);
    }

    // Press ENTER key
    public void pressEnter() {
        WebElement inputSearch = WebdriverInstance.driver.findElement(By.xpath("//input[@name = 'q']"));
        inputSearch.sendKeys(Keys.ENTER);
    }

}
