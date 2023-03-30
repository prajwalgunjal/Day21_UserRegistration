package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validate(String Firstname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Firstname);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastname(String Lastname){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Lastname);
        if(matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String Email) {
        Pattern pattern3 = Pattern.compile("^[0-9a-zA-Z]+([a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");
        Matcher matcher3 = pattern3.matcher(Email);
        if (matcher3.matches())
            return true;
        else
            return false;
    }

}
