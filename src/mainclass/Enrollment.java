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
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import mainclass.SISWindow;
import javax.swing.JFrame;
/**
 *
 * @author Syed Ali Zawar
 */
public class Enrollment implements ActionListener{
    
    JButton j2;
    JButton j1;
    JButton j3;
    int count=0,fees=0;
    JCheckBox c1,c2,c3,c4,c5,c6;
    
    String enrolledSub="";
    
   
    JFrame s1=new JFrame("Enrolment Form");
   // 
    /**
     * @param args the command line arguments
     */
    public Enrollment()
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
       
         JLabel l10=new JLabel("Enrollment Form");
        
        l10.setFont(font);
        l10.setBounds(180, 130, 240, 40);
       p.add(l10);
        
        
        JLabel l1=new JLabel("Subjects");
        l1.setFont(font3);
        l1.setBounds(55, 190, 240, 40);
       p.add(l1);
   
       
       JLabel l13=new JLabel("Credit Hours");
        
        l13.setFont(font3);
        l13.setBounds(400, 190, 240, 40);
        p.add(l13);
      
       c1=new JCheckBox("Human Recource Management");
       c2=new JCheckBox("Professional Practices");
       c3=new JCheckBox("Java");
       c4=new JCheckBox("Linear Aligebra");
       c5=new JCheckBox("Data Sturcture and Algorithm");
       c6=new JCheckBox("Computer Communication and Network");
       
      
       
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
        j1.setBounds(160, 450, 80, 30);
       j2=new JButton("Back");
       j2.addActionListener(this);
       j2.setBounds(250, 450, 80, 30);
       j3=new JButton("Submit");
       j3.addActionListener(this);
       j3.setBounds(340, 450, 80, 30);
       
       p.add(j1);
       p.add(j3);
       p.add(j2);
        
 
        s1.add(p);
        s1.setVisible(true);
       p.setBackground(Color.decode("#bdb76b"));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Enrollment();
    }
    
    public void writeinFile(String s) {
        try {

            //String  addedRecord=str2+"|"+str1+"|"+str1+"4321"+"|"+gender+"|"+str3+"|"+str4+"+"+str5+"|"+str6+"|"+str7+"|"+str8+"|"+str9+"|"+str10+"|"+str11+"|";
            File file = new File("studentEnrollment.dat");

            String trrr = s;
            // FileOutputStream fos = new FileOutputStream(file);
            FileWriter fw2 = new FileWriter(file.getAbsolutePath(), true);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.newLine();
            bw2.write(trrr);

            // fw2.close();
            bw2.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Record Added Successfully ");
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
            String saveinRecord=MainSystemLogin.sID+"|";
            if(c1.isSelected())
            {
                enrolledSub=enrolledSub+"HRM, ";
                saveinRecord=saveinRecord+"Human Resources Management|";
            }
             if(c2.isSelected())
            {
                enrolledSub=enrolledSub+"PP, ";
                saveinRecord=saveinRecord+"Prpfessional Practices|";
            }
             if(c3.isSelected())
            {
                enrolledSub=enrolledSub+"Java, ";
                saveinRecord=saveinRecord+"Java|";
            }
             if(c4.isSelected())
            {
                enrolledSub=enrolledSub+"Linear Algebra, ";
                saveinRecord=saveinRecord+"Linear Algebra|";
            }
             if(c5.isSelected())
            {
                enrolledSub=enrolledSub+",Data Structure and Algorithm, ";
                saveinRecord=saveinRecord+"Data Structure and Algorithm|";
            }
            if(c6.isSelected())
            {
                enrolledSub=enrolledSub+",Computer Communication and Networks ";
                saveinRecord=saveinRecord+"Computer Communication and Networks|";
            }
           // System.out.println(saveinRecord);
            
            writeinFile(saveinRecord);
        }
        
        
    }
    
}

