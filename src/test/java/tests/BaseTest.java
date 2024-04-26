package tests;

import driver.Driver;
import org.junit.After;

public class BaseTest {
    @After
    public void closeBrowser() {
        Driver.killDriver();
    }
}
