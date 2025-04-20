package tests.saucedemo.product;

import tests.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage =
                loginPage.clickLoginButtonAndGoToProductsPage("standard_user", "secret_sauce");

        assertTrue(productsPage.isHeaderDisplayed(), "Product page header is not displayed");
    }
}


