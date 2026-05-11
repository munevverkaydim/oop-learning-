import java.util.Scanner;

public class PrimeNumberCounter {
    
    // kullanıcının girdiği sayıya kadar kaç asal sayı olduğunu bulan bir fonksiyon.

    public static int countPrimesUntil(int limit){
        int counter = 0; // for döngülerinin dışında tanımlamak önemli. Dışarda kullanacağız çünkü

        for(int i=2 ; i<=limit ; i++){ //asal sayılar 2 den başladığı için 2 den başlattık

            boolean isPrime = true;
            for(int k=2 ; k<i ; k++){

                if(i % k == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your limit: ");
        int limit = scanner.nextInt();
        int howMany = countPrimesUntil(limit);
        System.out.println(howMany + " prime number");
    }
}