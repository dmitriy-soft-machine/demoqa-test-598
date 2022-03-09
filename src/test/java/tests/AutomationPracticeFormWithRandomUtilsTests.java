package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static tests.TestData.*;
import static utils.RandomUtils.getRandomString;

public class AutomationPracticeFormWithRandomUtilsTests extends TestBase{
String firstName = getRandomString(10),
        lastName = getRandomString(10);
    @Test
    void textTest() {
        open("/automation-practice-form");
        $x("//*[@id='firstName']").setValue(firstName);
        $x("//input[@id='lastName']").setValue(lastName);
        $x("//*[@id='userEmail']").setValue(email);
        $x("//*[text() = 'Other']").click();
        $x("//input[@id='userNumber']").setValue(phone);
        $x("//*[@id ='dateOfBirthInput']").click();
        $x("//*[@class='react-datepicker__month-select']").selectOption("March");
        $x("//*[@class='react-datepicker__year-select']").selectOption("1988");
        $x("//*[@class='react-datepicker__day react-datepicker__day--015']").click();
        $x("//*[@id ='subjectsInput']").setValue("Hindi").pressEnter();
        $x("//*[text() = 'Music']").click();
        $x("//*[@id ='uploadPicture']").uploadFromClasspath("test.jpg");
        $x("//*[text() = 'Other']").click();
        $x("//*[@id ='currentAddress']").setValue("Омск");
        $x("//*[@id='state']").click();
        $x("//*[text() = 'NCR']").click();
        $x("//*[@id ='city']").click();
        $x("//*[text() ='Delhi']").click();
        $x("//*[text() = 'Submit']").click();
        $x("//*[@class ='modal-header']").shouldHave(text("Thanks for submitting the form"));
        $x("//*[@class='table-responsive']").shouldHave(text("Student Name" +" "+ firstName +" "+ lastName ), text("Student Email AlexP@mail.ru"),
                text("Gender Other"), text("Mobile 9131234567"), text("Date of Birth 15 March,1988"),
                text("Subjects Hindi"), text("Hobbies Music"), text("Picture"),
                text("Address Омск"), text("State and City NCR Delhi"));
    }
}
