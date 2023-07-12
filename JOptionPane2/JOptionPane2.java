import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class JOptionPane2{
    public static void main(String[] args){

        //JOptionPane.showMessageDialog(2 parameters)
        JOptionPane.showMessageDialog(null, "Hello! Rajib",null,-1);

        //JOptionPane.showMessageDialog(2 parameters)
         JOptionPane.showMessageDialog(null, "How Are You Rajib?", "Question", 3); 
        JOptionPane.showMessageDialog(null, "Whats Happens", "starng", 1);
        JOptionPane.showMessageDialog(null, "Something Wrong", "Warning", 2);

        //JOptionPane.showMessageDialog(5 parameters)
        ImageIcon icon=new ImageIcon("avros.jpg");

        JOptionPane.showMessageDialog(null, "this is rajib", "icon Add", -1,icon);
       
    }
}