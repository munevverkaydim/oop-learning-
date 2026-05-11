import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        //kullanıcının girdiği sayının rakam değerlerinin toplamını bulan program

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number:");
        int number = scanner.nextInt();

        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("sum of digits: " + sum);

    }
}
