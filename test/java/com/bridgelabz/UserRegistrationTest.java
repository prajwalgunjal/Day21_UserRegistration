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
}