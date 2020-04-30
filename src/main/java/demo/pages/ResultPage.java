package demo.pages;

import demo.driver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultPage {

    // Click the first article result
    public void clickFirstArticle(String pokemonName) {
        String path = String.format("//h3 [text() = '%s - Wikipedia bahasa Indonesia, ensiklopedia bebas']", pokemonName);
        WebElement pokemonArticle = WebdriverInstance.driver.findElement(By
                .xpath(path));
        pokemonArticle.click();
    }
}
