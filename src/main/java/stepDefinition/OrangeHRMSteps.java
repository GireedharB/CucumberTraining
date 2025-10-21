package stepDefinition;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

     WebDriver driver;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("Browser lauched sucessfully");
    }
    @When("User Hits OrangeHRM URL in browser")
    public void user_hits_orange_hrm_url_in_browser() {
        driver.get("https://orangehrm.com/");
        System.out.println("Entered URL sucessfully");
    }
    @Then("Verify presence of logo.")
    public void verify_presence_of_logo() {
       boolean status= driver.findElement(By.xpath("//a[@class=\"navbar-brand nav-logo\"]")).isDisplayed();
        System.out.println("Logo present: "+status);
        Assert.assertTrue(status);
    }
    @Then("User validate title of the page")
    public void user_validate_title_of_the_page() {
        System.out.println(driver.getTitle());
        String expectedTitle="Human Resources Management Software | HRMS | OrangeHRM";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @And("Close the browser")
    public void close_the_browser() {
        driver.close();
        System.out.println("Browser closed Sucessfully");

    }
}
