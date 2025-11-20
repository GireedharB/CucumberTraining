package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\ADMIN\\IdeaProjects\\CucumberBDDFramework\\Features\\AutomationExercise.feature"},
        glue = {"stepDefinition","Hooks"},
        dryRun = false,
        tags = "@all",
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        }
)


public class AutomationExerciseRunner {

}
