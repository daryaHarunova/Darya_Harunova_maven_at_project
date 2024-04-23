package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.DemoQa.HomePage;

public class DemoQaTest {
    HomePage homePage = new HomePage();

    @Before
    public void openBrowser() {
        homePage.open();
    }

    @Test
    public void checkLondonHotel() throws InterruptedException {
        homePage.open();
        homePage.selectValueFromSelectValueDropdown();
        homePage.selectValueFromSelectOneDropdown();
        homePage.selectValueFromOldStyleDropdown();
        homePage.selectValueFromMultiselectDropdown();
        Thread.sleep(3000);
    }

    @After
    public void closeBrowser() {
        homePage.close();
    }
}

