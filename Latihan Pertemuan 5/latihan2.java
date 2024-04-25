/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ezran
 */
class latihan2 extends JFrame implements ActionListener {
    
    private static final int frame_width = 300;
    private static final int frame_height = 250;
    private static final int frame_x = 150;
    private static final int frame_y = 250;
    private static final String empty = "";
    private static final String newLine = System.getProperty("line.separator");
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputline;
    private JTextArea textarea;
    
    public static void main(String[] args) {
        latihan2 frame = new latihan2();
        frame.setVisible(true);
    }
    
    public latihan2(){
        Container contentpane;
        setSize(frame_width, frame_height);
        setResizable(false);
        setTitle("Program Latihan 2");
        setLocation(frame_x, frame_y);
        contentpane = getContentPane();
        contentpane.setLayout(new FlowLayout());
        textarea = new JTextArea();
        textarea.setColumns(22);
        textarea.setRows(8);
        textarea.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        textarea.setEditable(false);
        contentpane.add(textarea);
        inputline = new JTextField();
        inputline.setColumns(22);
        contentpane.add(inputline);
        inputline.addActionListener(this);
        addButton = new JButton("ADD");
        contentpane.add(addButton);
        
        clearButton = new JButton("CLEAR");
        contentpane.add(clearButton);
        
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        if (event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();
            if(clickedButton == addButton) {
                addText(inputline.getText());
            }
            else {
                clearText();
            }
        }
        else {
            addText(inputline.getText());
        }
    }
    
    private void addText(String newline){
        textarea.append(newline + newLine);
        inputline.setText("");
    }
    
    private void clearText(){
        textarea.setText(empty);
        inputline.setText(empty);
    }
}
