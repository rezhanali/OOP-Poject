
package ic;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Cards extends JFrame implements ActionListener {
    JButton St=new JButton("Standard");
    JButton Bu=new JButton("Bussiness");
    JButton Pl=new JButton("Platinum");
    JButton Di=new JButton("Diamond");
    JButton Te=new JButton("Test");
    public Cards() {
setTitle("Buy Cards Here");
Container pane = getContentPane();
pane.setLayout(new FlowLayout());
setBounds(0,0,400,100);
pane.add(Te); pane.add(St); pane.add(Bu);
pane.add(Di); pane.add(Pl);}
    public int Price;
    protected String CardType;
    private int CardCode;
    public void SetCardCode(int a){
        int Price=a;
        
    }
    public int getCardCode(){
        return Price;
    }       

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
class SoldCards extends Cards{
    public static void main(String[] args) {
        Cards obj=new Cards();
        obj.SetCardCode(192920);
        System.out.println("this is the card code "+obj.getCardCode());
    }
}
