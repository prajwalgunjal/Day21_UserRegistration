package com.bridgelabz;
public class InvalidPhoneNumberException extends Exception{
    InvalidPhoneNumberException(String str) /// parametrised constructor
    {
        super(str);
    }
}
