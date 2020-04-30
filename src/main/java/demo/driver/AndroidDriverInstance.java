package demo.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.lang.reflect.MalformedParametersException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {

    public static AndroidDriver<AndroidElement> androidDriver;

    public static void initialize() {
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/"; // Appium local sever address declaration

        DesiredCapabilities caps = new DesiredCapabilities(); // Set the devices props.
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("app", "/Users/bilalelbari/Downloads/TodoApp.apk");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("udid", "89ORQWHMW45PMRMF");

        // Implicit wait when loading the apps element
        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        androidDriver.quit(); // Quit the app
    }
}
