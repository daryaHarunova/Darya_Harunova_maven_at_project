package tests.firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;


public class BookingLondon {
    private WebDriver driver;

    @Before
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @Test
    public void checkLondonHotel() throws InterruptedException {
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@id ='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();
        WebElement searchElement = driver.findElement(By.xpath("//input[@name='ss']"));
        searchElement.sendKeys("Лондон");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement tenHotel = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", tenHotel);
        Thread.sleep(3000);
        byte[] asBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        try {
            Files.write(Paths.get("C:\\Users\\paulk\\IdeaProjects\\hometask_hotel\\hotel.png"), asBytes);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}