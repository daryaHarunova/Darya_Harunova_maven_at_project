package tests.testng;

import org.testng.annotations.Test;
import pages.Booking.HomePageBooking;
import tests.BaseTestNG;

public class BookingLondonTest extends BaseTestNG {
    private HomePageBooking homePage = new HomePageBooking();

    @Test
    public void checkParisHotel() throws InterruptedException {
        homePage.open("https://booking.com");
        homePage.acceptAllCookie();
        homePage.enterCity("Лондон");
        homePage.searchTenthHotel();
        homePage.takeScreen();
    }

}
