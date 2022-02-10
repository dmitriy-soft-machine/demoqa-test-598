package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void textTest() {
        open("/automation-practice-form");
        $x("//*[@id=\"firstName\"]").setValue("Alex");
        $x("//*[@id=\"lastName\"]").setValue("Peters");
        $x("//*[@id=\"userEmail\"]").setValue("AlexP@mail.ru");
        $x("//label[@for='gender-radio-1']").click();
        $x("//input[@id='userNumber']").setValue("9131234567");
      /*  $x("//input[@id='dateOfBirthInput']").setValue("10.10.1989");*/
        $x("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']").setValue("en").click();
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//textarea[@id='currentAddress']").setValue("Current Address");
        $x("//div[@class=' css-1uccc91-singleValue']").setValue("Haryana");
        $x("//div[contains(@class,'css-1pahdxg-control')]//div[contains(@class,'css-1hwfws3')]").setValue("Karnal");
        $x("//button[@id='submit']").click();

        /*$x().click();*/

        $x("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]").shouldHave(text("Male"));
    }
}
