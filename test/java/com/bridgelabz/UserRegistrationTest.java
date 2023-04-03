package com.bridgelabz;
import org.junit.jupiter.api.*;
public class UserRegistrationTest {
    static UserRegistration userRegistration;

@BeforeAll
public static void init(){
    System.out.println("Before all");
    userRegistration = new UserRegistration();
}

// static MoodAnalyzer mood;
//
//
//    @Test
//    public void testAnalyseAbilityMethod_thenAssertionHappy() {
//        mood = new MoodAnalyzer("I am in Happy Mood");
//        assertEquals("HAPPY", mood.analyseability());
//        System.out.println("UC1: Test Case For Happy Passed");
//    }
//
//    @Test
//    public void testAnalyseAbilityMethod_thenAssertionSad() {
//        mood = new MoodAnalyzer("I am in Sad Mood");
//        assertEquals("SAD", mood.analyseability());
//        System.out.println("UC1: Test Case For Sad Passed");
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
        String Arr[] = {"abc@yahoo.com","abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com","abc@yahoo.com"};
        for(int i=0;i< Arr.length;i++)
        {
            boolean email = userRegistration.validateEmail(Arr[i]);
            Assertions.assertTrue(email);
            System.out.println(i+1+") Email sample Checked");
        }
        System.out.println("All test case successfully Passed!!!!");
    }
}