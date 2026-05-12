import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("your age:"); //println bu satırdan sonra asagı satıra atar ama sadece print yazarsak olduğumuz yerde kalırız
        x = scanner.nextInt();

        if(x < 18){
            System.out.println("you are not an adult");
        }else{
            System.out.println("you are an adult");
        }

    }
}
