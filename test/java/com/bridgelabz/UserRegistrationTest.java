package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    static UserRegistration userRegistration;
    static String name;

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
}
