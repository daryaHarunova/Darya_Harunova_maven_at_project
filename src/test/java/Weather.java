import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weather {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("input")).sendKeys("погода минск weather");
        driver.findElement(By.xpath("//div[@class = 'wM6W7d mus_pc']")).click();
        driver.findElement(By.xpath("//div[@class = 'wob_df'][1]")).click();
        System.out.println();

    }

}