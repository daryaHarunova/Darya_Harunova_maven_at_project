package pages.Google;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import java.time.Duration;

public class HomePageGoogle extends BasePage {

    WebDriver driver = Driver.getWebDriver();

    public void pasteTextToSearch() {
        WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
        Actions make = new Actions(driver);
        make
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();
        search.sendKeys(Keys.RETURN);
    }
}
