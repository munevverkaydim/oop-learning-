package p16_exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowDemo {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{

            //Integer.parseInt change our input as integer.
            int k = Integer.parseInt(br.readLine());

            if(k < 10){
                throw new ArithmeticException();
            }//it send us the Arithmetic eeption catch block

            System.out.println("output is: " + k);
        }catch(IOException e){
            System.out.println("input output exception");
        }catch(ArithmeticException e){
            System.out.println("k must be greater than 10");
        }catch(NumberFormatException e) {
            System.out.println("please enter only an integer!");
        }
    }
}
