package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends PagePase{
    By accountList =By.id("nav-link-accountList");
    By emailInput=By.id("ap_email");
    By continueButton=By.id("continue");
    By passwordInput=By.id("ap_password");
    By signInButton=By.id("signInSubmit");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signInSteps(String email,String pass){
        setAccountList();
        enterEmail(email);
        clickOnContinueButton();
        enterPassword(pass);
        clickOnSignInButton();
    }
    public void setAccountList(){
        driver.findElement(accountList).click();
    }
    public void enterEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void enterPassword(String pass){
        driver.findElement(passwordInput).sendKeys(pass);
    }
    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
}


