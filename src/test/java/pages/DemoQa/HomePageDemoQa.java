package pages.DemoQa;

import driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import java.time.Duration;

public class HomePageDemoQa extends BasePage {
    WebDriver driver = Driver.getWebDriver();

    public void selectValueFromSelectValueDropdown(String value) {
        driver.findElement(By.xpath("//div[@id= 'withOptGroup']")).click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']", value))).click();
    }

    public void selectValueFromSelectOneDropdown(String value) {
        driver.findElement(By.xpath("//div[@id= 'selectOne']")).click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']", value))).click();
    }

    public void selectValueFromOldStyleDropdown(String color) {
        driver.findElement(By.xpath("//div[@class= ' css-2b097c-container']")).click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']", color))).click();
    }

    public void selectValueFromMultiselectDropdown() throws InterruptedException {
        WebElement drop = driver.findElement(By.xpath("(//div[@class= ' css-2b097c-container'])[3]"));
        drop.click();
        WebElement el = driver.findElement(By.xpath("(//*[text() = 'Blue'])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
    }
}

