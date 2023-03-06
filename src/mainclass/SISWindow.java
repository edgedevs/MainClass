/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

//import mainclass.MainSystemLogin;
import java.awt.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.io.*;
import java.util.*;

public class SISWindow extends JFrame implements ActionListener{

    private JPanel menuPanel;
    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    
    protected static String sID;
    protected static String sName;
    protected static String sRecord;
    protected static String sPhoto;
    
    protected static String Blood;
    protected static String totalFee;
    protected static String paidFee;
    protected static String dueFee;
     protected static String address;
    protected static String country;
    protected static String contactNO;
    protected static String email;
    protected static String course;
    
    

    SISWindow(String studentName,String studentRecord, String studentPhotoPath) {
        
         try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        
         //sID=studentID;
         sName=studentName;
         sRecord= studentPhotoPath;
         sPhoto=studentPhotoPath;
         
         
         
               
         
         
         
         setTitle("Student Information System");
        setLayout(null);
        setBounds(500, 110, 1020, 850);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuPanel = new JPanel(null);
        menuPanel.setBounds(0, 0, 250, 850);
        menuPanel.setBackground(Color.darkGray);
         menuPanel.setForeground(Color.white);

        menuPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        JLabel systemLabel = new JLabel(studentName);
        systemLabel.setFont(new Font("Serif", Font.BOLD, 20));
        systemLabel.setForeground(Color.white);
        systemLabel.setBounds(50, 90, 250, 150);

        JLabel imageLabel = new JLabel();
        String str= new String(studentPhotoPath);
        imageLabel.setIcon(new ImageIcon(new ImageIcon(str).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        imageLabel.setBounds(65, 20, 120, 120);

        menuPanel.add(imageLabel);
        menuPanel.add(systemLabel);
       
        JPanel mpanel = new JPanel(null);
        mpanel.setBounds(0, 189, 248, 850);
        mpanel.setBackground(Color.green);
        
        b1= new JButton("Exam Detail");
        b1.addActionListener(this);
        b1.setBounds(24, 50, 200, 40);
        b2= new JButton("Attendance");
        b2.addActionListener(this);
        b2.setBounds(24, 100, 200, 40);
        b3= new JButton("Enrollment");
        b3.addActionListener(this);
        b3.setBounds(24, 150, 200, 40);
        b4= new JButton("WithDraw");
        b4.addActionListener(this);
        b4.setBounds(24, 200, 200, 40);
                              
        b5= new JButton("Fee Detail");
        b5.addActionListener(this);
        b5.setBounds(24, 250, 200, 40);
        b6= new JButton("Medical Report");
        b6.addActionListener(this);
        b6.setBounds(24, 300, 200, 40);
        b7= new JButton("Record Correction");
        b7.addActionListener(this);
        b7.setBounds(24, 350, 200, 40);
        b8= new JButton("Change Password");
        b8.addActionListener(this);
        b8.setBounds(24, 400, 200, 40);
        b9= new JButton("Exit");
        b9.addActionListener(this);
        b9.setBounds(24, 450, 200, 40);
         
        b10= new JButton("Close");
        this.b10.addActionListener(this);
        b10.setBounds(550, 730, 80, 40);
        
        
        b11= new JButton("Back");
        this.b11.addActionListener(this);
        b11.setBounds(640, 730, 80, 40);
        
        
        mpanel.add(b1);
        mpanel.add(b2);
        mpanel.add(b3);
        mpanel.add(b4);
        mpanel.add(b5);
        mpanel.add(b6);
        mpanel.add(b7);
        mpanel.add(b8);
        mpanel.add(b9);
        
        
        
        JPanel sisPanel= new JPanel(null);
        sisPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        sisPanel.setBounds(189, 0,  850, 850);
        sisPanel.setBackground(Color.lightGray);
        
        
        JPanel LogoLabelPanel= new JPanel(null);
        sisPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        LogoLabelPanel.setBounds(350, 40, 550, 250);
        LogoLabelPanel.setBackground(Color.lightGray);
        
        JLabel imageLabel2 = new JLabel();
        imageLabel2.setIcon(new ImageIcon(new ImageIcon("student.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        imageLabel2.setBounds(190, 10, 150, 150);
        
        JLabel Systemlabel = new JLabel("Student Information & Manangement System");
        Systemlabel.setBounds(50, 160, 550, 70);
        Systemlabel.setFont(new Font("Serif", Font.BOLD, 25));
        
        LogoLabelPanel.add(Systemlabel);
        LogoLabelPanel.add(imageLabel2);
        
        //system that is developed for a University to
//save the data of students in records and manage that records and allow students to access this system for checking their information.
        //Student Information & Management System is a Software to manage and show the data of students developed by four university students named Syed Ali, Shehroz Ali, Taimoor Ali & Waqas Ahmed. This Software saves the data of students in records, manage that records and facilitate students to check     This system is developed by four guys named Syed Ali, Shehroz Ali, Taimoor Ali & Waqas Ahmed.
        JLabel textLabel1= new JLabel("Student Information & Management System is a Software to manage and show the  " );
        JLabel textLabel2= new JLabel("data of students developed by four university students named Syed Ali, Shehroz Ali " );
        JLabel textLabel3= new JLabel("and Waqas Ahmed. This Software saves the data of students in records,manage that" );
        JLabel textLabel4= new JLabel("records and facilitate students to check their information. This system secures         " );
        JLabel textLabel5= new JLabel("the data of students ,because only authorized members can access this system. It     " );
        JLabel textLabel6= new JLabel("provides attractive user interface that helps a new user to use this software             " );
        JLabel textLabel7= new JLabel("in a very way.                                                                                                          " );
        
        
                                    //data of students developed by four university students named Syed Ali, Shehroz Ali, Taimoor Ali & Waqas Ahmed.
                                    //This Software saves the data of students in records, manage that records and facilitate students to check
        textLabel1.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(350,10,300,200);
        
        textLabel2.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel2.setForeground(Color.white);
        textLabel2.setBounds(350,15,300,200);
        
        textLabel3.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel3.setForeground(Color.white);
        textLabel3.setBounds(350,20,300,200);
        
        textLabel4.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel4.setForeground(Color.white);
        textLabel4.setBounds(350,25,300,200);
        
        textLabel5.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel5.setForeground(Color.white);
        textLabel5.setBounds(350,30,300,200);
        
        textLabel6.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel6.setForeground(Color.white);
        textLabel6.setBounds(350,35,300,200);
        
        textLabel7.setFont(new Font("times New Roman", Font.BOLD, 14));
        textLabel7.setForeground(Color.white);
        textLabel7.setBounds(350,40,300,200);
        
        
        
        JPanel textPanel=new JPanel(new FlowLayout());
        textPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "About This System"));
        textPanel.setBounds(350,390,550,300);
        textPanel.setBackground(Color.gray);
        textPanel.add(textLabel1);
        textPanel.add(textLabel2);
        textPanel.add(textLabel3);
        textPanel.add(textLabel4);
        textPanel.add(textLabel5);
        textPanel.add(textLabel6);
        textPanel.add(textLabel7);
        //sisPanel.add(imageLabel2);
        //sisPanel.add(Systemlabel);
        
        
        add(b10);
        add(b11);
        add(textPanel);
        
        add(mpanel);
        add(LogoLabelPanel);
        add(menuPanel);
        add(sisPanel);
        setVisible(true);
        
        
        
        

    }
   
    public static void main(String[] args) {
        SISWindow.sName="";
        SISWindow.sRecord="";
        SISWindow.sPhoto="";
       new SISWindow(SISWindow.sName, SISWindow.sRecord, SISWindow.sPhoto);
       
    } 
    
    @Override
    public void actionPerformed(ActionEvent e2) {
        if(e2.getSource() == b1)
        {
            
            setVisible(false);
            new ExamDetailsReader();
        }
        
       
        else if(e2.getSource() == b2)
        {
            
            setVisible(false);
            
            new AttendanceReader();
            
        }
        else if(e2.getSource() == b3)
        {
            setVisible(false);
            
            new Enrollment();
            
        }
        else if(e2.getSource() == b4)
        {
            setVisible(false);
            
            new WithDraw();
            
        }
        else if(e2.getSource() == b5)
        {
            setVisible(false);
            
            new FeeDetails();
            
        }
        else if(e2.getSource() == b6)
        {
            setVisible(false);
            
            new MedicalReport();
            
        }
        else if(e2.getSource() == b7)
        {
            setVisible(false);
            
            //
            new RecordCorrection();
            
        }
        else if(e2.getSource() == b8)
        {
            setVisible(false);
            
            //
            new ChangePasswordSIS();
            
        }
        else if(e2.getSource() == b9)
        {
            //
            setVisible(false);
            
            System.exit(0);
            
        }
        
        else if(e2.getSource() == b10)
        {
            setVisible(false);
            
            System.exit(0);
            
        }
        else if(e2.getSource() == b11)
        {
            setVisible(false);
            
            new MainSystemLogin("adminLogin.dat","studentLogin.dat","facultyLogin.dat");
            
        }
        
        
        
    }
        
        
    }
