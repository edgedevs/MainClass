/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import javax.swing.*;
import java.awt.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddRecord implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JButton j1;
    JButton j2;
    JButton j3;
    JButton j4;
    JComboBox cb;
    JComboBox cb2;
    String course;
    String gender;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf14, tf10;
    //tf14 for str10//tf10 for str11
    JFrame s1 = new JFrame("Admin Section");

    public AddRecord() {

        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        String user[] = {"Male", "Female"};
        String user2[] = {"BSSE", "BSIT", "BSCS"};
        JComboBox cb = new JComboBox(user);
        JComboBox cb2 = new JComboBox(user2);
        s1.setBounds(700, 100, 600, 800);
        JPanel p1 = new JPanel(null);
        p1.setBounds(300, 100, 600, 600);
        p1.setBackground(Color.decode("#bdb76b"));
        s1.setVisible(true);

        JLabel l2 = new JLabel("Add Record");
        Font font = new Font("Serif", Font.BOLD, 30);
        l2.setFont(font);

        l2.setBounds(210, 10, 200, 70);
        p1.add(l2);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(100, 80, 70, 70);
        p1.add(l1);
        Font font2 = new Font("Serif", Font.BOLD, 20);
        s1.setVisible(true);
        l1.setFont(font2);
        tf1 = new TextField();
        tf1.setBounds(250, 105, 220, 20);
        p1.add(tf1);

        JLabel l3 = new JLabel("Reg ID:");
        l3.setBounds(100, 120, 70, 70);
        p1.add(l3);
        l3.setFont(font2);
        tf2 = new TextField();
        tf2.setBounds(250, 145, 220, 20);
        p1.add(tf2);

        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(100, 165, 80, 70);
        l4.setFont(font2);
        p1.add(l4);
        l4.setFont(font2);
        cb.setBounds(250, 190, 70, 30);

        JLabel l14 = new JLabel("Blood:");
        l14.setBounds(100, 225, 80, 70);
        l14.setFont(font2);
        p1.add(l14);
        l4.setFont(font2);
        tf14 = new TextField();
        tf14.setBounds(250, 245, 220, 20);
        p1.add(tf14);
        p1.add(l14);

        JLabel l5 = new JLabel("FEE:");
        l5.setBounds(100, 285, 70, 70);
        p1.add(l5);
        l5.setFont(font2);

        tf3 = new TextField();
        tf3.setBounds(250, 300, 220, 20);
        p1.add(tf3);

        JLabel l6 = new JLabel("Paid:");
        l6.setBounds(100, 315, 70, 70);
        p1.add(l6);
        l6.setFont(font2);
        tf5 = new TextField();
        tf5.setBounds(250, 340, 220, 20);
        p1.add(tf5);

        JLabel l7 = new JLabel("Due:");
        l7.setBounds(100, 350, 70, 70);
        p1.add(l7);
        l7.setFont(font2);
        tf4 = new TextField();
        tf4.setBounds(250, 375, 220, 20);
        p1.add(tf4);

        JLabel l8 = new JLabel("Address:");
        l8.setBounds(100, 385, 100, 70);
        p1.add(l8);
        l8.setFont(font2);
        tf6 = new TextField();
        tf6.setBounds(250, 413, 220, 45);
        p1.add(tf6);

        JLabel l9 = new JLabel("City:");
        l9.setBounds(100, 485, 70, 70);
        p1.add(l9);
        l9.setFont(font2);
        tf7 = new TextField();
        tf7.setBounds(250, 507, 220, 20);
        p1.add(tf7);

        JLabel l10 = new JLabel("Country:");
        l10.setBounds(100, 450, 100, 70);
        p1.add(l10);
        l10.setFont(font2);
        tf8 = new TextField();
        tf8.setBounds(250, 473, 220, 20);
        p1.add(tf8);

        JLabel l11 = new JLabel("Contact No:");
        l11.setBounds(100, 495, 130, 120);
        p1.add(l11);
        l11.setFont(font2);
        tf9 = new TextField();
        tf9.setBounds(250, 548, 220, 20);
        p1.add(tf9);

        JLabel l12 = new JLabel("Email:");
        l12.setBounds(100, 535, 130, 120);
        p1.add(l12);
        l12.setFont(font2);
        tf10 = new TextField();
        tf10.setBounds(250, 588, 220, 20);
        p1.add(tf10);
        JLabel l13 = new JLabel("Course:");
        l13.setBounds(100, 580, 130, 120);
        p1.add(l13);
        l13.setFont(font2);

        cb2.setBounds(250, 630, 70, 30);

        p1.add(cb);

        cb.addActionListener(this);
        gender = cb.getSelectedItem().toString();
        cb2.addActionListener(this);
        p1.add(cb2);
        course = cb2.getSelectedItem().toString();
        s1.add(p1);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        j1 = new JButton("Back");
        j1.setBounds(280, 690, 70, 30);
        j1.addActionListener(this);

        j2 = new JButton("Add");
        j2.setBounds(360, 690, 70, 30);
        j2.addActionListener(this);

        //j3=new JButton("Modify");
        //j3.setBounds(100,570,100,30);
        j4 = new JButton("Close");
        j4.addActionListener(this);
        j4.setBounds(200, 690, 70, 30);

        p1.add(j1);
        p1.add(j2);
        p1.add(j4);
        //  p1.add(j3);

    }

    public static void main(String[] args) {

        AddRecord a1 = new AddRecord();
    }

    public void writeinFile(String s) {
        try {

            //String  addedRecord=str2+"|"+str1+"|"+str1+"4321"+"|"+gender+"|"+str3+"|"+str4+"+"+str5+"|"+str6+"|"+str7+"|"+str8+"|"+str9+"|"+str10+"|"+str11+"|";
            File file = new File("studentRecord.dat");

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

    @Override
    public void actionPerformed(ActionEvent e2) {

        if (e2.getSource() == j1) {

            s1.setVisible(false);
            new AdminWindow(AdminWindow.adminName, AdminWindow.adminRecord, AdminWindow.adminPhoto);
        } else if (e2.getSource() == j2) {
            String str1 = tf1.getText();
            String str2 = tf2.getText();
            String str3 = tf3.getText();
            String str4 = tf4.getText();
            String str5 = tf5.getText();
            String str6 = tf6.getText();
            String str7 = tf7.getText();
            String str8 = tf8.getText();
            String str9 = tf9.getText();
            String str10 = tf14.getText();
            String str11 = tf10.getText();

            String addedRecord = str2 + "|" + str1 + "|" + str1 + "4321" + "|" + gender + "|" + str10 + "|" + str3 + "|" + str4 + "|" + str5 + "|" + str6 + "|" + str7 + "|" + str8 + "|" + str9 + "|" + "|" + str11 + "|" + course + "|";

            writeinFile(addedRecord);

        } else if (e2.getSource() == j4) {
            s1.setVisible(false);
            System.exit(0);

        }

    }

}
