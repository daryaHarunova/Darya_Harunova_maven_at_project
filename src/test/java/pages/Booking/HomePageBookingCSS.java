package pages.Booking;

import driver.Driver;
import org.openqa.selenium.*;
import pages.BasePage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HomePageBookingCSS extends BasePage {
    WebDriver driver = Driver.getWebDriver();

    public void acceptAllCookie() {
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("button[aria-label='Dismiss sign-in info.'] > span > span")).click();
    }

    public void enterCity(String city) {
        WebElement searchElement = driver.findElement(By.cssSelector("input[name='ss']"));
        searchElement.sendKeys(city);
        searchElement.sendKeys(Keys.RETURN);
    }

    public void searchTenthHotel(){
        WebElement tenHotel = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tenHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", tenHotel);
    }

    public  void takeScreen(){
        byte[] asBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        try {
            Files.write(Paths.get("C:\\Users\\paulk\\IdeaProjects\\hometask_hotel\\hotel.png"), asBytes);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }


}
