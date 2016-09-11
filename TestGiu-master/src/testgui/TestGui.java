/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Geraldo
 */
public class TestGui extends JFrame {
private JButton button;
private JLabel label;
private JTextField textfield;
    /**
     * @param args the command line arguments
     */
public  TestGui(){
   setLayout(new FlowLayout());     
         label=new JLabel("welcome to our program");   
         add(label);
         textfield=new JTextField(15);
         add(textfield);
         button=new JButton("click me ");
         add(button);  
    
}


    public static void main(String[] args) {
        // TODO code application logic here
        
        TestGui gui= new TestGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("GIU");
        gui.setSize(450,450);
        gui.setVisible(true);
        
       
    }
}

  