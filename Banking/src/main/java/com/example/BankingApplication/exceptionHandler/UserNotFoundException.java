package com.example.BankingApplication.exceptionHandler;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(String message){
        super(message);
    }
}
