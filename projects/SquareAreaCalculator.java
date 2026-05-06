package projects;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {

        //Math kütüphanesi kullanım orneği
        //bir kareninalanını hesaplayacağız

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("karenin bir kenarinin uzunlugunu giriniz: ");
        double kenar= scanner.nextDouble();
        
        //double alan = kenar * kenar;  ya da Math.pow(taban,üs) method unu kullanıcaz
        double alan =   Math.pow(kenar,2);
        double cevre = 4 * kenar;
        
        System.out.println("alan: " + alan);
        System.out.println("cevre: " + cevre);
        
        scanner.close();
    }
}