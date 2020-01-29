
package hw1;

import javax.swing.JOptionPane;


public class HW1 {

  
    public static void main(String[] args) {
     int a=0;
     while (a == 0){
         int number=Integer.parseInt(JOptionPane.showInputDialog("enter an integer"));
        if ((number % 2 != 0)){
             JOptionPane.showMessageDialog(null,"this number is odd");
         }
        else{
             JOptionPane.showMessageDialog(null,"this number is even");
        }
     
     int x=JOptionPane.showConfirmDialog(null,"do another","select",JOptionPane.YES_NO_CANCEL_OPTION);
     if(x==JOptionPane.CANCEL_OPTION){
         System.exit(0);
     }
     else if (x==JOptionPane.NO_OPTION){
         System.exit(0); 
     }
    }
    }
}
