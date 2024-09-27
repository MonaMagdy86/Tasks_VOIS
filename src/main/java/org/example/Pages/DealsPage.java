package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DealsPage extends PageBase{
    By todaysLink=By.linkText("Today's Deals");
    By toaster=By.xpath("//input[@data-action-type=\"DISMISS\"]");
    // By todaysLink=By.xpath("//a[@data-csa-c-type='link' and text()='Today's Deals']");
    By seeMore=By.xpath("//a[@aria-labelledby=\"see-more-departments-label\"]");
    By selectGrocery=By.xpath("//div[@data-csa-c-element-id=\"filter-departments-Grocery & Gourmet Food\"]");
    By selectDiscount=By.xpath("//div[@data-csa-c-element-id=\"filter-percentOff-10% off or more\"]");
    By selectPageNumberFour=By.xpath("//span[@class='a-carousel-page-current' and text()='4']");
    By nextPage=By.xpath("//a[@tabindex=\"-1\"]//span[@class=\"a-icon-alt\" and text()='Next Page']");
    By selectItem=By.xpath("//span[@class=\"a-truncate-cut\" and text()='Ouligay 37pcs Acrylic Alphabet Cake Topper, Per…' ]");
    public DealsPage(WebDriver driver) {
        super(driver);
    }

    public void goToDealsPage(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(todaysLink)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(todaysLink))).click();
    }
    public void dismissToaster(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(toaster))).click();
    }
    public void clickOnSeeMore(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(seeMore))).click();
    }
    public void selectGrocery(){
        WebElement element = driver.findElement(selectGrocery);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectGrocery))).click();
    }
    public void selectDiscount(){
        WebElement element = driver.findElement(selectDiscount);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectDiscount))).click();
    }
    public void selectPage(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'"));
        WebElement element = driver.findElement(selectPageNumberFour);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectPageNumberFour)));
        wait.until(ExpectedConditions.elementToBeClickable(selectPageNumberFour)).click();
    }
    public void goToNextPage(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nextPage)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextPage))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextPage))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextPage))).click();

    }
    public void selectItem(){
        WebElement element = driver.findElement(selectItem);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectItem)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectItem))).click();
    }
}
