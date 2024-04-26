package pages.W3schools;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import java.time.Duration;

public class HomePageW3School extends BasePage {
    WebDriver driver = Driver.getWebDriver();

    public void copyText(String xpath) {
        WebElement tutorial = driver.findElement(By.xpath(xpath));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();
    }
}