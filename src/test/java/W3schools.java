import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class W3schools {
    WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testW3() throws InterruptedException {


        List<WebElement> actualResult = driver.findElements(By.xpath("//div[@class='MjjYud']/div[@jscontroller='SC7lYd']//h3"));

        List<String> stringArray = new ArrayList<>();

        for (WebElement element : actualResult) {
            stringArray.add(element.getText().toLowerCase());
        }

        System.out.println(stringArray);

        for (String str : stringArray) {
            assertTrue(str.matches(".*(tutorial|туториал).*"));
        }
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}


