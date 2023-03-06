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
import javax.swing.table.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;


public class AttendanceReaderModel extends AbstractTableModel {
  protected Vector data;
  protected Vector columnNames ;  
  protected String datafile;
  
  public AttendanceReaderModel(String f){
    datafile = f;
    initVectors();  
    }

  public void initVectors() {
    String aLine ;
    data = new Vector();
    columnNames = new Vector();
    try {
        
        //
      FileInputStream fin =  new FileInputStream(datafile);
      BufferedReader br = new BufferedReader(new InputStreamReader(fin));
      // extract column names
      StringTokenizer st1 = 
         new StringTokenizer(br.readLine(), "|");
         
        while(st1.hasMoreTokens())
          columnNames.addElement(st1.nextToken());
          
      // extract data
      while ((aLine = br.readLine()) != null) {  
        if(aLine.contains(MainSystemLogin.sID))
        {
          StringTokenizer st2 = 
          new StringTokenizer(aLine, "|");
          
          
         while(st2.hasMoreTokens())
         {
            // System.out.println((String)st2.nextToken());
             data.addElement(st2.nextToken());
             
         }
         
        }
        
        }
      br.close();  
      }
    catch (Exception e) {
      e.printStackTrace();
      }
  }

  public int getRowCount() {
    return data.size() / getColumnCount();
    }

  public int getColumnCount(){
    return columnNames.size();
    }

  public String getColumnName(int columnIndex) {
    String colName = "";

    if (columnIndex <= getColumnCount())
       colName = (String)columnNames.elementAt(columnIndex);

    return colName;
    }
    
  public Class getColumnClass(int columnIndex){
    return String.class;
    }
    
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
    }
    
  public Object getValueAt(int rowIndex, int columnIndex) {
    return (String)data.elementAt
        ( (rowIndex * getColumnCount()) + columnIndex);
    }
    
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    return;
    }
}
