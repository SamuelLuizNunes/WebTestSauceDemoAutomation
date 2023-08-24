package tester.samuel.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputUserName(String username){
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("login-button")).click();
    }

    public String getTitleLoggedIn(){
        String titleLoggedIn =driver.findElement(By.cssSelector(".product_label")).getText();
        return titleLoggedIn;
    }
}
