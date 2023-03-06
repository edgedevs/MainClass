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

 
 
 
public class WithDraw implements ActionListener{
    
    JButton j1;
    JButton j2;
    JButton j3;
    
    JFrame s1=new JFrame("Withdraw Courses");
   // 
    /**
     * @param args the command line arguments
     */
    public WithDraw()
    {
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        s1.setBounds(600,150,600,600);
        
        JPanel p=new JPanel(null);
        p.setBounds(400,100,140,40);
        
        Font font=new Font("Serif",Font.BOLD,25);
        Font font2=new Font("Serif",Font.BOLD,17);
        Font font3=new Font("Serif",Font.BOLD,20);
        
        
        JLabel l11=new JLabel("Name:");
        l11.setFont(font2);
        l11.setBounds(40, 40, 240, 40);
        p.add(l11);
       
        JLabel l12=new JLabel("Reg ID:");
        l12.setFont(font2);
        l12.setBounds(40, 80, 240, 40);
        p.add(l12);
       
         JLabel l10=new JLabel("Withdraw Courses");
        
        l10.setFont(font);
        l10.setBounds(180, 130, 240, 40);
       p.add(l10);
        
        
        JLabel l1=new JLabel("Subjects");
        l1.setFont(font3);
        l1.setBounds(50, 190, 240, 40);
       p.add(l1);
   
       
       JLabel l13=new JLabel("Credit Hours");
        
        l13.setFont(font3);
        l13.setBounds(400, 190, 240, 40);
        p.add(l13);
   
       JCheckBox c1=new JCheckBox("Human Recource Management",true);
       JCheckBox c2=new JCheckBox("Data Sturcture and Algorithm",true);
       JCheckBox c3=new JCheckBox("Java",true);
       JCheckBox c4=new JCheckBox("Linear Aligebra",true);
       JCheckBox c5=new JCheckBox("Professional Practices",true);
       JCheckBox c6=new JCheckBox("Computer Communication and Network",true);
       p.add(c1);
       p.add(c2);
       p.add(c3);
       p.add(c4);
       p.add(c5);
       p.add(c6);
       
       c2.setBounds(50, 235, 220, 15);
       c3.setBounds(50, 265, 220, 15);
       c4.setBounds(50, 290, 220, 15);
       c5.setBounds(50, 320, 220, 15);
       c6.setBounds(50, 350, 250, 15);
       c1.setBounds(50, 380, 220, 15);
       
       JLabel l31=new JLabel("3");
       l31.setFont(font2);
        l31.setBounds(400, 220, 240, 40);
       p.add(l31);
       
       JLabel l32=new JLabel("3");
       l32.setFont(font2);
        l32.setBounds(400, 250, 240, 40);
       p.add(l32);
       JLabel l33=new JLabel("3");
       l33.setFont(font2);
        l33.setBounds(400, 280, 240, 40);
       p.add(l33);
       JLabel l34=new JLabel("3");
       l34.setFont(font2);
        l34.setBounds(400, 310, 240, 40);
       p.add(l34);
       JLabel l35=new JLabel("3");
       l35.setFont(font2);
        l35.setBounds(400, 340, 240, 40);
       p.add(l35);
       JLabel l36=new JLabel("3");
       l36.setFont(font2);
        l36.setBounds(400, 370, 240, 40);
       p.add(l36);
       s1.setVisible(true);
       
        j1=new JButton("Close");
        j1.addActionListener(this);
        j1.setBounds(160, 430, 80, 30);
       j2=new JButton("Back");
       j2.addActionListener(this);
       j2.setBounds(250, 430, 80, 30);
       
       j3=new JButton("Submit");
       j3.addActionListener(this);
        j3.setBounds(340, 430, 80, 30);
       
       
       p.add(j1);

       p.add(j2);
       p.add(j3);
        
 
        s1.add(p);
        s1.setVisible(true);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       p.setBackground(Color.decode("#bdb76b"));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new WithDraw();
    }
    
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
        
        else if(e2.getSource() == j3)
        {
            //s1.setVisible(false);
            //new SISWindow();
            
        }
        
        
    }
    
}
