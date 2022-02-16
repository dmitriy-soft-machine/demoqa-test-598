package pages;

import com.codeborne.selenide.*;
import org.checkerframework.checker.units.qual.*;
import pages.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {
    // components
   private CalendarComponent calendarComponent = new CalendarComponent();
    // Locators
    private SelenideElement firstNameInput = $x("//*[@id='firstName']"),
            lastNameInput =  $x("//input[@id='lastName']"),
            userEmailInput =  $x("//*[@id='userEmail']"),
            resultTable = $x("//*[@class='table-responsive']"),
            userNumberInput=$x("//input[@id='userNumber']"),
            subjectsInput=$x("//*[@id ='subjectsInput']"),
            PictureLocator= $("#uploadPicture"),
            CurrentAddressInput=$x("//*[@id ='currentAddress']");



    // Actions
    public AutomationPracticeForm openPage(){
        open("/automation-practice-form");
        return this;
    }
    public  AutomationPracticeForm  setFirstName(String firstName) {
    firstNameInput.setValue(firstName);
        return this;
}
    public  AutomationPracticeForm  setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }
    public  AutomationPracticeForm  setUserEmail(String UserEmail) {
        userEmailInput.setValue(UserEmail);
        return this;
    }
    public  AutomationPracticeForm  setGender(String Gender) {
        $(byText(Gender)).click();
        return this;
    }
    public  AutomationPracticeForm  setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
    }
    public  AutomationPracticeForm  selectSubjects(String Subjects) {
        subjectsInput.setValue(Subjects).pressEnter();
        return this;
    }
    public  AutomationPracticeForm  setHobbies(String Hobbies) {
        $(byText(Hobbies)).click();
        return this;
    }
    public  AutomationPracticeForm  selectPicture(String FileName) {
        PictureLocator.uploadFromClasspath(FileName);
        return this;
    }
    public  AutomationPracticeForm  setCurrentAddress(String CurrentAddress) {
        CurrentAddressInput.setValue(CurrentAddress);
        return this;
    }
    public  AutomationPracticeForm  checkForm(String fieldName, String value) {
        resultTable.$(byText(fieldName)).parent().shouldHave(text(value));
        return this;
}
    public void setBirthDate (String day, String month, String year){
        $x("//*[@id ='dateOfBirthInput']").click();
        calendarComponent.setDate(day, month, year);
    }

}
