package p17_file_io;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        
        FileOutputStream fos = null; // we initilazed as null

        try{
            //if we don t mention about p17_file_io. java create a file in learnjava folder
            fos = new FileOutputStream("p17_file_io/test.txt",true);//if there is not a test.txt file, java create it.
            //aslo when we create "fos" object, there are some override methods. 
            //if we write boolean true, file doesnt get clear. we continue.
            //if we write boolen false, the file get clean. and we write to a clean page.

            //fos.write(66); ->B   this 66 is a ASCII number. 
            String name = "munevver kaydim\r\n";//if we want to write new line \r\n
            byte[] arr =name.getBytes(); //the method of getBytes() is turn our String to a byte array
            //we make a byte array because if we want to write a String to a folder, we can write as a byte array
            fos.write(arr);
            

        }catch(Exception e){// if there is a disk error or write permission issue

            e.printStackTrace();

        }finally{//we want to close file. but if there is not a file? then we need another try-catch-final structure
            try{
                fos.close();//we tried to close the file
            }catch(Exception h){
                System.out.println("there is a I/O error happened."); //if there is not a file
                h.printStackTrace();
            }
        }

        System.out.println("program is closing...");    
    }
    
}
