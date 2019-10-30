package testsuite;


import com.nocommerce.demo.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class ShoppingCartTest extends TestBase {

//    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test (groups = {"sanity"})

    public void userShouldNavigateToShoppingCartPage(){

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        shoppingCartPage.clickOnShoppinCartLink();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.varifyWelcomeText(), expectedText);
    }
}
