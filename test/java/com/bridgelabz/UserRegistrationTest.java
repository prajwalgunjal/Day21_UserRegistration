package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

@BeforeAll
public static void init(){
    System.out.println("Before all");
    userRegistration = new UserRegistration();
}
@Test
    void givenFirstnameshouldreturnTrue(){
        boolean value = userRegistration.validate("Prajwal");
        Assertions.assertTrue(value);
    System.out.println("First Name Checked:- Successfully passed UC1");
    }
    @Test
    void givenLastNameShouldReturnTrue(){
        boolean LastName = userRegistration.validateLastname("Gunjal");
        Assertions.assertTrue(LastName);
        System.out.println("Last Name Checked :- Successfully passed UC2");
    }

    @Test
    void givenEmailidShouldReturnTrue(){
    boolean Email = userRegistration.validateEmail("Prajwal23@gmail.com");
    Assertions.assertTrue(Email);
        System.out.println("Email ID Checked :- Successfully Passed UC3");
    }
    @Test
    void givenMobileNumberShouldReturnTrue(){
        boolean PhoneNumber = userRegistration.validatPhoneNumber("919881640062");
        Assertions.assertTrue(PhoneNumber);
        System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
    }

    @Test
    void checkPasswordShouldReturnTrue(){
    boolean Password = userRegistration.validatePassword("Password1@");
    Assertions.assertTrue(Password);
        System.out.println("Password Checked(Rule1 & Rule2 & Rule3,Rule4,Rule5) :- Successfully Passes UC5,UC6,UC7,UC8");
    }
    @Test
    void checkEmailShouldReturnTrue(){
        String text = "abc@yahoo.com";
        String text1 = "abc-100@yahoo.com";
        String text2 = "abc111@abc.com";
        String text3 = "abc-100@abc.net";
        String text4 = "abc.100@abc.com.au";
        String text5 = "abc@1.com";
        String text6 = "abc@gmail.com.com";
        String text7 = "abc+100@gmail.com";
        String text8 = "abc@yahoo.com";
        boolean email = userRegistration.validateEmail(text);
        boolean email1 = userRegistration.validateEmail(text1);
        boolean email2 = userRegistration.validateEmail(text2);
        boolean email3 = userRegistration.validateEmail(text3);
        boolean email4 = userRegistration.validateEmail(text4);
        boolean email5 = userRegistration.validateEmail(text5);
        boolean email6 = userRegistration.validateEmail(text6);
        boolean email7 = userRegistration.validateEmail(text7);
        boolean email8= userRegistration.validateEmail(text8);
        Assertions.assertTrue(email);
        Assertions.assertTrue(email1);
        Assertions.assertTrue(email2);
        Assertions.assertTrue(email3);
        Assertions.assertTrue(email4);
        Assertions.assertTrue(email5);
        Assertions.assertTrue(email6);
        Assertions.assertTrue(email7);
        Assertions.assertTrue(email8);
        System.out.println("All test case successfully Passed!!!!");
    }
}