package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {
    public void setDate (String day, String month, String year){
        $x("//*[@class='react-datepicker__month-select']").selectOption(month);
        $x("//*[@class='react-datepicker__year-select']").selectOption(year);
        $(byText(day)).click();


       /* $x("//*[@id='dateOfBirthInput'] and *[@value='"+day+ " "+month+ " "+year+"']").parent().click();*/
        //*[@id="dateOfBirthInput"]
    }
}
