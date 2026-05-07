package LessonsWithYT;

import java.util.Scanner;

public class Lesson08_ForLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        float total = 0;
        for(int i=1 ; i<=4 ; i++){

        System.out.print("enter your " + i + " visa grade:");
        float grade = scanner.nextFloat();
        total += grade;
        }

        float average = total / 4;
        System.out.println("average: " + average);
    }
}
