package com.bridgelabz;

public class InvalidPasswordException extends Exception{
    InvalidPasswordException(String str) /// parametrised constructor
    {
        super(str);
    }
}
