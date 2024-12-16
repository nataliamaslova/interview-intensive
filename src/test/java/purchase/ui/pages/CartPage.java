package purchase.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class CartPage {

    private SelenideElement productName = element(Selectors.byAttribute("data-test", "inventory-item-name"));

    private SelenideElement checkoutButton = element(Selectors.byAttribute("data-test", "checkout"));

    public void verifyProductInCart() {
        productName.shouldHave(Condition.text("Sauce Labs Backpack"));
    }

    public void proceedCheckout() {
        checkoutButton.click();
    }


}
