

import javax.swing.JOptionPane;

public class showConfirmDialog {
    public static void main(String[] args) {
      int rajib=  JOptionPane.showConfirmDialog(null, "Do You want To Quit","title",JOptionPane.YES_NO_OPTION);
      if(rajib==JOptionPane.YES_OPTION){
          System.exit(0);
      }else{
          System.out.println("You Have Clicked No Option");
          
      }
    }
    
}
