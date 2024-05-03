package tests.firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingPraga {
    WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testBooking() throws InterruptedException {

//        driver.get("https://booking.com");
//        driver.findElement(By.xpath("//button[@id ='onetrust-accept-btn-handler']")).click();
//        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();
//        driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("Прага");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Оценка по отзывам')]"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        driver.findElement(By.xpath("//div[@id='filter_group_review_score_:r18:']//div[contains(text(),'Превосходно: 9+')]")).click(); // select rating 9+
//        driver.findElement(By.xpath("//*[@data-filters-item='review_score:review_score=90']")).click();
//        driver.findElement(By.xpath("//div[@data-capla-component-boundary='b-search-web-searchresults/SearchResultsDesktop']")).click();
//        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
//        driver.findElement(By.xpath("//span[text()='Оценка объекта (по убыванию)']")).click();
//        driver.findElement(By.xpath("//div[@data-testid='property-card'][1]//a[@data-testid='title-link']")).click();
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }
}