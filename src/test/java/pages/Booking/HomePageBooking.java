package pages.Booking;

import driver.Driver;
import org.openqa.selenium.*;
import pages.BasePage;

import java.time.LocalDate;

public class HomePageBooking extends BasePage {
    WebDriver driver = Driver.getWebDriver();

    public void acceptAllCookie() {
        driver.findElement(By.xpath("//button[@id ='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();
    }
    public void enterCity(String city) {
        WebElement searchElement = driver.findElement(By.xpath("//input[@name='ss']"));
        searchElement.sendKeys(city);
        searchElement.sendKeys(Keys.RETURN);
    }

    public void enterDate() throws InterruptedException {
        String xpathStart = String.format("//span[@data-date = '2024-04-%s']", LocalDate.now().plusDays(3).getDayOfMonth());
        String xpathEnd = String.format("//span[@data-date = '2024-%s-%s']", "0" + LocalDate.now().plusDays(3 + 7).getMonthValue(), "0" + LocalDate.now().plusDays(3 + 7).getDayOfMonth());
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpathStart)).click();
        driver.findElement(By.xpath(xpathEnd)).click();
    }
    public void enterNumberOfPeople(){
        driver.findElement(By.xpath("//button[@data-testid= 'occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']/button")).click();
    }

    public void submitButton(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
