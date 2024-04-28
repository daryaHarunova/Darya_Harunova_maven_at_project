package tests.testng;

import org.testng.annotations.Test;
import pages.Booking.HomePageBooking;
import tests.BaseTestNG;

public class BookingCurrencyTest extends BaseTestNG{
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
