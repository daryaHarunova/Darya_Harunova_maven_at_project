package pageObjects.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ResultPage {
    WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementsTextByRegex(String regex) {
        List<WebElement> actualResult = driver.findElements(By.xpath("//div[@class='MjjYud']/div[@jscontroller='SC7lYd']//h3"));
        List<String> stringArray = new ArrayList<>();
        for (WebElement element : actualResult) {
            stringArray.add(element.getText().toLowerCase());
        }

        for (String str : stringArray) {
            assertTrue(str.matches(regex));
        }
    }

    public void close() {
        driver.quit();
    }
}
