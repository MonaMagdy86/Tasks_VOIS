package Tests;

import Pages.BookingPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
   protected final String URL = "https://ksrtc.in/oprs-web/guest/home.do?h=1";
    protected static WebDriver driver;
    protected BookingPage bookingPage;
    @BeforeMethod
    public void SetUp(Method method){
        driver =new ChromeDriver();
       bookingPage=new BookingPage(driver);
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    @AfterMethod
    public void quit(Method method) throws IOException {
        TestUtil.TakeSnapshot(method.getName());
        driver.quit();
    }


}
