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
            pictureLocator= $("#uploadPicture"),
            currentAddressInput=$x("//*[@id ='currentAddress']"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitButton = $("#submit");
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
    public  AutomationPracticeForm  setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }
    public  AutomationPracticeForm  setGender(String gender) {
        $(byText(gender)).click();
        return this;
    }
    public  AutomationPracticeForm  setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
    }
    public  AutomationPracticeForm  selectSubjects(String subjects) {
        subjectsInput.setValue(subjects).pressEnter();
        return this;
    }
    public  AutomationPracticeForm  setHobbies(String hobbies) {
        $(byText(hobbies)).click();
        return this;
    }
    public  AutomationPracticeForm  selectPicture(String fileName) {
        pictureLocator.uploadFromClasspath(fileName);
        return this;
    }
    public  AutomationPracticeForm  setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }
    public  AutomationPracticeForm  setState(String state) {
        stateInput.scrollTo().click();
        $(byText(state)).click();
        return this;
    }
    public  AutomationPracticeForm  setCity(String city) {
        cityInput.scrollTo().click();
        $(byText(city)).click();
        return this;
    }
    public AutomationPracticeForm submitForm() {
        submitButton.click();

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
