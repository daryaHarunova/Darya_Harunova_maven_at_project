package pages.Booking;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public void enterNumberOfPeople() {
        driver.findElement(By.xpath("//button[@data-testid= 'occupancy-config']")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//*[@id = 'group_adults']/following-sibling::div[@class='bfb38641b0']/button[2]")).click();
        driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']/button")).click();
    }

    public void submitButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void selectCurrentcy() {
        WebElement currentcyButton = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(currentcyButton);
        actions.perform();
        Assert.assertEquals("Value of the tooltip for currency is not correct", driver.findElement(By.xpath("//div[text()='Выберите валюту']")).getText(), "Выберите валюту");
    }

    public void checkLanguageTooltip() {
        WebElement languagesButton = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(languagesButton);
        actions.perform();
        Assert.assertEquals("Value of the tooltip for languages is not correct", driver.findElement(By.xpath("//div[text()='Выберите язык']")).getText(), "Выберите язык");
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
