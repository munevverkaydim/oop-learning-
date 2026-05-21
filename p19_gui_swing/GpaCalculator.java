package p19_gui_swing;

import javax.swing.JOptionPane;

public class GpaCalculator {
    public static void main(String[] args) {
        int visa1, visa2;
        int final1;

        // showMessageDialog() -> ONLY SHOWS a message to the user. (One-way)
        // showInputDialog()  -> SHOWS a question AND READS the user's input. (Two-way)

        String Svisa1 = JOptionPane.showInputDialog("please enter your 1st visa grade: ");
        visa1 = Integer.parseInt(Svisa1);  
        
        // Why parseInt() instead of (int)?
        // Because (int) only works between numbers (like double to int).
        // We use Integer.parseInt() to translate a String TEXT into a mathematical NUMBER.

        while(visa1<0 || visa1 >100){

            Svisa1 = JOptionPane.showInputDialog(null,"Please enter a valid grade: ", "visa1",JOptionPane.WARNING_MESSAGE);
            // We use a 4-parameter version of showInputDialog to customize the pop-up: (it was overloaded)
            // 1st Parameter (null): Sets the location. 'null' centers the pop-up on the computer screen.
            // 2nd Parameter ("Please enter..."): The main message/question inside the box.
            // 3rd Parameter ("visa1"): The title text on the top-left corner of the window.
            // 4th Parameter (JOptionPane.WARNING_MESSAGE): The icon type. It puts a yellow warning icon (⚠️).

            visa1 = Integer.parseInt(Svisa1);
        }


        String Svisa2 = JOptionPane.showInputDialog("please enter your 2nd visa grade: ");
        visa2 = Integer.parseInt(Svisa2);  
        
        while(visa2<0 || visa2 >100){

            Svisa2 = JOptionPane.showInputDialog(null,"Please enter a valid grade: ", "visa2",JOptionPane.WARNING_MESSAGE);

            visa2 = Integer.parseInt(Svisa2);
        }


        String Sfinal1 = JOptionPane.showInputDialog("please enter your final grade: ");
        final1 = Integer.parseInt(Sfinal1);  
        
        while(final1<0 || final1 >100){

            Sfinal1 = JOptionPane.showInputDialog(null,"Please enter a valid grade: ", "final",JOptionPane.WARNING_MESSAGE);

            final1 = Integer.parseInt(Sfinal1);
        }


        double GPA = visa1 * 0.2 + visa2 *0.2 + final1 *0.6;
        String message = "";

        if(GPA > 60){
            message += "congraculation, you passed!";
        }else{
            message += "you failed!";
        }


        JOptionPane.showMessageDialog(null, message,"your score", JOptionPane.INFORMATION_MESSAGE);

        // Why not System.out.println()?
        // Because println() ONLY works in the black developer terminal.
        // For GUI, we accumulate the text in 'mesaj' and show it inside a JOptionPane pop-up.


    }
}
