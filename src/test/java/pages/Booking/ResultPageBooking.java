package pages.Booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ResultPageBooking {

    WebDriver driver = Driver.getWebDriver();

    public void selectRating(String value) {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Оценка по отзывам')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(String.format("//div[@id='filter_group_review_score_:r1e:']//*[contains(text(),'%s')]", value))).click(); // select rating 6+
    }

    public void selectRating9() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Оценка по отзывам')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("//div[@id='filter_group_review_score_:r18:']//div[contains(text(),'Превосходно: 9+')]")).click(); // select rating 9+
        driver.findElement(By.xpath("//*[@data-filters-item='review_score:review_score=90']")).click();
    }

    public void EvaluationOfTheObjectInDescendingOrder(){
        driver.findElement(By.xpath("//div[@data-capla-component-boundary='b-search-web-searchresults/SearchResultsDesktop']")).click();
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//span[text()='Оценка объекта (по убыванию)']")).click();
        driver.findElement(By.xpath("//div[@data-testid='property-card'][1]//a[@data-testid='title-link']")).click();
    }
}

