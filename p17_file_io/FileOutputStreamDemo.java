package p17_file_io;



import java.io.FileOutputStream;



public class FileOutputStreamDemo {



    public static void main(String[] args) {

       

        FileOutputStream fos = null; // we initilazed as null



        try{

            //if we don t mention about p17_file_io. java create a file in learnjava folder

            fos = new FileOutputStream("p17_file_io/test.txt");//if there is not a test.txt file, java create it.

            fos.write(66);



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