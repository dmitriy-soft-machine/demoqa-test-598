package tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
