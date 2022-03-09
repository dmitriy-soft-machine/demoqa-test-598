package tests;

import com.github.javafaker.*;

public class TestData {
  static Faker faker = new Faker();
 public static String email = faker.internet().emailAddress();
  public static String phone = faker.phoneNumber().subscriberNumber(10);
}
