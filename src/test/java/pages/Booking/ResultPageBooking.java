package pages.Booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ResultPageBooking {

    WebDriver driver = Driver.getWebDriver();

    public void selectRating(String value){
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Оценка по отзывам')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(String.format("//div[@id='filter_group_review_score_:r1e:']//*[contains(text(),'%s')]", value))).click(); // select rating 6+
    }

}
