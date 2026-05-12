import java.util.Scanner;

public class UserInputBasics{
     public static void main(String[] args){
        Scanner scanner =new Scanner(System.in); // scanner objesi oluşturduk. başka bir isimle de oluşturabilirdik.
        String isim = scanner.nextLine();
        int yas = scanner.nextInt();
        double oran = scanner.nextDouble();

        System.out.println("merhaba" + isim);
        System.out.println("yasiniz" + yas);
        System.out.println("oran:" + oran);
     }    
}