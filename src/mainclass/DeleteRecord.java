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

public class DeleteRecord implements ActionListener{

    
    JFrame s1=new JFrame("Delete Record");
    JButton j1;
    JButton j2;
    JButton j3;
    TextField tf1;
   TextField tf2;
   String str1,str2;
   String aLine = null;
    DeleteRecord()
    {
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        } 
        
        
        s1.setBounds(750,250,400,300);
        JPanel p=new JPanel(null);
        //p.add(s1);
        
        p.setBackground(Color.decode("#bdb76b"));
        
        JLabel l1=new JLabel("Delete Record");
        Font font=new Font("Serif",Font.BOLD,25);
        Font font2=new Font("Serif",Font.BOLD,20);
        l1.setFont(font);
        l1.setBounds(130, 10, 180, 40);
        p.add(l1);
       
       
       JLabel l2=new JLabel("ID:");
       l2.setFont(font2);
        l2.setBounds(30, 70, 100, 40);
       p.add(l2);
       tf1=new TextField();
       tf1.setBounds(140,84,180,20);
       p.add(tf1);
       
       JLabel l3=new JLabel("Name:");
       l3.setFont(font2);
        l3.setBounds(30, 110, 100, 40);
       p.add(l3);
       tf2=new TextField();
       tf2.setBounds(140,124,180,20);
       
       
       
       j1=new JButton("Close");
       j1.addActionListener(this);
       j1.setBounds(80,170,70,30);
       p.add(j1);
       j2=new JButton("Back");
       j2.addActionListener(this);
       j2.setBounds(158,170,70,30);
       p.add(j2);
       j3=new JButton("Delete");
       j3.addActionListener(this);
       j3.setBounds(238,170,70,30);
       p.add(j3);
       
       p.add(tf2);
       
       
       
       s1.add(p);
       s1.setVisible(true);
       
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        DeleteRecord d1=new DeleteRecord();
        
    }

    
    public static void removeLine(BufferedReader br, File f, String Line,String st4) throws IOException {
        File temp = new File("UpdatedStudentRecordAfterDelete.txt");
        
        FileInputStream fin = new FileInputStream("studentRecord.dat");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(fin));
        br=br3;
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        String removeID = Line;
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            if(currentLine.contains(Line))
            {
                //currentLine=st4;
                
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
            new AdminWindow(AdminWindow.adminName,AdminWindow.adminRecord,AdminWindow.adminPhoto);
            
        }
        else if(e2.getSource() == j3)
        {
             str1 = tf1.getText();
            str2 = tf2.getText();
           
            System.out.println(str1);
             System.out.println(str2);
            //if (str1.equals(MainSystemLogin.sPassword)) {

                
                boolean st1=false;
                 boolean st2=false;
                try
                {
                    File file = new File("studentRecord.dat");
                    FileInputStream fin = new FileInputStream("studentRecord.dat");
                    BufferedReader br = new BufferedReader(new InputStreamReader(fin));
                    
                    while ((aLine = br.readLine()) != null) 
                    {
                        if (aLine.contains(str1)) 
                        {
                            st1=true;
                            if(aLine.contains(str2))
                            {
                               //aLine = aLine.replaceAll(MainSystemLogin.sPassword, str2);
                               removeLine(br, file,str1,aLine);
                               JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                               st2=true;
                               break;     
                            }
                             
                        }
                            
                        if(st1==false)
                            JOptionPane.showMessageDialog(null, "NO record exist with this id", "Alert", JOptionPane.WARNING_MESSAGE); 
                        if(st2==false)
                        JOptionPane.showMessageDialog(null, "NO record exist with this name", "Alert", JOptionPane.WARNING_MESSAGE); 
                    }
                      

                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }

           
        }
        
        
    }
    
}

