package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected static WebDriver driver;
    WebDriverWait wait;

    public  PageBase(WebDriver driver){

        this.driver =driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(200));
    }
}
