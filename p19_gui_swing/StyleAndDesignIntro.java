package p19_gui_swing;

import java.awt.FlowLayout;               // FlowLayout 
import java.awt.event.ActionEvent;        // ActionEvent 
import java.awt.event.ActionListener;     // addActionListener 
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
            }
        });

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

    }
}
