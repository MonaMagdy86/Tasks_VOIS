package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    @Test
    public void Scenario1() {
        searchPage.enterSearchValue("car accessories");
        searchPage.clickOnSearchButton();
        Assert.assertEquals(driver.getTitle(),"Amazon.com : car accessories");
        searchPage.selectFirstItem();
       // searchPage.addToCart();
        //searchPage.clickOnCartIcon();
        //Assert.assertEquals(driver.getTitle(),"Amazon.com Shopping Cart");
        //Assert.assertTrue(searchPage.checkTotal());
    }
}
