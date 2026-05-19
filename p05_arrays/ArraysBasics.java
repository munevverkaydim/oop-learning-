package p05_arrays;
public class ArraysBasics {
    
    //array ler birden fazla temel veri tipini tutmak için tasarlanmıştır.

    public static float calculateAverageArray(int arr[]){
        int sum = 0; 

        for(int i=0 ; i<arr.length ; i++){ // arr.lenght bize dizinin kaç indeks oldugunu verir
            sum += arr[i];
        }
        float average = (float) sum / arr.length; // "Casting" yaparak ondalık sonucu koruyoruz. 
        return average;
    }


    public static void main(String[] args){
        int x;
        x = 7;

        /*  array bu şekilde tanımlanır ilk yol(decleration)  
        int[] array;
        array = new int[5];
        array[0] = 45;
        array[1] = 32;
        array[2] = 21;
        array[3] = 1;
        array[4] = 39;  */

        // array tanımlamanın 2.yolu:

        int array[] = {45, 32, 21, 1, 39}; 

        // ya da loop içinde kullanıcıdan da alabiliriz değerleri.

        float avg = calculateAverageArray(array);
        System.out.println("average is " + avg);

    } 
}

/* Initialization: İlk değer atama.

Iterate: Bir yapı (dizi gibi) üzerinde adım adım ilerlemek.

Property: Özellik (örneğin length dizinin bir özelliğidir).

Casting: Bir veri tipini başka bir tipe dönüştürme. */
