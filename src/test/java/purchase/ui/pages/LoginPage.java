package purchase.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement userNameInput = element(Selectors.byAttribute("data-test", "username"));

    private SelenideElement passwordInput = element(Selectors.byAttribute("data-test", "password"));

    private SelenideElement loginButton = element(Selectors.byAttribute("data-test", "login-button"));

    public LoginPage openPage() {
        open("https://www.saucedemo.com/");
        return this;
    }

    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys((password));
        loginButton.click();
    }
}
