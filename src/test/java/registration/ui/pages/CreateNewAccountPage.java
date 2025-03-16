package registration.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import registration.ui.models.Account;

import static com.codeborne.selenide.Selenide.element;

@Getter
public class CreateNewAccountPage {
    private SelenideElement firstNameInput = element(Selectors.byId("user[first_name]"));

    private SelenideElement lastNameInput = element(Selectors.byId("user[last_name]"));

    private SelenideElement emailInput = element(Selectors.byId("user[email]"));

    private SelenideElement passwordInput = element(Selectors.byId("user[password]"));

    private SelenideElement termCheckbox = element(Selectors.byId("user[terms]"));

    private SelenideElement signupButton =  element(Selectors.byAttribute("type", "submit"));

    public void open() {
        Selenide.open("");
    }

    public void register(Account account) {
        firstNameInput.sendKeys(account.getFirstName());
        lastNameInput.sendKeys(account.getLastName());
        emailInput.sendKeys(account.getEmail());
        passwordInput.sendKeys(account.getPassword());
        termCheckbox.setSelected((account.isReadTerms()));
        signupButton.click();
    }
}
