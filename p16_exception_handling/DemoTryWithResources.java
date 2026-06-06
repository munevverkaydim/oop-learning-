package p16_exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoTryWithResources {
    public static void main(String[] args) throws Exception {

        // TRY-WITH-RESOURCES RULE:
        // 1. We can only put resources inside try( ) that implement AutoCloseable.
        // 2. Java will close these resources automatically when the block finishes.
        // 3. 'throws Exception' sends the errors to the JVM instead of catching them here.
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String str = "";
            str = br.readLine();
        }
    }
}
