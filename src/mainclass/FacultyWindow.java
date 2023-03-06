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


public class FacultyWindow extends JFrame implements ActionListener {

    private JPanel menuPanel;
    
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    
    
    protected static String fName;
    protected static String fRecord;
    protected static String fPath;
    FacultyWindow(String facultyName,String facultyRecord,String facultyPhotoPath) {
        
         try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        
         fName=facultyName;
         fRecord=facultyRecord;
         fPath= facultyPhotoPath;
         setTitle("Student Information System");
        setLayout(null);
        setBounds(500, 110, 1020, 850);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel = new JPanel(null);
        menuPanel.setBounds(0, 0, 250, 850);
        menuPanel.setBackground(Color.darkGray);
        menuPanel.setForeground(Color.white);

        menuPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        JLabel systemLabel = new JLabel(facultyName);
        systemLabel.setFont(new Font("Serif", Font.BOLD, 20));
        systemLabel.setForeground(Color.white);
        systemLabel.setBounds(90, 90, 150, 150);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon(new ImageIcon(facultyPhotoPath).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        imageLabel.setBounds(65, 20, 120, 120);

        menuPanel.add(imageLabel);
        menuPanel.add(systemLabel);
       
        JPanel mpanel = new JPanel(null);
        mpanel.setBounds(0, 189, 248, 850);
        mpanel.setBackground(Color.green);
        
        b1= new JButton("Update Exam Detail");
        this.b1.addActionListener(this);
        b1.setBounds(24, 50, 200, 40);
        b2= new JButton("Update Attendance");
        this.b2.addActionListener(this);
        b2.setBounds(24, 100, 200, 40);
        b3= new JButton("Change Password");
        this.b3.addActionListener(this);
        b3.setBounds(24, 150, 200, 40);
        b4= new JButton("Exit");
        this.b4.addActionListener(this);
        
        b4.setBounds(24, 200, 200, 40);
        
        b5= new JButton("Close");
        this.b5.addActionListener(this);
        b5.setBounds(550, 730, 80, 40);
        
        
        b6= new JButton("Back");
        this.b6.addActionListener(this);
        b6.setBounds(640, 730, 80, 40);
        
        

        
        mpanel.add(b1);
        mpanel.add(b2);
        mpanel.add(b3);
        mpanel.add(b4);
        add(b5);
        add(b6);
        //mpanel.add(b7);
        //mpanel.add(b8);
        
        JPanel sisPanel= new JPanel(null);
        sisPanel.setBounds(189, 0, 850, 850);
        sisPanel.setBackground(Color.lightGray);
        
       JPanel LogoLabelPanel= new JPanel(null);
        LogoLabelPanel.setBounds(350, 40, 550, 250);
        LogoLabelPanel.setBackground(Color.lightGray);
        
        JLabel imageLabel2 = new JLabel();
        imageLabel2.setIcon(new ImageIcon(new ImageIcon("student.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        imageLabel2.setBounds(190, 10, 150, 150);
        
        JLabel Systemlabel = new JLabel("Student Information & Manangement System");
        Systemlabel.setBounds(30, 160, 550, 70);
        Systemlabel.setFont(new Font("Serif", Font.BOLD, 25));
        
        LogoLabelPanel.add(Systemlabel);
        LogoLabelPanel.add(imageLabel2);
        
        
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
        
        add(textPanel);
        add(mpanel);
        add(menuPanel);
        add(LogoLabelPanel);
        add(sisPanel);
        
        
        setVisible(true);

    }
   
    public static void main(String[] args) {
        
        
      new FacultyWindow(fName,fRecord,fPath);
       
    } 
    
    public void actionPerformed(ActionEvent e2) {
        if(e2.getSource() == b1)
        {
            new ExamDetailsWriter();
            setVisible(false);
        }
        
        else if(e2.getSource() == b2)
        {
            setVisible(false);
            
            new AttendanceWriter();
            
        }
        else if(e2.getSource() == b3)
        {
            setVisible(false);
            
            new ChangePasswordFaculty();
            
        }
        else if(e2.getSource() == b4)
        {
            setVisible(false);
            System.exit(0);

        }
         else if(e2.getSource() == b5)
        {
            setVisible(false);
            System.exit(0);
        }
         else if(e2.getSource() == b6)
        {
            setVisible(false);
            new MainSystemLogin("adminLogin.dat","studentLogin.dat","facultyLogin.dat");
        }
        
        
    }
        
        
    }