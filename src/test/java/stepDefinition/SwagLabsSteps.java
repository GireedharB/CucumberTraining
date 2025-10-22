package stepDefinition;


import POM.SwagLabsLoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class SwagLabsSteps {

    public WebDriver driver;
    public SwagLabsLoginPage lp ;

    @Given("User launch browser")
    public void user_launch_browser() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        lp = new SwagLabsLoginPage(driver);

    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);

    }
    @And("User enters Username as {string} and Password as {string}")
    public void user_enters_username_as_and_password_as(String us, String pass) throws InterruptedException {
        lp.setUsername(us);
        lp.setPassword(pass);

    }
    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
        lp.ClickLogin();

    }
    @Then("User validates current url should be {string}")
    public void user_validates_current_url_should_be(String currentUrl) {
        Assert.assertEquals(driver.getCurrentUrl(),currentUrl);
        System.out.println("Expected URL :"+currentUrl);
        System.out.println("Actual URL :"+driver.getCurrentUrl());

    }
    @When("User clicks on logout button from menu")
    public void user_clicks_on_logout_button_from_menu() throws InterruptedException {
        lp.ClickMenu();
        Thread.sleep(3000);
        lp.ClickLogout();

    }
    @Then("User closes the browser")
    public void user_closes_the_browser() {
        driver.quit();

    }
}
