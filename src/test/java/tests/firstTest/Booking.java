package tests.firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;

public class Booking {
    WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testBooking() throws InterruptedException {

        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@id ='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();
        WebElement searchElement = driver.findElement(By.xpath("//input[@name='ss']"));
        searchElement.sendKeys("Париж");
        searchElement.sendKeys(Keys.RETURN);
//        driver.findElement(By.xpath("//div[@data-testid = 'searchbox-dates-container']")).click();
        String xpathStart = String.format("//span[@data-date = '2024-04-%s']", LocalDate.now().plusDays(3).getDayOfMonth());
        String xpathEnd = String.format("//span[@data-date = '2024-04-%s']", LocalDate.now().plusDays(3 + 7).getDayOfMonth());
        Thread.sleep(3000); // нужный
        driver.findElement(By.xpath(xpathStart)).click();
        driver.findElement(By.xpath(xpathEnd)).click();
        driver.findElement(By.xpath("//button[@data-testid= 'occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']/button")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Оценка по отзывам')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("//div[@id='filter_group_review_score_:r1e:']//*[contains(text(),'Достаточно хорошо: 6+')]")).click(); // select rating 6+
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}