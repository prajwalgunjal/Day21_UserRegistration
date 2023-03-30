package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Scanner;
import java.util.Stack;

public class UserRegistrationTest {
    static UserRegistration userRegistration;
    static String name;


@Test
    void givenFirstnameshouldreturnTrue(){
        boolean value = userRegistration.validateFirstName("Prajwal");
        Assertions.assertTrue(value);
    System.out.println("Successfully passed UC1");
    }
}
