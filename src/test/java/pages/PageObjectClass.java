package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PageObjectClass {
    public void openAndCheckHeader() {
        open("https://strongteam.tech/");
        $$(".Nksl3NhGTWkZD0K6xFGB").get(0).shouldHave(text("Услуги"));
        $$(".Nksl3NhGTWkZD0K6xFGB").get(1).shouldHave(text("О нас"));
        $$(".Nksl3NhGTWkZD0K6xFGB").get(2).shouldHave(text("Вакансии"));
        $$(".Nksl3NhGTWkZD0K6xFGB").get(3).shouldHave(text("Контакты"));
    }

    public void browserMaximaze (String firstSize, String secondSize) {
        Configuration.browserSize = firstSize+"x"+secondSize;
    }

    public void firstNameInput (String firstNameValue) {
        $("#firstName").setValue(firstNameValue);
    }

    public void lastName (String lastNameInput) {
        $("#lastName").setValue(lastNameInput);
    }

    public void email (String email) {
        $("#userEmail").setValue(email);
    }

}
