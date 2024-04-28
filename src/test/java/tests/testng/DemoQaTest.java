package tests.testng;

import org.testng.annotations.Test;
import pages.DemoQa.HomePageDemoQa;
import tests.BaseTestNG;

public class DemoQaTest extends BaseTestNG {
    HomePageDemoQa homePage = new HomePageDemoQa();

    @Test
    public void checkLondonHotel() throws InterruptedException {
        homePage.open("https://demoqa.com/select-menu");
        homePage.selectValueFromSelectValueDropdown("Group 1, option 2");
        homePage.selectValueFromSelectOneDropdown("Dr.");
        homePage.selectValueFromOldStyleDropdown("Green");
        homePage.selectValueFromMultiselectDropdown();
    }
}

