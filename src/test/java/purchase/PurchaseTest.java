package purchase;

import org.junit.jupiter.api.Test;
import purchase.ui.pages.CartPage;
import purchase.ui.pages.CheckoutPage;
import purchase.ui.pages.LoginPage;
import purchase.ui.pages.ProductsPage;

public class PurchaseTest {
    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";


    @Test
    public void userShouldBeAbleToPurchaseProduct() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage().login(USERNAME, PASSWORD);

        ProductsPage productsPage = new ProductsPage();
        productsPage.addToCart();
        productsPage.goToCart();

        CartPage cartPage = new CartPage();
        cartPage.verifyProductInCart();
        cartPage.proceedCheckout();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.fillCheckoutInfo("Alice", "Karol", "50-567");
        checkoutPage.finishCheckout();
        checkoutPage.verifyOrder();
    }
}
