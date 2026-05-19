package p03_loops.projects;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        //while döngüsü kullanarak kullanıcının girdiği sayının faktöriyelini hesaplayan bir program yazınız

        System.out.print("enter a number:");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int factorial =1;

        while(number>0){
            factorial *= number;
            number--;
        }
        System.out.println("the factorial of your number is " + factorial);
    }
}
