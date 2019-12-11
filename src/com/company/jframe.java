package com.company;

import javax.swing.JFrame;

public class jframe {

    public void startjframe(){
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setVisible(true);
        loginFrame.setTitle("Login");
        loginFrame.setSize(500,500);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
