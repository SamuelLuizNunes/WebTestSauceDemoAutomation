package tester.samuel.automation.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tester.samuel.automation.core.Driver;
import tester.samuel.automation.enums.Browser;

public class Tests {
    Driver driver;

    @BeforeEach
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new Driver(Browser.CHROME);
        driver.getDriver().get("https://www.saucedemo.com/v1/");
        driver.getDriver().manage().window().maximize();
    }

    @AfterEach
    public void quitDriver() {
        driver.getDriver().quit();
    }

    @Test
    public void loginWithValidCredentials() {

    }
}
