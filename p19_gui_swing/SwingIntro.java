package p19_gui_swing;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.classfile.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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



        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //When we click the close (X) button, this stops and closes the program completely.

        jf.setResizable(false);//if we don t write this, this is defaultly true. 
        //user can t control the size of our frame.

        jf.setVisible(true);//if we make it true, user can see our frame,
        //if it s false, user can t see the frame that we made.
    }
}
