package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.W3schools.HomePage;
public class W3schoolsTest {
    WebDriver driver;
    HomePage homePageW3School;
    pageObjects.Google.HomePage homePageGoogle;
    pageObjects.Google.ResultPage resulPageGoogle;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        homePageW3School = new HomePage(driver);
    }

    @Test
    public void copyTitle() {
        homePageW3School.open();
        homePageW3School.copyText("//span[@class = 'color_h1']");

        homePageGoogle = new pageObjects.Google.HomePage(driver);
        homePageGoogle.open();
        homePageGoogle.pasteTextToSearch();

        resulPageGoogle = new pageObjects.Google.ResultPage(driver);
        resulPageGoogle.assertElementsTextByRegex(".*(tutorial|туториал).*");
    }

    @After
    public void closeBrowser() {
        resulPageGoogle.close();
    }
}

