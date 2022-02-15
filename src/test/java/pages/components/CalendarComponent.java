package pages.components;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {
    public void setDate (String day, String month, String year){
        $x("//*[@id ='dateOfBirthInput']").click();
        $x("//*[@class='react-datepicker__month-select']").selectOption("March");
        $x("//*[@class='react-datepicker__year-select']").selectOption("1988");
        $x("//*[@class='react-datepicker__day react-datepicker__day--015']").click();
        $("[arial-label$='"+ month +" "+day+ "th, "+year+ "']").click();
    }
}
