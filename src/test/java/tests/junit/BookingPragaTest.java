package tests.junit;

import org.junit.Test;
import pages.Booking.HomePageBooking;
import pages.Booking.ResultPageBooking;
import tests.BaseTest;

public class BookingPragaTest extends BaseTest {
    private HomePageBooking homePage = new HomePageBooking();
    private ResultPageBooking resultPage = new ResultPageBooking();

    @Test
    public void checkParisHotel() throws InterruptedException {
        homePage.open("https://booking.com");
        homePage.acceptAllCookie();
        homePage.enterCity("Прага");
        resultPage.selectRating9();
        Thread.sleep(3000);
        resultPage.EvaluationOfTheObjectInDescendingOrder();
    }

}
