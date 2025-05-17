package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PageObjectClass;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class FormTest {

    @BeforeEach
    void setUp() {
        new PageObjectClass().browserMaximaze("1920","1080");
    }

    @Test
    void checkFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Faker faker = new Faker();

        open("https://demoqa.com/automation-practice-form");
        new PageObjectClass().firstNameInput(faker.beer().name());
        new PageObjectClass().lastName(faker.beer().name());
        new PageObjectClass().email("IvanKrutoy@mail.ru");


        $$(".custom-control-label").get(2).click();
        $("#userNumber").setValue(faker.beer().name());
//        $("#dateOfBirthInput").click();
        $$(".custom-control-label").get(4).click();
        $("#2currentAddress").setValue("Pushkina Streed Kolotushkino house");

    }
}
