package tests;

import driver.Driver;
import org.testng.annotations.AfterClass;

public class BaseTestNG {
    @AfterClass
    public void closeBrowser() {
        Driver.killDriver();
    }
}
