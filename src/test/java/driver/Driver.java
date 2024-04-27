package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.Optional;


public class Driver {
    public static WebDriver driver;

    public static WebDriver getWebDriver() {
        return getChromeDriver();
    }

    private static WebDriver getChromeDriver() {
        if (null == driver) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void killDriver() {
        driver.quit();
        driver = null;
    }
}