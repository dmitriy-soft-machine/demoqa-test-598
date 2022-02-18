package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTestsWithPageObjects extends TestBase {
    AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm();
    String firstName = "Alex";

    @Test
    void textTest() {

        automationPracticeForm.openPage()
        .setFirstName(firstName)
                .setLastName("Peters")
                .setUserEmail("AlexP@mail.ru")
                .setGender("Other").setUserNumber("9131234567")
                .setBirthDate("15","March","1988");

        automationPracticeForm.selectSubjects("Hindi").setHobbies("Music");
        automationPracticeForm.selectPicture("test.jpg");
        automationPracticeForm.setCurrentAddress("Омск");
        automationPracticeForm.setState("NCR");
        automationPracticeForm.setCity("Delhi");
        automationPracticeForm.submitForm();

       automationPracticeForm.checkForm("Student Name", "Alex Peters")
               .checkForm("Student Email", "AlexP@mail.ru")
               .checkForm("Gender", "Other").checkForm("Mobile","9131234567")
               .checkForm("Date of Birth","15 March,1988")
               .checkForm("Subjects","Hindi")
               .checkForm("Hobbies","Music")
               .checkForm("Picture","test.jpg")
               .checkForm("Address","Омск").checkForm("State and City","NCR Delhi");

    }
}
