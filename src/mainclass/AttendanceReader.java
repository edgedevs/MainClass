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
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;


public class AttendanceReader extends JFrame implements ActionListener{

  JButton button;
  JButton button2;

  public AttendanceReader() {
  
  try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
    
    setTitle("Update Attendance");
    setBounds(500,80,1040, 420);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setForeground(Color.black);
    setBackground(Color.decode("#bdb76b"));
    setLayout(null);
    
        button = new JButton("Close");
         button.setBounds(400, 320, 100, 30);
         button.addActionListener(this);
        button2 = new JButton("Back");
         button2.setBounds(510, 320, 100, 30);
         button2.addActionListener(this);
         
         Font font=new Font("Serif",Font.BOLD,25);
         JLabel l1=new JLabel("Attendance");
         l1.setFont(font);
         l1.setBounds(430,1,450,70);
  


     
    JTable table;
    AttendanceReaderModel model;
    /*
    Font f;
    f = new Font("SanSerif",Font.PLAIN,24);
    setFont(f);
*/
    //dataFilePath
    model = new AttendanceReaderModel("Attendance.dat");
    table = new JTable();
    table.setModel(model);
    table.createDefaultColumnsFromModel();

    JScrollPane scrollpane = new JScrollPane(table);
    scrollpane.setBounds(25,80,970,230);
    
    add(l1);
    add(button);
    add(button2);
   
    add(scrollpane);
    
     getContentPane().setBackground(Color.decode("#bdb76b"));
    setVisible(true);
    addWindowListener(new WindowCloser());
    }
    
    
 /*public Dimension getPreferredSize(){
    return new Dimension(400, 300);
    }*/
    
    
 public static void main(String s[]) {
    
    //new AttendanceReader("Attendance.dat");

        }
 
    @Override
    public void actionPerformed(ActionEvent e2) {
        if(e2.getSource() == button)
        {
            setVisible(false);
            System.exit(0);
        }
        
        else if(e2.getSource() == button2)
        {
            setVisible(false);
            new SISWindow(SISWindow.sName,SISWindow.sRecord,SISWindow.sPhoto);
            
        }
        
        
    }
 }

 class WindowCloser extends WindowAdapter {
 public void windowClosing(WindowEvent e) {
   Window win = e.getWindow();
   win.setVisible(false);
   System.exit(0);
    }
}
