package tests.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;

public class Weather {
    private final String TIME = "12:00";
    private static final String DAY = getTomorrowDay();
    private final String GRADUS = "Celsius";
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
        Thread.sleep(2000);
        element.sendKeys("погода минск");
        element.sendKeys(Keys.RETURN);
        WebElement element1 = driver.findElement(By.xpath("//textarea[@name='q']"));
        element1.clear();
        element1.sendKeys("погода минск на неделю");
        element1.sendKeys(Keys.RETURN);
        String text = driver.findElement(By.xpath(String.format("//*[name()='text' and contains(@aria-label, '%s 12:00')]", DAY))).getAttribute("aria-label").substring(0,2);
        System.out.println(text);
        driver.quit();
    }

    private static String getTomorrowDay() {
        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Получение текущего дня недели
        int currentDayOfWeek = currentDate.getDayOfWeek().getValue() + 1;

        return switch (currentDayOfWeek) {
            case 1 -> "понедельник";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "";
        };
    }

}