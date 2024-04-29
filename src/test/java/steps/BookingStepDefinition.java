package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Booking.HomePageBooking;


public class BookingStepDefinition {
    HomePageBooking homePage = new HomePageBooking();

    @Given("Open booking homepage")
    public void openBookingHomepage() {
        homePage.open("https://booking.com");
    }

    @When("Input and submit city name in search field")
    public void selectCityViaEnter() {
        homePage.enterCity("Мадрид");
    }

    @And("I select startDate day and endDate in day")
    public void selectDates(Integer startDay, Integer endDay) throws InterruptedException {
        homePage.enterDate();
    }


    @And("I add adults")
    public void selectOccupancy() {
        homePage.enterNumberOfPeople();
    }

    @And("I click on Submit button")
    public void submitButton() {
        homePage.submitButton();
    }

    @And("I add first hotel to faviortits")
    public void addFirstHotelToFavorites() {
        homePage.addFirstHotelToFavorites();
    }

        @And("I scroll to last hotel")
        public void scrollToLastHotel () {
            homePage.scrollToLastHotel();
        }

    @And("I add last hotel to faviortits")
    public void addLastHotelToFavorites () {
        homePage.addLastHotelToFavorites();
    }

    }
