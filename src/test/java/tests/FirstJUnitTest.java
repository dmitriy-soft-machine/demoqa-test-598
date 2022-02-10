package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {
    @BeforeAll
    static void beforeAll(){}

    @BeforeEach
    void openBrowser(){
        Selenide.open("https://ya.ru");
    }
    @AfterEach
    void  closeBrowser(){
        Selenide.closeWebDriver();
    }
    @AfterAll
    static void afterAll(){}
    @Test
    void textTest(){

    }

    @Test
    void textTest1(){

    }
}
