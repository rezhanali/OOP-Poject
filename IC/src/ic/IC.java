
package ic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class IC {


    public static void main(String[] args) {
        Cards C=new Cards();
        C.setVisible(true);
 C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 C.Di.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a Diamond card that costs (70.00 iqd)\n with a speed limit of 50 Mb/s\n this is usually used for Organization Networks", "You Chose Dioamond!", JOptionPane.INFORMATION_MESSAGE);
               }});
 C.Bu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a Bussiness card that costs (45.00 iqd)\n with a speed limit of 25 Mb/s\nYou can use this Type of card for a Company or a workplace", "You Chose Bussiness!", JOptionPane.INFORMATION_MESSAGE);
               }});
 C.St.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a Standard card that costs (30.00 iqd)\n with a speed limit of 15 Mb/s\nYou can use this Type of Card for your living place ad it's great for a family!", "You Chose Standard", JOptionPane.INFORMATION_MESSAGE);
               }});
 C.Pl.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a Platinum card that costs (Users Choice)\n with a speed limit of Per Order Mb/s\nYou can use this Type of Card for Almost every Type of Jobs you want to have The best internet Service?\n choose this and Feel Comfortable", "You Chose Platinum", JOptionPane.INFORMATION_MESSAGE);
               }});
 C.Te.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a Test is a 24 hour only internet\n with a speed limit of 15 Mb/s\nYou can use this Type of Card for Testing Our Internet!", "You Chose Test!", JOptionPane.INFORMATION_MESSAGE);
               }});
    }
    
}
