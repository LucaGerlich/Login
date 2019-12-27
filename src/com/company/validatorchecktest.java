package com.company;

public class validatorchecktest {

    emailvalidator emailvalidator = new emailvalidator();
    
    public void validator(String email){

        try {
            boolean valid = emailvalidator.validateEmail(email);
            System.out.println("Email ID " + email + " is valid? " + valid);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}