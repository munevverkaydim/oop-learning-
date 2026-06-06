package p16_exception_handling;

public class DemoExeceptionHandling {
    public static void main(String[] args) {

        //THROWABLE --> this is the class
            //-ERRORS: this is something that we can not handle. program will not work

            //-EXCEPTİONS: this is something that we can handle.

                //+CHECKED EXCEPTİONS: we konow the reoson. there is a lot of but 2 popular exception.
                    //IOException
                    //SQLException

                //+UNCHECKED EXCEPTİONS: even admins that don t now what is exception.
                    //RuntimeException -> this have a lot of classes
                        //ArithmeticException
        int i, j, k;

        i = 8;
        j = 2;

        int a[] = new int [4];

        try{

            k = i/j; //this is a chritical statement so, we have to write inside try
            System.out.println(k);

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
        }
    }
}
