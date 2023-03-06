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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * This program demonstrates how to use JPanel in Swing. 
 * @author www.codejava.net
 */
public class MainSystemLogin extends JFrame implements ActionListener {
	
	private JLabel labelUsername = new JLabel("Registration ID:    ");
	private JLabel labelPassword = new JLabel("Password:           ");
   private JLabel labelUserType = new JLabel("User Type:   ");
   private JLabel Systemlabel = new JLabel("Student Information & Manangement System");
	private JTextField textRegdNo = new JTextField(20);
	private JPasswordField fieldPassword = new JPasswordField(20);
	private JButton buttonLogin = new JButton("Login");
   private JButton cancelButton = new JButton("Cancel");
   private String user[]={"Administrator","Student","Faculty"};        
   private JComboBox cb=new JComboBox(user);
    
    private String adminPath;
    private String studentPath;
    private String facultyPath;
     String nameFromFile;
     String regdFromFile;
      String passFromFile;
      
    /**
     *
     * @param s
     */
    
    
    
    protected static String sID;
    protected static String sName;
    protected static String sPassword;
    protected static String gender;
    protected static String Blood;
    protected static String totalFee;
    protected static String paidFee;
    protected static String dueFee;
    protected static String address;
    protected static String country;
    protected static String city;
    protected static String contactNO;
    protected static String email;
    protected static String course;
    
    protected static String adminID;
    protected static String adminPass;
    
    protected static String FacultyID;
    protected static String FacultyPass;
	
	public MainSystemLogin(String admin,String student,String Faculty) {
            
            
               
		super("System Login Window");
                setLayout(null);
	        setBounds(500,110,980,850);
                setBackground(Color.blue);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                adminPath=admin;
                studentPath=student;
                facultyPath=Faculty;
                
                 try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
            }
      
                
                JPanel newPanel2 = new JPanel(null);
                newPanel2.setBounds(0,0,980,850);
                newPanel2.setBackground(Color.CYAN);
                
                GridBagConstraints constraints = new GridBagConstraints();
                constraints.insets = new Insets(10, 0, 15, 0);
                constraints.anchor = GridBagConstraints.WEST;
                
		Systemlabel.setFont(new Font("Serif", Font.BOLD, 30));
                
                JLabel iconLabel= new JLabel();
                ImageIcon icon=new ImageIcon("student.png");    
                setIconImage(icon.getImage());
                iconLabel=new JLabel(icon);
                
                
		JLabel imageLabel= new JLabel("");
                imageLabel.setIcon(new ImageIcon(new ImageIcon("student.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
                imageLabel.setBounds(400,50,150,150);
                
                Systemlabel.setBounds(200,150,650,150);
                
                
                constraints.gridx = 1;
		constraints.gridy = 0;
                newPanel2.add(imageLabel);
                
                
                newPanel2.add(Systemlabel);
               
                
                
		//constraints.anchor = GridBagConstraints.WEST;
		
                
                constraints.insets = new Insets(10, 0, 15, 0);
                constraints.anchor = GridBagConstraints.WEST;
                JPanel newPanel = new JPanel(new GridBagLayout());
                newPanel.setBounds(235,300,500,400);
                newPanel.setBackground(Color.green);
                JCheckBox hidePasswordCheckbox=new JCheckBox("Show Password");
                
                
                newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Enter Your Name, Password & User Type"));
                
                


		constraints.gridx = 0;
		constraints.gridy = 1;		
		newPanel.add(labelUsername, constraints);
		constraints.gridx = 1;
		newPanel.add(textRegdNo, constraints);
		
                
		constraints.gridx = 0;
		constraints.gridy = 2;		
		newPanel.add(labelPassword, constraints);
		constraints.gridx = 1;
		newPanel.add(fieldPassword, constraints);
                
                
		constraints.gridx = 1;
                constraints.gridy = 3;
                newPanel.add(hidePasswordCheckbox,constraints);
                
                
                constraints.gridx = 0;
                constraints.gridy = 4;
                newPanel.add(labelUserType, constraints);
                constraints.gridx = 1;
                newPanel.add(cb,constraints); 
                cb.addActionListener(this);
                
                
               
                
                
                constraints.gridx = 1;
		constraints.gridy = 5;
		//constraints.gridwidth = 7;
                newPanel.add(cancelButton,constraints);
     
                constraints.gridx = 1;
                constraints.anchor = GridBagConstraints.CENTER;
                newPanel.add(buttonLogin,constraints);
      
                
                
      
       
       hidePasswordCheckbox.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            fieldPassword.setEchoChar((char) 0);
        } else {
             fieldPassword.setEchoChar('●');
        }
        }
        });

         
                buttonLogin.addActionListener(this);
                cancelButton.addActionListener(this);
     
		add(newPanel);
                add(newPanel2);
                
                setVisible(true);
                
    /**
     *
     * @param s
     */
        
		
		//pack();
		//setLocationRelativeTo(null);
	}
        
        
        
        
	
        
        
	public static void main(String[] args) {
		// set look and feel to the system look and feel
		/*try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		*/
               // new MainSystemLogin();
       }

             
        
        
        public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelButton)
        {
            setVisible(false);
            System.exit(0);
        }
        
        else if(e.getSource() == buttonLogin)
        {
            String user;
            user= textRegdNo.getText();
            
            
            
            String myPass=String.valueOf(fieldPassword.getPassword());
            
            String str= (String)cb.getSelectedItem();
            
           
            if( str.equals("Student"))
            {
                
                
               Vector data;
               String aLine ;
               data = new Vector();
               boolean status=false;
              try{
                   FileInputStream fin =  new FileInputStream(studentPath);
                   BufferedReader br = new BufferedReader(new InputStreamReader(fin));

                   while ((aLine = br.readLine()) != null) 
                   {      
                       
                       
                        if(aLine.contains(user))
                        {
                          StringTokenizer st2 = 
                          new StringTokenizer(aLine, "|");
          
          
                         while(st2.hasMoreTokens())
                         {
            
                           data.addElement(st2.nextToken());
             
                          }
                  //  System.out.println(data.get(0));
                   // System.out.println(data.get(1));
                     
                   regdFromFile=(String)data.get(0);
                   nameFromFile=(String)data.get(1);
                   
                    sID=(String)data.get(0);
                    sName=(String)data.get(1);
                    sPassword=((String)data.get(2));
                     gender=(String)data.get(3);
                    Blood=(String)data.get(4);
                    totalFee=(String)data.get(5);
                     paidFee=(String)data.get(6);
                    dueFee=(String)data.get(7);
                    address=(String)data.get(8);
                     country=(String)data.get(9);
                    city=(String)data.get(10);
                    contactNO=(String)data.get(11);
                     email=(String)data.get(12);
                    course=(String)data.get(13);
                    

                    //String str= (String)cb.getSelectedItem();
                        if(user.equals(regdFromFile))
                        {
                           status=true;
                           
                           setVisible(false);
                           if(regdFromFile.equals("bsse02163138"))
                           new SISWindow(nameFromFile,studentPath,"ammar.jpg");
                           else if(regdFromFile.equals("bsse02163146"))
                           new SISWindow(nameFromFile,studentPath,"asaad.jpg");
                           else if(regdFromFile.equals("bsse02163139"))
                           new SISWindow(nameFromFile,studentPath,"muzzamil.jpg");
                           else if(regdFromFile.equals("bsse02163136"))
                           new SISWindow(nameFromFile,studentPath,"taimoor.jpg");
                           else if(regdFromFile.equals("bsse02163140"))
                           new SISWindow(nameFromFile,studentPath,"sherry.jpg");
                           else if(regdFromFile.equals("bsse02163141"))
                           new SISWindow(nameFromFile,studentPath,"makhdoom.jpg");
                           else if(regdFromFile.equals("bsse02163147"))
                           new SISWindow(nameFromFile,studentPath,"kamran.jpg");
                           else if(regdFromFile.equals("bsse02163135"))
                           new SISWindow(nameFromFile,studentPath,"sohaib.jpg");
                           else if(regdFromFile.equals("bsse02163134"))
                           new SISWindow(nameFromFile,studentPath,"waqas.jpg");
                           else if(regdFromFile.equals("bsse02163133"))
                           new SISWindow(nameFromFile,studentPath,"syed ali.jpg");
                           else if(regdFromFile.equals("bsse02163137"))
                           new SISWindow(nameFromFile,studentPath,"shehroz.jpg");
                           else if(regdFromFile.equals("bsse02163145"))
                           new SISWindow(nameFromFile,studentPath,"saffi.jpg");
                           else if(regdFromFile.equals("bsse02163143"))
                           new SISWindow(nameFromFile,studentPath,"fahad.jpeg");
                           else if(regdFromFile.equals("bsse02163144"))
                           new SISWindow(nameFromFile,studentPath,"talha.jpg");
                           else if(regdFromFile.equals("bsse02163142"))
                           new SISWindow(nameFromFile,studentPath,"hussain.jpg");
                        }
                     
                         else
                        {
                          JOptionPane.showMessageDialog(null,"Incorrect Name.","Alert",JOptionPane.WARNING_MESSAGE);
                        }
      
                         }
               
                    }
                   
                    if(status==false)
                     {
                        JOptionPane.showMessageDialog(null,"Incorrect User Name & Password.","Alert",JOptionPane.WARNING_MESSAGE);
                     }
                   
                br.close(); 
                 }
            catch (Exception e3) {
            e3.printStackTrace();
            }
              
              
            }
            
            
            else if(str.equals("Administrator"))
            {
                Vector data;
                String aLine ;
                data = new Vector();
                boolean status=false;
              try{
                   FileInputStream fin =  new FileInputStream(adminPath);
                   BufferedReader br = new BufferedReader(new InputStreamReader(fin));

                   while ((aLine = br.readLine()) != null) 
                   {  
                       
                       
                        if(aLine.contains(user))
                        {
                          StringTokenizer st2 = 
                          new StringTokenizer(aLine, "|");
          
          
                         while(st2.hasMoreTokens())
                         {
            
                           data.addElement(st2.nextToken());
             
                          }
                  //  System.out.println(data.get(0));
                   // System.out.println(data.get(1));
                    
                    regdFromFile=(String)data.get(0);
                    adminID=regdFromFile;
                    nameFromFile=(String)data.get(1);
                    passFromFile=(String)data.get(2);
                    adminPass=passFromFile;
        
                        if(user.equals(regdFromFile))
                        {
                           status=true;
                           setVisible(false);
                           if(regdFromFile.equals("muzzamil.admin@uol.pk.com"))//
                           new AdminWindow(nameFromFile,adminPath,"muzzamil.jpg");
                           else if(regdFromFile.equals("taimoor.admin@uol.pk.com")) //
                           new AdminWindow(nameFromFile,adminPath,"taimoor.jpg");
                           
                           else if(regdFromFile.equals("hussain.admin@uol.pk.com"))//
                           new AdminWindow(nameFromFile,adminPath,"hussain.jpg");
                           
                           else if(regdFromFile.equals("kamran.admin@uol.pk.com"))//
                           new AdminWindow(nameFromFile,adminPath,"kamran.jpg");
                          
                           else if(regdFromFile.equals("shehroz.admin@uol.pk.com"))//
                           new AdminWindow(nameFromFile,adminPath,"shehroz.jpg");
                           
                           
                        }
                     
                         else
                        {
                          JOptionPane.showMessageDialog(null,"Incorrect Name.","Alert",JOptionPane.WARNING_MESSAGE);
                        }
      
                         }
               
                    }
                   
                    if(status==false)
                     {
                        JOptionPane.showMessageDialog(null,"Incorrect User Name & Password.","Alert",JOptionPane.WARNING_MESSAGE);
                     }
                   
                br.close(); 
                 }
            catch (Exception e3) {
            e3.printStackTrace();
            }
              
            
            }
        
            
           else if(str.equals("Faculty"))
            {
                Vector data;
               String aLine ;
               data = new Vector();
               boolean status=false;
              try{
                   FileInputStream fin =  new FileInputStream(facultyPath);
                   BufferedReader br = new BufferedReader(new InputStreamReader(fin));

                   while ((aLine = br.readLine()) != null) 
                   {  
                       
                       
                        if(aLine.contains(user))
                        {
                          StringTokenizer st2 = 
                          new StringTokenizer(aLine, "|");
          
          
                         while(st2.hasMoreTokens())
                         {
            
                           data.addElement(st2.nextToken());
             
                          }
                  //  System.out.println(data.get(0));
                   // System.out.println(data.get(1));
                     
                    regdFromFile=(String)data.get(0);
                    FacultyID=regdFromFile;
                    nameFromFile=(String)data.get(1);
                    passFromFile=(String)data.get(2);
                    FacultyPass=passFromFile;

                    //String str= (String)cb.getSelectedItem();
                        if(user.equals(regdFromFile))
                        {
                           status=true;
                           
                           setVisible(false);
                           if(regdFromFile.equals("ammar.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"ammar.jpg");
                           
                           else if(regdFromFile.equals("sohaib.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"sohaib.jpg");
                           
                           else if(regdFromFile.equals("syedali.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"syed ali.jpg");
                           else if(regdFromFile.equals("shehroz.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"shehroz.jpg");
                           
                           else if(regdFromFile.equals("fahad.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"fahad.jpeg");
                          
                           else if(regdFromFile.equals("hussain.faculty@uol.pk.com"))//
                           new FacultyWindow(nameFromFile,facultyPath,"hussain.jpg");
                        }
                     
                         else
                        {
                          JOptionPane.showMessageDialog(null,"Incorrect Name.","Alert",JOptionPane.WARNING_MESSAGE);
                        }
      
                         }
               
                    }
                   
                    if(status==false)
                     {
                        JOptionPane.showMessageDialog(null,"Incorrect User Name & Password.","Alert",JOptionPane.WARNING_MESSAGE);
                     }
                   
                br.close(); 
                 }
              
            catch (Exception e3) {
            e3.printStackTrace();
            }
              
            } 
        
        
    }
  }
        
       
}