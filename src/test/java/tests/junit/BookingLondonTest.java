package tests.junit;

import org.junit.Test;
import pages.Booking.HomePageBooking;
import tests.BaseTest;

public class BookingLondonTest extends BaseTest {
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
