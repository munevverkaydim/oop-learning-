package p19_gui_swing;

import java.awt.FlowLayout;
import java.awt.Image; // Required for handling the raw image data
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ImageAndIconIntro {

    public static void main(String[] args) {
    

        // 1. WINDOW INITIALIZATION
        JFrame jf = new JFrame();

        jf.setTitle("image and icon intro");
        jf.setSize(600,600);
        jf.setLocation(200,300);    

        jf.getContentPane().setLayout(new FlowLayout()); //it provide us to a flow. we have to add this.


        // 2. COMPONENT CREATION
        JLabel label = new JLabel("what is your favorite animal"); // we write a message to our frame(window)
        JTextField text1 = new JTextField(10); // we take text1 from user
        JButton button1 = new JButton("butterfly icon");

        // 3. ADD COMPONENTS TO PANE FIRST
        // CRITICAL NOTE: We add the components to the window FIRST.
        // If we add them first, Java prepares their spaces on the screen.
        jf.getContentPane().add(label);
        jf.getContentPane().add(text1);
        jf.getContentPane().add(button1);

        // IMAGE LOADING & SETTING MECHANISM
        // Step 1: getResource() finds the image file inside the project folders.
        // Step 2: new ImageIcon() reads the file.
        // Step 3: .getImage() extracts the raw Image data from the icon.
        
        // CRITICAL NOTE: We change the button style/icon AFTER adding the button to the pane.
        // This ensures the Java GUI engine can see and render the new image successfully.
        // 🕵️‍♂️ PATH DETECTIVE: This code checks if Java can find the file.
        String projectPath = "C:\\Users\\monster\\myprojects\\LearnJava\\src\\p19_gui_swing\\photos\\butterfly.png";
        java.io.File file = new java.io.File(projectPath);

        // Print the test results to the terminal screen
        System.out.println("\n=======================================");
        System.out.println("1. Java is looking for this path: " + file.getAbsolutePath());
        System.out.println("2. Does the file exist on the computer?: " + file.exists());
        System.out.println("3. Is it a real file (not a folder)?: " + file.isFile());
        System.out.println("=======================================\n");

        // Load, scale and set the icon after the check
        Image img1 = new ImageIcon(projectPath).getImage();
        Image scaledImg = img1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        button1.setIcon(new ImageIcon(scaledImg));


        // 5. BUTTON ACTION
        button1.addActionListener(new ActionListener() {
            
            @Override 
            public void actionPerformed(ActionEvent e) {
                
                label.setText(text1.getText() + " is a great animal!");
            }
        });

        // 6. VISIBILITY SETTINGS (ALWAYS AT THE END)
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

    }
}
// Never commit broken or unsuccessful code to Git.