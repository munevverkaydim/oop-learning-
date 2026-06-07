package p16_exception_handling;

public class ManualThrowDemo {
    
    public static void main(String[] args) {
         
        int i = 5;

        try{
             if(i<10){
                throw new MyException("i must be greater than 10");
             }
        }catch(MyException e){
            // This prints the exception name and the secret message together
            System.out.println(e);
        }
    }
}

//Java allows only ONE public class in a single file.
class MyException extends Exception{

    //constructor
    public MyException(String msg){
        super(msg);
    } // "super(msg)" sends our custom message to the parent class (Exception).
    // It does not print anything. It only saves the message in the computer's memory.
    // Later, "System.out.println(e)" or "e.getMessage()" will read this saved message.  
}
