
package com.mycompany.showinputdialog;

import javax.swing.JOptionPane;
public class ShowInputDialog {

    public static void main(String[] args) {
        String firstName= JOptionPane.showInputDialog("Enter Your First Name:");
      String lastName= JOptionPane.showInputDialog("Enter Your Last firstName");
       JOptionPane.showMessageDialog( null,"Your Full Name: "+ firstName +" "+lastName);
      
        
    }
}
