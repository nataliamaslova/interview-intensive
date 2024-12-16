package purchase.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.element;

public class ProductsPage {

    private SelenideElement backpack = element(Selectors.byAttribute("data-test", "add-to-cart-sauce-labs-backpack"));

    private SelenideElement cart = element(Selectors.byAttribute("data-test", "shopping-cart-link"));

    public void addToCart() {
        backpack.click();
    }

    public void goToCart() {
        cart.click();
    }
}
