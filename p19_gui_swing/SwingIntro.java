package p19_gui_swing;

import javax.swing.JFrame;

public class SwingIntro {
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();//JFrame is a class for making interfaceses.

        jf.setTitle("my first window");//we add a title with setTitle() method

        jf.setSize(600,300);//we decided the size of our frame

        jf.setLocation(100,200); // (0,0) point is the top-left corner of the computer screen.
        // X axis (Horizontal): Moves from left to right.
        // Y axis (Vertical): Moves from top to bottom.

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //When we click the close (X) button, this stops and closes the program completely.

        jf.setVisible(true);//if we make it true, user can see our frame,
        //if it s false, user can t see the frame that we made.
    }
}
