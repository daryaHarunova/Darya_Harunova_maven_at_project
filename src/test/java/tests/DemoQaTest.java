package tests;

import org.junit.Test;
import pageObjects.DemoQa.HomePage;

public class DemoQaTest {
    HomePage homePage = new HomePage();

    @Test
    public void checkLondonHotel() throws InterruptedException {
        homePage.open();
        homePage.selectValueFromSelectValueDropdown();
        homePage.selectValueFromSelectOneDropdown();
        homePage.selectValueFromOldStyleDropdown();
        homePage.selectValueFromMultiselectDropdown();
        homePage.close();
    }


}

