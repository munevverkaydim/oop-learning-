package p19_gui_swing;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.classfile.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingIntro {
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();//JFrame is a class for making interfaceses.

        jf.setTitle("my first window");//we add a title with setTitle() method
        jf.setSize(600,300);//we decided the size of our frame
        jf.setLocation(100,200); // (0,0) point is the top-left corner of the computer screen.
        // X axis (Horizontal): Moves from left to right.
        // Y axis (Vertical): Moves from top to bottom.


        jf.getContentPane().setLayout(new FlowLayout());// METHOD CHAINING (Metot Zincirleme):
        // Instead of writing multiple lines of code, we connect methods with dots (.) on a single line.
        // jf.getContentPane() gives us the inner panel, and we immediately call .setLayout() on that panel.
 
        // ANONIMOUS (NAMELESS) OBJECT:
        // 'new FlowLayout()' creates a temporary, nameless object. 
        // We use it only once inside the method without creating a variable name.


        JTextField text1 = new JTextField(15); // Creates an input box for the user to type text (15 columns wide).
        JButton button1 = new JButton("send it"); // Creates a clickable button with the text "send it".

        JLabel label1 = new JLabel(); // Creates a text label to show information on the screen.
        label1.setText("enter your name: "); // Sets the text message of the label.

        // jf.getContentPane().add() puts these components inside our window panel. -> It adds them from left to right.
        jf.getContentPane().add(label1); // Adds the text label to the screen.
        jf.getContentPane().add(text1); // Adds the input box to the screen.
        jf.getContentPane().add(button1); // Adds the button to the screen.




        // We add a click event listener to the button (Action Listener).
        button1.addActionListener(new ActionListener() { //actionListener is NOT A CLASS.it is an INTERFACE.
            @Override //because of that we override it.
            // This method runs automatically whenever the user clicks the button.
            public void actionPerformed(ActionEvent e) {
                // text1.getText() reads the text typed by the user inside the input box.
                // label1.setText() changes the screen text dynamically.
                label1.setText("Hello " + text1.getText() + ", welcome to our program.");
            }
        });



        // Create a new button for pop-up messages.
        JButton button2 = new JButton("click here");// Normally we should create this above, but we write it here for learning purposes. 
        jf.getContentPane().add(button2);
        
        button2.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) {
                // JOptionPane has static methods. We don't need to create an object with 'new'.
                // JOptionPane.showMessageDialog() is a STATIC method.
                // This means the method belongs to the Class itself, not to a specific object.
                // So, we don't need 'new' keyword to open a quick dialog box. Like Math.sqrt()!

                // The first parameter 'jf' (or null) represents the parent window.
                // If we pass 'jf', the pop-up opens right in the center of our main window. 
                // If we pass 'null', the pop-up opens in the center of the computer screen.
                JOptionPane.showMessageDialog(jf, "welcome to our Pane...");                
            }
        });



        //if we want to take variables from user:
        JButton button3 = new JButton("enter");
        jf.getContentPane().add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                String namee = JOptionPane.showInputDialog("enter your namee:");
                JOptionPane.showMessageDialog(null, "welcome " + namee);
            }
        });



        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //When we click the close (X) button, this stops and closes the program completely.

        jf.setResizable(false);//if we don t write this, this is defaultly true. 
        //user can t control the size of our frame.

        jf.setVisible(true);//if we make it true, user can see our frame,
        //if it s false, user can t see the frame that we made.
    }


        // JOptionPane is a ready-made pop-up (dialog) window class.
        // We use it for 3 main reasons in real projects:
        
        // 1. SHOW MESSAGE (Information/Warning/Error): 
        //    Example: JOptionPane.showMessageDialog() firlats a quick notification like "File Saved Successfully!"
        
        // 2. CONFIRMATION (Yes/No/Cancel): 
        //    Example: JOptionPane.showConfirmDialog() asks "Are you sure you want to delete this file?"
        
        // 3. INPUT (Quick Text Input): 
        //    Example: JOptionPane.showInputDialog() prompts a quick box: "Please enter your age:"
        
        // DIFFERENCE BETWEEN JFRAME AND JOPTIONPANE
        // JFRAME: It is a permanent main window. We must design it from scratch (size, buttons, layout).
        // JOPTIONPANE: It is a temporary pop-up. It uses ready templates from the OS. 
        // It disappears completely when the user clicks 'OK' or 'Cancel'.
}