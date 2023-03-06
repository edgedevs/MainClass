/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.event.*;



public class FeeDetails implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JFrame s1=new JFrame("Medical Report");
    
    JButton j1;
    JButton j2;
    public FeeDetails()
    {
        
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        
        s1.setBounds(700,200,390,350);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1=new JPanel(null);
        Font font2=new Font("Serif",Font.BOLD,20);
        Font font3=new Font("Serif",Font.BOLD,15);
        
        Font font=new Font("Serif",Font.BOLD,25);
        JLabel l4=new JLabel("Fee Details");
        l4.setFont(font);
        l4.setBounds(140,20,200,30);
        p1.add(l4);
        
       /* JLabel l1=new JLabel("ID:");
        l1.setFont(font3);
        l1.setBounds(10,50,70,30);
        
        JLabel l2=new JLabel("Name:");
        l2.setFont(font3);
        l2.setBounds(10,80,50,30);
*/
        
        JLabel l3=new JLabel("Total:  "+MainSystemLogin.totalFee);
        l3.setFont(font2);
        l3.setBounds(70,100,200,30);
        
        JLabel l5=new JLabel("Paid:  "+MainSystemLogin.paidFee);
        l5.setFont(font2);
        l5.setBounds(70,140,200,30);
        JLabel l6=new JLabel("Due:  "+MainSystemLogin.dueFee);
        l6.setFont(font2);
        l6.setBounds(70,180,200,30);
        
        p1.setBackground(Color.decode("#bdb76b"));
        ImageIcon icon=new ImageIcon("blood_drop.png");
        s1.setIconImage(icon.getImage());
        
       
       JLabel label=new JLabel(icon);
       s1.add(label);
        
       j1=new JButton("Close");
       j1.addActionListener(this);
       j1.setBounds(110,240,70,30);
       p1.add(j1);
       j2=new JButton("Back");
       j2.addActionListener(this);
       j2.setBounds(190,240,70,30);
       p1.add(j2);
       
        p1.add(l5);
        p1.add(l6);
        p1.add(l3);
        
        s1.add(p1);
        s1.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new FeeDetails();
    }
    
    @Override
    public void actionPerformed(ActionEvent e2) {
        if(e2.getSource() == j1)
        {
            s1.setVisible(false);
            System.exit(0);
        }
        
        else if(e2.getSource() == j2)
        {
            s1.setVisible(false);
            new SISWindow(SISWindow.sName,SISWindow.sRecord,SISWindow.sPhoto);
            
        }
        
        
    }
    
}
