package com.company;
import java.util.Scanner;

public class debugmenuextention1 {

    public void menu2() {

        int de1Auswahl;
        String email = null;

        final validatorcheckbeta validatorcheckbeta = new validatorcheckbeta();
        
        do {
            final Scanner sc  = new Scanner(System.in);
            final Scanner in = new Scanner(System.in);
            System.out.println("Validation Beta\n" +
                        "1: Check for Validation(Beta)\n" + 
                        "2: Zurück");
            de1Auswahl = in.nextInt();

            switch (de1Auswahl) {
                case 1:
                    try {
                        System.out.println("Geben Sie ihre EMail ein: ");
                        email = sc.next();
                        validatorcheckbeta.validator(email);
                    } catch (final Exception s) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    try {
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        sc.close();
                        in.close();
                    }            
                default:
                    break;
            }
        } while (de1Auswahl < 10);    
    }
}