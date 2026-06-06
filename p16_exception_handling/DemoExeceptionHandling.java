package p16_exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExeceptionHandling {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //this is a scanner but you have to use this inside try catch block.
        //And you have to close this inside final block.


        //THROWABLE --> this is the class
            //-ERRORS: this is something that we can not handle. program will not work

            //-EXCEPTİONS: this is something that we can handle.

                //+CHECKED EXCEPTİONS: we konow the reoson. there is a lot of but 2 popular exception.
                //we have to write try catch. the reasons are not about programmer or algorithm
                    //IOException
                    //SQLException

                //+UNCHECKED EXCEPTİONS: even admins that don t now what is exception.
                //reason of that is about to programmer
                    //RuntimeException -> this have a lot of classes
                        //ArithmeticException

        int i, j, k, h;

        i = 8;
        j = 2;

        int a[] = new int [4];

        try{

            k = i/j; //this is a chritical statement so, we have to write inside try
            System.out.println(k);

            h = Integer.parseInt(br.readLine());

            for(int c=0 ; c<4 ; c++){
                a[c] = c+1;
            }

            for(int value : a){ //this means values inside(from) e --> this is 'FOR EACH' loop
                System.out.println(value);
            }//In software, we want to separate data preparation from data presentation
            //because of that we didn t make our print when we are prepearing the array 

        }catch(ArithmeticException e){
            System.out.println("You can t divide by 0 " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximumnumber of values is 4");
        }catch(IOException e){
            System.out.println("some input output error"); //this is for bufferreader
        }catch(NumberFormatException e){
            System.out.println("user did not enter a number"); //this is for bufferreader
        }catch(Exception e){
            System.out.println("Unknown Exception");  //after that we write possible exception, we write the general exception catch
        }//This should be the LAST one
    }
}
