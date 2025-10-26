package stepDefinition;

import Hooks.AutomationExerciseHooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static Hooks.AutomationExerciseHooks.driver;

public class AutomationExerciseSteps  {


    @Given("Verify whether user is on automation exercise page")
    public void verify_whether_user_is_on_automation_exercise_page() {
        String expectedTitle="Automation Exercise - Signup / Login";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
    @When("User enters username and password in respective field")
    public void user_enters_username_and_password_in_respective_field() {
        driver.findElement(By.name("email")).sendKeys("gireedharbirajdar1011@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Gireedhar10#");

    }
    @Then("User clicks on Login button on login page")
    public void user_clicks_on_login_button_on_login_page() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();

    }
    @Then("User verify title of page")
    public void user_verify_title_of_page() throws InterruptedException {
        String expectedTitle="Automation Exercise";
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    @Then("User verify title of product page")
    public void user_verify_title_of_product_page() {
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
        String expectedTitle="Automation Exercise - All Products";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
    @Then("User clicks on men category")
    public void user_clicks_on_men_category() {
        driver.findElement(By.xpath("//a[@href=\"#Men\"]")).click();

    }
    @Then("Select Tshirts sub category")
    public void select_tshirts_sub_category(){
        driver.findElement(By.xpath("//a[text()='Tshirts ']")).click();
    }

}
