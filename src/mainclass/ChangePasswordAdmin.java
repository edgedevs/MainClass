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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFrame;
//import static mainclass.ChangePasswordSIS.removeLine;

public class ChangePasswordAdmin implements ActionListener {
  
    
    JFrame s1=new JFrame("Change Password");
    private JButton j1;
    private JButton j2;
    private  JButton j3;
    TextField tf1,tf2;
    String str1,str2;
    
   
    String aLine = null;
    public ChangePasswordAdmin()
    {
        
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        } 
        
        
        s1.setBounds(700,250,400,300);
        JPanel p=new JPanel(null);
        //p.add(s1);
        
        s1.setVisible(true);
        JLabel l1=new JLabel("Change Password");
        Font font=new Font("Serif",Font.BOLD,25);
        Font font2=new Font("Serif",Font.BOLD,15);
        l1.setFont(font);
        l1.setBounds(110, 10, 240, 40);
       p.add(l1);
       
       
       JLabel l2=new JLabel("Pre-Password");
       l2.setFont(font2);
        l2.setBounds(30, 70, 100, 40);
       p.add(l2);
       tf1=new TextField();
       
       tf1.setBounds(140,84,180,20);
       p.add(tf1);
       
       JLabel l3=new JLabel("New Password");
       l3.setFont(font2);
        l3.setBounds(30, 110, 100, 40);
       p.add(l3);
       tf2=new TextField();
       tf2.setBounds(140,124,180,20);
       
        j1=new JButton("Close");
        j1.setBounds(70,170,70,30);
        j1.addActionListener(this);
         p.add(j1);
        j2=new JButton("Back");
       j2.setBounds(150,170,80,30);
       j2.addActionListener(this);
        p.add(j2);
       
       j3=new JButton("Change");
       j3.setBounds(240,170,80,30);
       j3.addActionListener(this);
       p.add(j3);
       
       p.add(tf2);
       s1.add(p);
       s1.setVisible(true);
       p.setBackground(Color.decode("#bdb76b"));
       
       
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         ChangePasswordAdmin c1=new ChangePasswordAdmin();
    }
    
    public static void removeLine(BufferedReader br, File f, String Line,String st4) throws IOException {
        File temp = new File("AdminUpdatedRecord.txt");
        
        FileInputStream fin = new FileInputStream("adminLogin.dat");
                    BufferedReader br3 = new BufferedReader(new InputStreamReader(fin));
                    br=br3;
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        String removeID = Line;
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            if(currentLine.contains(Line))
            {
                currentLine=st4;
                
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(removeID)) {
                 currentLine = "";
                }
                bw.write(currentLine);
                bw.newLine();
            }
            
            else
            {
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(removeID)) {
                currentLine = "";
            }
            bw.write(currentLine);
            bw.newLine();}
            
            // + System.getProperty("line.separator")

        }
        bw.close();
        br.close();
        boolean delete = f.delete();
        boolean b = temp.renameTo(f);
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
            new AdminWindow(AdminWindow.adminName,AdminWindow.adminRecord,AdminWindow.adminPhoto);
            
        }
        
        else if(e2.getSource() == j3)
        {
            str1 = tf1.getText();
            str2 = tf2.getText();

            if (str1.equals(MainSystemLogin.adminPass)) 
            {

   
                try
                {
                    File file = new File("adminLogin.dat");
                    FileInputStream fin = new FileInputStream("adminLogin.dat");
                    BufferedReader br = new BufferedReader(new InputStreamReader(fin));

                    while ((aLine = br.readLine()) != null) 
                    {
                        if (aLine.contains(MainSystemLogin.adminID)) 
                        {
                            aLine = aLine.replaceAll(MainSystemLogin.adminPass, str2);
                            removeLine(br, file, MainSystemLogin.adminID,aLine);
                            JOptionPane.showMessageDialog(null, "Password changed successfully");
                            break;
                        }

                    }

                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }

            } else 
            {
                JOptionPane.showMessageDialog(null, "Incorrect old Password.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            
            
        }
        
        
    }
}
