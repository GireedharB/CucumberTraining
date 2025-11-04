package stepDefinition;

import Hooks.AutomationExerciseHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

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

    @When("User enters name {string} and email {string} in respective field")
    public void user_enters_name_and_email_in_respective_field(String Name,String Email) throws InterruptedException {
        driver.findElement(By.name("name")).sendKeys(Name);
        driver.findElement(By.xpath("//form[@action=\"/signup\"]//input[3]")).sendKeys(Email);
        System.out.println(Name);
        System.out.println(Email);

    }
    @Then("User clicks on SignUP button")
    public void user_clicks_on_sign_up_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
        Thread.sleep(3000);

    }
    @Then("User validates title of page")
    public void user_validates_title_of_page() {
        String expTitle= "Automation Exercise - Signup";
        Assert.assertEquals(driver.getTitle(),expTitle);

    }
    @Then("User fills the data")
    public void user_fills_the_data() throws InterruptedException {
       driver.findElement(By.id("id_gender1")).click();
       driver.findElement(By.id("password")).sendKeys("Password#");
       Select day = new Select(driver.findElement(By.xpath("//select[@id='days']")));
       day.selectByValue("10");
        Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        month.selectByVisibleText("November");
        Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        year.selectByVisibleText("1994");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("ashwin");
        driver.findElement(By.id("last_name")).sendKeys("shinde");
        driver.findElement(By.id("company")).sendKeys("Capgemini");
        driver.findElement(By.id("address1")).sendKeys("Pune");
        driver.findElement(By.id("state")).sendKeys("Maharashtra");
        driver.findElement(By.id("city")).sendKeys("Pune");
        driver.findElement(By.id("zipcode")).sendKeys("411014");
        driver.findElement(By.id("mobile_number")).sendKeys("9175755081");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='mobile_number']//following::button[1]")).click();
        String Actual=driver.getTitle();
        System.out.println(Actual);
        driver.findElement(By.xpath("//a[text()='Continue']")).click();



    }
    @Then("User verifies the links on page")
    public void user_verifies_the_links_on_page() throws IOException {
        List<WebElement> totallinks = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links on Automation Exercise Page: "+totallinks.size());
        System.out.println("All links text :");
        int workinglinkscount=0;
        int notworkinglinkscount=0;

        for(int i=0;i<totallinks.size();i++){
            WebElement element = totallinks.get(i);
            String url = element.getAttribute("href");
            URL link = new URL(url);
            HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
            httpconn.connect();
            int code = httpconn.getResponseCode();
            if(code>=400){
                System.out.println(url+" "+code+" "+"link is broken");
                notworkinglinkscount++;
            }else {
                System.out.println(url+" "+code+" "+"link is working");
                workinglinkscount++;
            }


        }
        System.out.println("All links tested sucessfull !!");
        System.out.println(" Total no of working links : "+workinglinkscount);
        System.out.println(" Total no of working links : "+notworkinglinkscount);


    }

    @Then("User clicks on contact us link")
    public void user_clicks_on_contact_us_link() throws InterruptedException {
       driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
       Thread.sleep(2000);
       String actual= driver.getTitle();
       String expected="Automation Exercise - Contact Us";
        System.out.println("Expected tittle :"+expected);
        System.out.println("Actaual Tittle : "+actual);
       if(actual.equals(expected)){
           System.out.println("User is on contact us page");
       }else {
           System.out.println("User is no contact us page");
       }
    }

}
