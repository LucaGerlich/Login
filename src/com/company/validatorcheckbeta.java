package com.company;

public class validatorcheckbeta {

    emailvalidator emailvalidator = new emailvalidator();
    
    public void validator(String email){

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