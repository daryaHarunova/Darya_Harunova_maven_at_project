package tests.junit;

import org.junit.Test;
import pages.Booking.HomePageBookingCSS;
import tests.BaseTest;

public class BookingLondonTestCSS extends BaseTest {
    private HomePageBookingCSS homePage = new HomePageBookingCSS();

    @Test
    public void checkParisHotel() throws InterruptedException {
        homePage.open("https://booking.com");
        homePage.acceptAllCookie();
        homePage.enterCity("Лондон");
        homePage.searchTenthHotel();
        homePage.takeScreen();
    }

}
