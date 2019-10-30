package testsuite;


import com.nocommerce.demo.pages.ItemPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class ItemTest extends TestBase {

//ItemPage itemPage = new ItemPage();

@Test (groups = {"sanity"})

public void userShouldNavigateToDesktopPageSuccessfully(){

    ItemPage itemPage = new ItemPage();

    itemPage.clickOnBuildYourOwnComputer();

    String expectedText = "Build your own computer";
    Assert.assertEquals(itemPage.itemWelcomeText(), expectedText);

    itemPage.clickOnhddOption();
    itemPage.clickOnAddToCartBtn();

    String addToCartText = "The product has been added to your shopping cart";
    Assert.assertEquals(itemPage.itemNotification(), addToCartText);
}
}
