package Tests;

import org.example.Pages.DealsPage;
import org.example.Pages.SearchPage;
import org.example.Pages.SignInPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
    protected final String URL = "https://www.amazon.com";
    protected static WebDriver driver;
    protected SearchPage searchPage;
    protected SignInPage signInPage;
    protected DealsPage dealsPage;

    @BeforeMethod
    public void SetUp(Method method){
        driver =new ChromeDriver();
        searchPage = new SearchPage(driver);
        signInPage=new SignInPage(driver);
        dealsPage =new DealsPage(driver);
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        signInPage.signInSteps("Monam2715@gmail.com","Mona@1234");
    }

    @AfterMethod
    public void quit(Method method) throws IOException {
        TestUtil.TakeSnapshot(method.getName());
        driver.quit();
    }


}
