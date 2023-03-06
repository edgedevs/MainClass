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
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
/**
 *
 * @author Syed Ali Zawar
 */
public class RecordCorrection implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JFrame s1=new JFrame("Record Correction");
    
    private JButton j1;
    private JButton j2;
    private JButton j3;
    TextField tf1,tf2;
    String str1,str2;
    
    RecordCorrection()
    {
        
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        
        
        s1.setBounds(700,200,400,300);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel(null);
        //p.add(s1);
        
        s1.setVisible(true);
        JLabel l1=new JLabel("Record Correction");
        Font font=new Font("Serif",Font.BOLD,25);
        Font font2=new Font("Serif",Font.BOLD,15);
        l1.setFont(font);
        l1.setBounds(100, 10, 240, 40);
       p.add(l1);
       
       
       JLabel l2=new JLabel("Phone No.");
       l2.setFont(font2);
        l2.setBounds(30, 70, 100, 40);
       p.add(l2);
       tf1=new TextField();
       tf1.setBounds(140,84,180,20);
       p.add(tf1);
       
       JLabel l3=new JLabel("Email:");
       l3.setFont(font2);
        l3.setBounds(30, 110, 100, 40);
       p.add(l3);
       tf2=new TextField();
       tf2.setBounds(140,124,180,20);
       j1=new JButton("Close");
       j1.addActionListener(this);
       j1.setBounds(70,170,70,30);
       p.add(j1);
       j2=new JButton("Back");
       j2.addActionListener(this);
       j2.setBounds(150,170,70,30);
       p.add(j2);
       j3=new JButton("Submit");
       j3.addActionListener(this);
       j3.setBounds(230,170,70,30);
       p.add(j3);
       
       p.add(tf2);
       s1.add(p);
       s1.setVisible(true);
       p.setBackground(Color.decode("#bdb76b"));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        RecordCorrection s1=new RecordCorrection();
    }
    
    @Override
    public void actionPerformed(ActionEvent e2) {
        str1=tf1.getText();
        str2=tf2.getText();
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
        else if(e2.getSource() == j3)
        {
            //s1.setVisible(false);
            //new SISWindow();
            
        }
        
        
        
    }
    
}

