package registration;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import registration.ui.models.Account;
import registration.ui.pages.CreateNewAccountPage;
import registration.utils.RandomData;

public class RegistrationTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://courses.ultimateqa.com/users/sign_up";
        Configuration.browser = "firefox";
//        Configuration.timeout = 10;
    }

    @Test
    public void userCanBeAbleRegister() {
        // 1.1. Подготовка страницы
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        createNewAccountPage.open();

        // 1.2. Подготовка данных
        Account account = Account.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .email(RandomData.randomString() + "@gmail.com")
                .password(RandomData.randomString())
                .isReadTerms(true)
                .build();

        // 2. Шаги теста
        createNewAccountPage.register(account);

        // 3. Проверка ожидаемого результата

    }
}
