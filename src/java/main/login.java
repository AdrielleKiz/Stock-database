package src.java.main;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class login {
    private String user_name;
    private String user_pass;

    public void logInPage(boolean b) {
        JFrame frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(500, 150);
        frame.setVisible(b);
    }
    
    private String getName(){
        return getName();
    }

    private void setName(String username){
        this.user_name = username;

    }
    private String getPass(){
        return getPass();
    }

    private void setPass(String password){
        this.user_pass = password;

    }
}
