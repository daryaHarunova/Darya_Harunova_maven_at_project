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
        driver.get("https://www.w3schools.com/java/");
        WebElement tutorial =
                driver.findElement(By.xpath("//span[@class = 'color_h1']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
        make
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();
        search.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

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


