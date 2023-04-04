package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validate(String Firstname) throws InvalidFirstNameException{
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Firstname);
        if (matcher.matches())
            return true;
        else {
            throw new InvalidFirstNameException("Invalid first name !!! Please check your first name");
        }
    }

    public boolean validateLastname(String Lastname)throws InvalidLastNameException{
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Lastname);
        if(matcher.matches())
            return true;
        else
        {
            throw new InvalidLastNameException("Invlid last name !!! Please check Your last name");
        }
    }
    public boolean validateEmail(String Email) throws InvalidEmailIdException {
        Pattern pattern3 = Pattern.compile("^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$");
        Matcher matcher3 = pattern3.matcher(Email);
        if (matcher3.matches())
            return true;
        else
            throw new InvalidEmailIdException("Please check Your Email ID");
    }

    public boolean validatPhoneNumber(String mobileNumber) throws InvalidPhoneNumberException{
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher(mobileNumber);
        if(matcher4.matches())
            return true;
        else
            throw new InvalidPhoneNumberException("Please Enter Your Valid phone number");
    }

    public boolean validatePassword(String password)throws InvalidPasswordException
    {
        Pattern pattern5 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$");
        Matcher matcher5 = pattern5.matcher(password);
        if (matcher5.matches())
            return true;
        else
            throw new InvalidPasswordException("Please Enter correct password");
    }

}
