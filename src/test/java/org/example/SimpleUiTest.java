package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.example.ui.models.BankAccount;
import org.example.ui.pages.RegisterAccountPage;
import org.example.utils.RandomData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SimpleUiTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://parabank.parasoft.com/parabank";
//        Configuration.browser = "firefox";
//        Configuration.timeout = 10;
    }

    @Test
    public void userCanNotCreateAccountWithNameAndSurnameOnly() {
        // 1.1. Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();

        // 1.2. Подготовка данных
        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString()).build();

        // 2. Шаги теста
        registerAccountPage.register(bankAccount);

        // Проверка ожидаемого результата
        registerAccountPage.getAddressErrorField().shouldHave(Condition.exactText("Address is required."));

        // все оставшиеся поля
    }
}
