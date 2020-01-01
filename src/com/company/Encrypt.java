package com.company;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class Encrypt {

    String encName;
    String encPw;
    String encEmail;

    public void setEncPw(String Name, String Pw, String Email) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        FileInputStream inFile = new FileInputStream("test2.txt");
        FileOutputStream outFile = new FileOutputStream("test2.des");

        String password = encPw;
        PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
        SecretKeyFactory secretKeyFactory = SecretKeyFactory
                .getInstance("PBEWithMD5AndTripleDES");
        SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);

        byte[] salt = new byte[8];
        Random random = new Random();
        random.nextBytes(salt);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);
        Cipher cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, pbeParameterSpec);
        outFile.write(salt);

        byte[] input = new byte[64];
        int bytesRead;
        while ((bytesRead = inFile.read(input)) != -1) {
            byte[] output = cipher.update(input, 0, bytesRead);
            if (output != null)
                outFile.write(output);
        }

        byte[] output = cipher.doFinal();
        if (output != null)
            outFile.write(output);

        inFile.close();
        outFile.flush();
        outFile.close();
    }
    public void loginEnc(String encName, String encPw, String encEmail) {
    }
}
