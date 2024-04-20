package pageObjects.DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomePage {
    WebDriver driver = new ChromeDriver();

    public void open() {
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    public void selectValueFromSelectValueDropdown() {
        driver.findElement(By.xpath("//div[@id= 'withOptGroup']")).click();
        driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
    }

    public void selectValueFromSelectOneDropdown() {
        driver.findElement(By.xpath("//div[@id= 'selectOne']")).click();
        driver.findElement(By.xpath("//*[text()='Dr.']")).click();
    }

    public void selectValueFromOldStyleDropdown() {
        driver.findElement(By.xpath("//div[@class= ' css-2b097c-container']")).click();
        driver.findElement(By.xpath("//*[text()='Green']")).click();
    }

    public void selectValueFromMultiselectDropdown() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class= ' css-2b097c-container'])[3]")).click();
    }


    public void close() {
        driver.quit();
    }
}

