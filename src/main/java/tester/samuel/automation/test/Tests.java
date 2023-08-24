package tester.samuel.automation.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tester.samuel.automation.core.Driver;
import tester.samuel.automation.enums.Browser;
import tester.samuel.automation.pages.LoginPage;

public class Tests {
    Driver driver;
    LoginPage loginPage;

    @BeforeEach
    public void initialize() {
        driver = new Driver(Browser.CHROME);
        driver.getDriver().get("https://www.saucedemo.com/v1/");
        driver.getDriver().manage().window().maximize();
        loginPage = new LoginPage(driver.getDriver());
    }

    @AfterEach
    public void quitDriver() {
        driver.getDriver().quit();
    }

    @Test
    public void loginWithValidCredentials() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        Assertions.assertEquals("Products", loginPage.getTitleLoggedIn());
    }
}
