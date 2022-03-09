package pages;

import org.junit.jupiter.api.*;

import static utils.RandomUtils.getRandomString;

public class RandomUtilsExamples {
    @Test
    void randomUtilsExamples(){
        System.out.println("Random string of 10 letters: " + getRandomString(10));
    }
}
