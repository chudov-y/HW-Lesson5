import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void clickHover(){
        open("");
        $("header").$(byTagAndText("button", "Solutions")).hover();
        $("header").$(byTagAndText("a", "Enterprise")).click();
        $("main h1").shouldHave(text("Build like the best")).shouldBe(visible);
    }
}
