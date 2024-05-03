package tests.firstTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BookingCurrency {
    WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void checkCurrencyTooltip() {
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//button[@id ='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();
        WebElement currentcyButton = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']/span"));

        Actions actions = new Actions(driver);
        actions.moveToElement(currentcyButton);
        actions.perform();
        Assert.assertEquals("Value of the tooltip for currency is not correct", driver.
                findElement(By.xpath("//div[text()='Выберите валюту']")).getText(), "Выберите валюту");
    }

    @Test
    public void checkLanguageTooltip() {
        driver.get("https://booking.com");
        WebElement languagesButton = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(languagesButton);
        actions.perform();
        Assert.assertEquals("Value of the tooltip for languages is not correct", driver.
                findElement(By.xpath("//div[text()='Выберите язык']")).getText(), "Выберите язык");
    }

    @After
    public void closeBrowser() {

        driver.close();
    }
}
