package pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver = Driver.getWebDriver();

    public void open(String url) {
        driver.get(url);
    }
}
