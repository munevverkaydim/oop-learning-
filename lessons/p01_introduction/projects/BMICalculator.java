import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        //BMI (beden kitle indeksi) = ağırlık / (boy * boy)
        //ağırlık: kg cinsi
        //boy: m cinsi
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen boyunuzu giriniz:");
        float boy = scanner.nextFloat();

        System.out.println("lütfen kilonuzu girin:");
        float kilo = scanner.nextFloat();

        double BMI = kilo / Math.pow(boy, 2);  //Math.pow fonksiyonu her zaman double değer döndürür.

        System.out.println("BMI:" + BMI);


        scanner.close(); // bu komutla scanner ı kapatmak iyi bir mühendislik alışkanlığıdır. Bu, sistem kaynaklarının gereksiz yere meşgul edilmesini önler.
    }
    
}
