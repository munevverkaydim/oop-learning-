package LessonsWithYT;

import java.util.Scanner;

public class Lesson10_DoWhileLoop { 
    public static void main(String[] args){
        //do while da koşul aramadan dongüye girilir. 
        // while da şart sağlamıyosa giriş olmaz.

        System.out.print("Enter your number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int total = 0;
        do{
            total += number;
            number --;
        }while(number > 0);

        System.out.println("total: " + total);

    }
}        

