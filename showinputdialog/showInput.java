
package com.mycompany.showinputdialog;

import javax.swing.JOptionPane;


public class showInput {
    public static void main(String[] args) {
       String frist_Name = JOptionPane.showInputDialog("Enter Your First Name: ", "rajib");
       String last_Name = JOptionPane.showInputDialog(null,"Enter Your Last Name: ","this is title",1);
       String fullName=frist_Name+last_Name;
       JOptionPane.showMessageDialog(null,fullName);
    }
            
}
