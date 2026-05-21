package p19_gui_swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;               // FlowLayout 
import java.awt.Font;
import java.awt.event.ActionEvent;        // ActionEvent 
import java.awt.event.ActionListener;     // addActionListener 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StyleAndDesignIntro {
    public static void main(String[] args) {

        // 1. WINDOW INITIALIZATION
        JFrame jf = new JFrame();

        jf.setTitle("colour and font styles");
        jf.setSize(400,400);
        jf.setLocation(200,300);    

        jf.getContentPane().setLayout(new FlowLayout());
        //setLayout() is a ready method inside JFrame pane. it can change the inner panel's design rules.
        // it accepts a Layout Manager object (like 'new FlowLayout()') as a parameter.


        
        // 2. COMPONENT CREATION
        JLabel label = new JLabel("what is your favorite colour"); // we write a message to our frame(window)
        JTextField text1 = new JTextField(10); // we take text1 from user
        JButton button1 = new JButton("send it");

        button1.setBackground(Color.CYAN); //changes the button's background
        button1.setForeground(Color.DARK_GRAY); //changes the text color inside the button
        button1.setFont(new Font("Arial",Font.BOLD, 15));
        // CUSTOM FONT (Anonymous Object): Sets the text style of the button.
        // 1st Param ("aa"): Font family name. (If Java can't find "aa", it falls back to the default system font).
        // 2nd Param (Font.BOLD): Makes the button text thick/bold.
        // 3rd Param (15): Sets the text size to 15 pixels/points.

        Color firstColor = button1.getBackground(); //we saved the original color as firstColor so we can remember it later


        Color newColor = new Color(200,100,150);
        //we create a new color( you can copy from google)
        jf.getContentPane().setBackground(newColor); //we made our background that color
         
        jf.getContentPane().add(label);
        jf.getContentPane().add(text1);
        jf.getContentPane().add(button1);

        // 1. addActionListener: We register a listener to capture button clicks.
        button1.addActionListener(new ActionListener() {
            
            @Override 
            // 2. actionPerformed: This method is MANDATORY because ActionListener is an Interface.
            // It triggers AUTOMATICALLY whenever the user clicks button1.
            public void actionPerformed(ActionEvent e) {
                
                // 3. The actual task: Read input text, combine it, and change the label dynamically.
                label.setText(text1.getText() + " is a great colour!");
                label.setFont(new Font("Arial", Font.BOLD, 20));
            }
        });


        //mouse hover events
        button1.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e){ //this method will run authomatichly when mouse enter the buttons area
                button1.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent e){//this method will run authomatichly when mouse exit the buttons area
                button1.setBackground(firstColor);  // Restore the original color (CYAN)
            }
        });



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

    }
}

// RGB stands for Red, Green, Blue.
// Each color value goes from 0 (darkest/none) to 255 (brightest/full).
// new Color(R, G, B) mixes these three lights to create a unique color.
