package tester.samuel.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tester.samuel.automation.enums.Browser;

public class Driver {
    WebDriver driver;

    public Driver(Browser browser){
        switch (browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
