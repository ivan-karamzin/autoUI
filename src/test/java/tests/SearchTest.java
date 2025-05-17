package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PageObjectClass;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SearchTest {

    @BeforeEach
    void browserMaximaze () {
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void successfulSearchTest() {

        new PageObjectClass().openAndCheckHeader();

        $$(".Nksl3NhGTWkZD0K6xFGB").get(2).shouldHave(text("Вакансии")).click();
        webdriver().shouldHave(url("https://strongteam.tech/vacancy"));
        $x("//*[@id='root']/div/div/div[2]/div[2]/span[2]").click();
        sleep(4090);
    }
}