package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingTest extends TestBase{

    @Test
    public void Booking(){
        Assert.assertEquals(driver.getTitle(),"Karnataka State Road Transport Corporation - KSRTC");
        bookingPage.selectCityFrom();
        bookingPage.selectCityDestination();
        bookingPage.selectDateOfDep();
        bookingPage.searchBus();
        bookingPage.selectSeat();
        bookingPage.selectBoardingPoint();
        bookingPage.selectDroppingPoint();
        bookingPage.passDetails();
        bookingPage.passAllDetails();
    }
}
