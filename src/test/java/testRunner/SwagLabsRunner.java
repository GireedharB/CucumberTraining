package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\ADMIN\\IdeaProjects\\CucumberBDDFramework\\Features\\SwagLabs.feature"},
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        tags="@Smoke and @Sanity",
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        }
)

public class SwagLabsRunner {

}
