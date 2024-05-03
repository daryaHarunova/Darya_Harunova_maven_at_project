package tests.firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class DemoQa {
    private WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @Test
    public void checkLondonHotel() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("//div[@id= 'withOptGroup']")).click();
        driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
        driver.findElement(By.xpath("//div[@id= 'selectOne']")).click();
        driver.findElement(By.xpath("//*[text()='Dr.']")).click();
        driver.findElement(By.xpath("//div[@class= ' css-2b097c-container']")).click();
        driver.findElement(By.xpath("//*[text()='Green']")).click();
        Thread.sleep(3000);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}