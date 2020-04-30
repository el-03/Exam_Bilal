package demo.pages;

import demo.driver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePage {

    public String getName() {
        WebDriverWait explicitWait = new WebDriverWait(WebdriverInstance.driver, 10);
        // Find the article heading element
        WebElement pokemonName = explicitWait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading"))); // find the element

        return pokemonName.getText();
    }

    public String getNumber() {
        WebDriverWait explicitWait = new WebDriverWait(WebdriverInstance.driver, 10);
        WebElement pokemonId = explicitWait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//big/b/abbr"))); // find the element

        return pokemonId.getText();
    }
}
