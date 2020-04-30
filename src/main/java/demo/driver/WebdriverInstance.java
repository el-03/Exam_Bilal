package demo.driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebdriverInstance {

    public static WebDriver driver;

    public static void initialize() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito", "--disable-infobars"); // Add some options

        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC); // Optional, only as an info
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME); // Optional, only as an info

        driver = new ChromeDriver(options); // Create the WebDriver object

        driver.manage().window().maximize(); // Add a screen option

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Set the implicit timeout
    }

    public static void quit() {
        driver.quit(); // Quit the browser
    }
}
