package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BookingPage extends PageBase {

    By cityFrom = By.id("fromCity_chosen");
    By searchCityFrom = By.xpath("//input[@placeholder=\"Search Your City Name\"]");
   // By clickOnCityFrom = By.xpath("//li[@class=\"active-result\" and text()='CHIKKAMAGALURU']");
    By results = By.xpath("//ul[@class=\"chosen-results\"]");


    By cityDestination = By.id("toCity_chosen");
    By searchCityDestination = By.xpath("//*[@id=\"toCity_chosen\"]/div/div[1]/input");
    By clickOnCityDestination=By.xpath("//*[@id=\"toCity_chosen\"]/div/ul/li");
   // By resultsForDestination = By.xpath("//ul[@class=\"chosen-results\"]");

    By clickOnChooseDate = By.id("departDate");
    By selectDate = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a");
    By searchBus=By.id("submitSearch");
    By clickOnSelectSeatButton=By.xpath("//div[@class=\"selectbutton\" and text()='Select Seats']");
    By selectSeat=By.xpath("//div[@class=\"seatlook\" and text()='24']");
    By selectBoarding=By.xpath("//img[@src=\"https://assetsksrtc.iamgds.com/websearchnew/img/PickupIcon.svg\"]");
    //By selectBoardingTime=By.xpath("//div[@//div[@class=\"col-time\"]");
    By selectBoardingTime=By.cssSelector("div.pick--val div.col-time");
    By selectDropping=By.xpath("//img[@src=\"https://assetsksrtc.iamgds.com/websearchnew/img/DropoffIcon.png\"]");
    By selectDroppingTime=By.cssSelector("div.drop--val");
    By clickOnButtonPassDetails=By.xpath("//div[@class=\"btnPassDetails\" and text()='Provide Passenger Details']");
    By enterMobileNum=By.xpath("//input[@name=\"mobileNo\"]");
    By enterEmail=By.xpath("//input[@name=\"email\"]");
    By clickOnProceedToPassDetails=By.xpath("//div[@class=\"navswitchbtn flex-all-c\" and text()='PROCEED TO passenger detail as']");
    By passName=By.xpath("//input[@placeholder=\"Name\"]");
    By clickOnGenderDropDown=By.xpath("//input[@name=\"paxGender[0]\"]");
    By searchGender=By.id("searchInput");
    By selectGender=By.xpath("//div[@class=\"ddn active\"]");
    By passAge=By.name("paxAge[0]");
    By clickOnConcessionDropDown=By.name("paxConcessionType[0]");
    By searchConcession=By.xpath("//input[@placeholder=\"Search Concession Type\"]");
    By selectConcession=By.xpath("//div[@class=\"ddn active\"]");
    By clickOnIDCardDropDown=By.name("paxIDCardType[0]");
    By searchIDCard=By.xpath("//input[@placeholder=\"Search ID Type\"]");
    By selectIdCard=By.xpath("//div[@class=\"ddn active\"]");
    By cardNum=By.name("paxIDCardNo[0]");
    By clickOnProceedCheckOut=By.xpath("//div[@class=\"navswitchbtn flex-all-c\" and text()='Proceed to Checkout']");
    By okButton=By.id("okayButton");

    public BookingPage(WebDriver driver) {
        super(driver);
    }

    public void selectCityFrom() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cityFrom))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchCityFrom))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchCityFrom))).sendKeys("CHIKKAMAGALURU");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(results))).click();

    }

    public void selectCityDestination() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cityDestination)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cityDestination))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchCityDestination))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchCityDestination))).sendKeys("BENGALURU");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(clickOnCityDestination)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnCityDestination))).click();

    }

    public void selectDateOfDep() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(clickOnChooseDate)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnChooseDate))).click();
        WebElement element = driver.findElement(selectDate);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectDate)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectDate))).click();
    }
    public void searchBus(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchBus))).click();
    }
    public void selectSeat(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnSelectSeatButton))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectSeat))).click();

    }
    public void selectBoardingPoint(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectBoarding)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectBoarding))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectBoardingTime)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectBoardingTime))).click();

    }
    public void selectDroppingPoint(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectDropping)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectDropping))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectDroppingTime)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectDroppingTime))).click();
    }
    public void passDetails(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(clickOnButtonPassDetails)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnButtonPassDetails))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(enterMobileNum))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(enterMobileNum))).sendKeys("6789125987");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(enterEmail))).sendKeys("edehbeh@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnProceedToPassDetails))).click();

    }
    public void passAllDetails(){
        passName();
        passGender();
        passAge();
        passConcession();
        passIdCard();
        passCardNum();
        checkOut();
    }
    public void passName() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(passName))).sendKeys("xxx");
    }
    public void passGender() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnGenderDropDown))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchGender))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchGender))).sendKeys("Female");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectGender))).click();
    }
    public void passAge() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(passAge))).sendKeys("33");
    }
    public void passConcession() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnConcessionDropDown))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchConcession))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchConcession))).sendKeys("ge");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectConcession))).click();
    }
    public void passIdCard(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnIDCardDropDown))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchIDCard))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchIDCard))).sendKeys("pass");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectIdCard))).click();
    }
    public void passCardNum() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cardNum))).sendKeys("9876");
    }
    public void checkOut(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickOnProceedCheckOut))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(okButton)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(okButton))).click();
    }
}