package com.company;
import java.util.Scanner;

public class debugmenu {
       

        public void menu(String name, String pw, String email){
            int deAuswahl;
            final safe safe = new safe();
            final jframe jframe = new jframe();
            final validatorcheck validator = new validatorcheck();
            final validatorchecktest validatortest = new validatorchecktest();
            
            Scanner debuginput  = new Scanner(System.in);
            System.out.println("Debuggmenu\n" +
                    "1: Datei Verschlüsseln\n" +
                    "2: Verschlüsselte Datei auslesen\n" +
                    "3: Check for Validation\n" + 
                    "4: Validation with extra steps\n" +
                    "5: JFrame starten\n" +
                    "6: Zurück\n" +
                    "7: Kill Program");
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
                        validatortest.validator(email);
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }
                case 4:
                    try {
                        validator.validator();
                    } catch (Exception e) {
                        System.out.println(e);
                        debuginput.close();
                    }

                case 5:
                    try {
                        jframe.startjframe();
                    } catch (Exception e) {
                    }
                case 6:
                    try {
                    } catch (Exception e) {
                    }
                case 7:
                    try {
                        safe.ServerStop();
                    } catch (Exception e) {
                    }
            
                default:
                    break;
            }

        }

}