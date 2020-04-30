package demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Android and @ClearToDo"} // or --> Running the feature that has @Android OR @Web tags
        // and --> Running the feature that has @Android AND @Web tags
)
public class CucumberRunner {
}
