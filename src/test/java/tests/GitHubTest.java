package tests;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {

    @BeforeEach
    void browserMaximaze () {
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void successfulSearchTest() {
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();
        $$(".search-title a").get(0).doubleClick();
        $$(".text-normal").get(1).shouldHave(text("selenide / selenide"));
        actions().sendKeys();
//        $(".author a").shouldHave(text("selenide"));
//        $(".mx-1").shouldHave(text("/"));
//        $(".mr-2 a").shouldHave(text("selenide"));
    }
}
