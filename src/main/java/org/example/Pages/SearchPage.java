package org.example.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class SearchPage extends PageBase {
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By cartIcon = By.id("nav-cart-count");
    By checkSubtotal=By.id("sc-subtotal-label-buybox");
    By toaster=By.xpath("//input[@data-action-type=\"DISMISS\"]");
    By selectItem=By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\" ]");
    By addItem=By.id("add-to-cart-button");

    public SearchPage(WebDriver driver) {

        super(driver);
    }

    public void enterSearchValue(String value) {
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(value);
    }
    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }
    public void selectFirstItem(){
        List<WebElement> elements =driver.findElements(selectItem);
        WebElement firstElement = elements.get(0);
        firstElement.click();
    }
    public void addItemToCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addItem)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addItem))).click();
    }
    public void clickOnCartIcon(){
        driver.findElement(cartIcon).click();
    }
    public boolean checkTotal(){
        return driver.findElement(checkSubtotal).isDisplayed();
    }

}
