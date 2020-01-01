package com.company;

import java.util.Scanner;

public class validatorcheck {

    String tempEmail = null;
    String email = null;
    Boolean valid = null;
    Boolean done = false;

    emailvalidator emailvalidator = new emailvalidator();
    
    public void validator(){
        Scanner valinput = new Scanner(System.in);
        System.out.println("Geben Sie ihre EMail ein:");
        tempEmail = valinput.next();
        
        do {
            try {
                boolean valid = emailvalidator.validateEmail(tempEmail);

                if (valid == true) {
                    System.out.println("Email ID: " + tempEmail + " is valid!");
                } else {
                    System.out.println("Email ID: '" + tempEmail + "' is not valid!");
                }
                valinput.close(); 
                return;
            
            } catch (Exception e) {
                System.out.println(e);
                valinput.close();
            }
        } while (!done);
    }

    public void validatorcheckbeta(String email){
        try {
            boolean valid = emailvalidator.validateEmail(email);

            if (valid == true) {
                System.out.println("Email ID: " + email + " is valid!");
            } else {
                System.out.println("Email ID: '" + email + "' is not valid!");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void validatorchecktest(String email){
        try {
            boolean valid = emailvalidator.validateEmail(email);

            if (valid == true) {
                System.out.println("Email ID: " + email + " is valid!");
            } else {
                System.out.println("Email ID: '" + email + "' is not valid!");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
