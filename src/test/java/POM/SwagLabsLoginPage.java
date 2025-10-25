package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
    public WebDriver ldriver;

    public  SwagLabsLoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="user-name")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(id="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id="login-button")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath="//div[@class=\"bm-burger-button\"]")
    @CacheLookup
    WebElement btnMenu;

    @FindBy(xpath="//a[text()='Logout']")
    @CacheLookup
    WebElement btnLogout;

    public void setUsername(String username)  {
        txtUsername.sendKeys(username);
    }
    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void ClickLogin(){
        btnLogin.click();
    }
    public void ClickMenu(){
        btnMenu.click();
    }
    public void ClickLogout(){
        btnLogout.click();
    }


}
