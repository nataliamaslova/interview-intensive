package purchase.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class CheckoutPage {

    private SelenideElement firstNameInput = element(Selectors.byAttribute("data-test", "firstName"));

    private SelenideElement lastNameInput = element(Selectors.byAttribute("data-test", "lastName"));

    private SelenideElement postalCodeInput = element(Selectors.byAttribute("data-test", "postalCode"));

    private SelenideElement continueButton = element(Selectors.byAttribute("data-test", "continue"));

    private SelenideElement finishButton = element(Selectors.byAttribute("data-test", "finish"));

    private SelenideElement successMessage = element(Selectors.byAttribute("data-test", "complete-header"));

    public void fillCheckoutInfo(String firstName, String lastName, String postalCode) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
    }

    public void finishCheckout() {
        finishButton.click();
    }

    public void verifyOrder() {
        successMessage.shouldHave(Condition.text("Thank you for your order!"));
    }
}
