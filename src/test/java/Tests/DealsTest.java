package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DealsTest extends TestBase{
    @Test
    public void Scenario2(){
        //dealsPage.dismissToaster();
        dealsPage.goToDealsPage();
        Assert.assertEquals(driver.getTitle(),"Amazon | Deals");
        dealsPage.clickOnSeeMore();
        dealsPage.selectGrocery();
        dealsPage.selectDiscount();
        //dealsPage.selectPage();
        // dealsPage.goToNextPage();
        dealsPage.selectItem();
    }
}
