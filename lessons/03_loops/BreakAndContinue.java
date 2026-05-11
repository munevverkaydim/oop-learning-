public class BreakAndContinue { 
    public static void main(String[] args){

        for(int i=0 ; i<10 ; i ++){
            if(i == 3){
                System.out.println("continue is working");
                continue; // döngü içinde bu satırı görünce i yi arttırıp döngü devam edecek
            }
            
            if(i == 8){
                System.out.println("we are breaking the loop");
                break; //bu komutu gorunce döngüden komple çıkacak
            }

            System.out.println("i value is: " + i);
        }

    }
}