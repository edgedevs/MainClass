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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class AttendanceWriter extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
         JTable table;
          JButton button;
          JButton button2;
         Object row[][] = {
             {"bsse02163133","Java","P","P","P","P","P"},
             {"bsse02163134","Java","P","P","P","P","P"},
             {"bsse02163135","Java","P","P","P","P","P"},
             {"bsse02163136","Java","P","P","P","P","P"},
             {"bsse02163137","Java","P","P","P","P","P"},
             {"bsse02163138","Java","P","P","P","P","P"},
             {"bsse02163139","Java","P","P","P","P","P"},
             {"bsse02163140","Java","P","P","P","P","P"},
             {"bsse02163141","Java","P","P","P","P","P"},
             {"bsse02163142","Java","P","P","P","P","P"},
             {"bsse02163143","Java","P","P","P","P","P"},
             {"bsse02163144","Java","P","P","P","P","P"},
             {"bsse02163145","Java","P","P","P","P","P"},
              {"bsse02163146","Java","P","P","P","P","P"},
             {"bsse02163147","Java","P","P","P","P","P"},
             {"bsse02163148","Java","P","P","P","P","P"},
             
                      };
         
         Object column[] = {"Registration id","Subject","Monday","Tuesday","Wednesday","Thursday","Friday"};
         public AttendanceWriter()
         {
             
         super("Attendance Window");

         try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        } 

         //Bind Data In JTable
         table = new JTable(row, column);




         JScrollPane js = new JScrollPane(table);
         js.setBounds(25,80,850,230);
         
         button = new JButton("Close");
         button.setBounds(280, 320, 100, 30);
         button.addActionListener(this);
        button2 = new JButton("Back");
        button2.setBounds(390, 320, 100, 30);
        button2.addActionListener(this);
         JButton button3= new JButton("Update");
         button3.setBounds(500, 320, 100, 30);
         Font font=new Font("Serif",Font.BOLD,25);
         JLabel l1=new JLabel("Update Attendance");
         l1.setFont(font);
         l1.setBounds(350,1,450,70);
        button3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               try{
                //the file path
               File file = new File("Attendance.dat");
               //if the file not exist create one
               if(!file.exists()){
                   file.createNewFile();
               }
               
               FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
               BufferedWriter bw = new BufferedWriter(fw);
               
               //loop for jtable rows
               bw.newLine();
               for(int i = 0; i < table.getRowCount(); i++){
                   //loop for jtable column
                   for(int j = 0; j < table.getColumnCount(); j++){
                       bw.write(table.getModel().getValueAt(i, j)+"");
                       bw.write("|");
                   }
                   //break line at the begin 
                   //break line at the end 
                   bw.newLine();
               }
               //close BufferedWriter
               bw.close();
               //close FileWriter 
               fw.close();
               JOptionPane.showMessageDialog(null, "Attendance Updated");
               
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
        });

         add(button);
         add(button2);
         add(button3);
         add(js);
         add(l1);
         setLayout(null);
         setSize(920, 420);
         getContentPane().setBackground(Color.decode("#bdb76b"));
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         }
    public static void main(String[] args) {
        // TODO code application logic here
         new AttendanceWriter();
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
            new FacultyWindow(FacultyWindow.fName,FacultyWindow.fRecord,FacultyWindow.fPath);
            
        }
        
        
    }
    
}

