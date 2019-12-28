package com.company;

import java.util.*;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.io.IOException;

/**
 * @author Lucag
 */

public class Main{

    public static void main(final String[] args) throws IOException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException {

        String email = null;
        String name = null;
        String pw = null;
        int Auswahl;
        final safe safe = new safe();
        final debugmenu debugmenu = new debugmenu();

        do {
            final Scanner sc = new Scanner(System.in);
            final Scanner in = new Scanner(System.in);
            System.out.println("MENU\n" +
                    "1: Registrieren \n" +
                    "2: Einloggen\n" +
                    "3: Account löschen\n"+
                    "4: Debug Menu\n"+
                    "\n" +
                    "5: Beenden");
            Auswahl = in.nextInt();

            switch (Auswahl) {
                case 1:
                    try {
                        System.out.println("Geben Sie ihren Name ein: ");
                        name = sc.next();
                    } catch (final Exception e) {
                        System.out.println(e);
                    }
                    try {
                        System.out.println("Geben Sie ihre EMail ein: ");
                        email = sc.next();

                        //validator.validator();
                    } catch (final Exception s) {
                        System.out.println(s);
                    }
                    try {
                        System.out.println("Geben Sie ein Passwort ein: ");
                        pw = sc.next();
                    } catch (final Exception h) {
                        System.out.println(h);
                    }
                    safe.setSpeichernText(name, pw, email);
                    break;
                case 2:
                    safe.login(name, pw, email);
                    break;
                case 3:
                    safe.deleteAdresse(name, pw, email);
                    break;
                case 4:
                    debugmenu.menu(name, pw, email);
                    break;
                case 5:
                    sc.close();
                    in.close();
                    safe.ServerStop();
                    break;
            }
        } while (Auswahl < 10);
        safe.ServerStop();
    }
}
