package tests.junit;

import org.junit.Test;
import pages.Booking.HomePageBooking;
import tests.BaseTest;

public class BookingCurrencyTest extends BaseTest {
    private HomePageBooking homePage = new HomePageBooking();

    @Test
    public void checkParisHotel() throws InterruptedException {
        homePage.open("https://booking.com");
        homePage.acceptAllCookie();
        homePage.selectCurrentcy();
        homePage.open("https://booking.com");
        homePage.checkLanguageTooltip();
    }

}
