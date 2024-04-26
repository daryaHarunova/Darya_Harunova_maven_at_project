package tests.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.DemoQa.HomePageDemoQa;
import tests.BaseTest;

public class DemoQaTest extends BaseTest {
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

