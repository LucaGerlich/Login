package com.company;
import java.util.Scanner;

public class debugmenu {
       

        public void menu(String name, String pw, String email){
            int deAuswahl;
            final safe safe = new safe();
            final jframe jframe = new jframe();
            final validatorcheck validatorcheck = new validatorcheck();
            
            Scanner debuginput  = new Scanner(System.in);
            System.out.println("Debuggmenu\n" +
                    "1: Datei Verschlüsseln\n" +
                    "2: Verschlüsselte Datei auslesen\n" +
                    "3: Check for Validation\n" + 
                    "4: Validation with extra steps\n" + 
                    "5: Check for Validation(Beta)\n" +
                    "6: JFrame starten\n" +
                    "7: Zurück\n" +
                    "8: Kill Program");
            deAuswahl = debuginput.nextInt();

            switch (deAuswahl) {
                case 1:
                    try {
                        safe.encrypt(name, pw, email);
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                    break;
                case 2:
                    try {
                        safe.decrypt(name, pw, email);
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 3:
                    try {
                        System.out.println(email);
                        validatorcheck.validatorchecktest(email);
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 4:
                    try {
                        validatorcheck.validator();
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 5:
                    try {
                        validatorcheck.validator();
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 6:
                    try {
                        jframe.startjframe();
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 7:
                    try {
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 8:
                    try {
                        safe.ServerStop();
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
            
                default:
                    break;
            }

        }

}