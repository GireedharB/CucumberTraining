package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExerciseHooks {

    public static WebDriver driver;

    @Before(order = 1)
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println("Browser setup done sucessfully");
    }
    @Before(order = 2)
    public void HitURL(){
        driver.get("https://automationexercise.com/login");
        System.out.println("Url Launched Sucessfully");
    }

    @After
    public void TearDown(){
        driver.close();
        System.out.println("driver closed sucessfully.");
    }
}
