package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected static WebDriver driver;
    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(100));

    public PageBase(WebDriver driver){

        this.driver =driver;
    }
}
