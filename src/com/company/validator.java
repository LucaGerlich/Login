package com.company;

import java.util.Scanner;

public class validator {

    String TempMail = null;

    private static emailvalidator emailvalidator;
    
    public void validatorcheck(){
        Scanner vinput  = new Scanner(System.in);
        System.out.println("Bitte gib eine EMail ein:");
        TempMail = vinput.next();

        boolean valid = emailvalidator.validateEmail(TempMail);
        System.out.println("Email ID " + TempMail + " is valid? " + valid);
    }
}
