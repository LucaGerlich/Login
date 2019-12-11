package com.company;

//import java.util.Scanner;

public class validator {

    private static emailvalidator emailvalidator;
    
    public void validatorcheck(String email){
        //System.out.println("Bitte gib eine EMail ein:");
        //Scanner vinput  = new Scanner(System.in);
        //email = vinput.next();

        boolean valid = emailvalidator.validateEmail(email);
        System.out.println("Email ID " + email + " is valid? " + valid);
    }
}
