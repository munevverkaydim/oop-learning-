package p04_methods;
import java.util.Scanner;

public class ReturnMethods {


    public static int rectangleAreaCalculator(int a, int b){ // bir kaç değer alınabilir ancak sadece tek bir değer döndürülebilir.
        int area = a * b;
        return area; //basit işlemlerde return a*b; demek normalde daha temiz. (öğrenme açısından böyle yazmadım)
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first side of your rectangle: ");
        int side1 = scanner.nextInt();

        System.out.print("enter the second side of your rectangle: ");
        int side2 = scanner.nextInt();

        int result = rectangleAreaCalculator(side1, side2);
        System.out.println("area of the rectangle is: " + result);


    }

}
