package pages;

import com.codeborne.selenide.*;
import org.checkerframework.checker.units.qual.*;
import pages.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeForm {
    // components
   private CalendarComponent calendarComponent = new CalendarComponent();
    // Locators
    private SelenideElement firstNameInput = $x("//*[@id='firstName']"),
            lastNameInput =  $x("//input[@id='lastName']"),
            resultTable = $x("//*[@class='table-responsive']");



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

    public  AutomationPracticeForm  checkForm(String fieldName, String value) {
        resultTable.$(byText(fieldName)).parent().shouldHave(text(value));
        return this;
}
    public void setBirthDate (String day, String month, String year){
        $x("//*[@id ='dateOfBirthInput']").click();
        calendarComponent.setDate(day, month, year);
    }

}
