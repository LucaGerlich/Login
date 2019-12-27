package com.company;

import java.util.Scanner;

public class validatorcheck {

    String tempEmail = null;
    Boolean valid = null;

    emailvalidator emailvalidator = new emailvalidator();
    
    public void validator(){
        Scanner valinput = new Scanner(System.in);
        System.out.println("Geben Sie ihre EMail ein:");
        tempEmail = valinput.next();

        try {
            boolean valid = emailvalidator.validateEmail(tempEmail);
            System.out.println("Email ID " + tempEmail + " is valid? " + valid);
            valinput.close(); 
            return;
            
        } catch (Exception e) {
            System.out.println(e);
            valinput.close();
        }
    }
}
