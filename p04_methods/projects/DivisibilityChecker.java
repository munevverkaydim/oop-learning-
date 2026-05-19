package p04_methods.projects;
public class DivisibilityChecker {


    // 1 - 100 arası sayılardan 3 ün katları olan sayıları yazdıran bir fonksiyon yazıcaz.
    
    public static void printNumbersDivisibleByThree(){ //henüz arrays ve lists görmediğimiz için fonksiyon içinde yazdırdık.
        for(int i =1 ; i<=100 ; i++){
            if(i % 3 == 0){
                System.out.println(i); // fonksiyonlarda değer döndürmek daha profesyonel normalde 
            }
        }
    }

    public static void main(String[] args){
        printNumbersDivisibleByThree();
    }

}
