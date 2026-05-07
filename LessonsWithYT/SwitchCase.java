package LessonsWithYT;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        /* switch (değişken)
        {
        case situation1:
            //code block
        case situation2:
            //code block
        case situation3:
            //code block
       }   */

        /* 1 - 7 arası günleri kullanıcı konsoldan sayı olarak girsin 
        programımız bu sayıyı güne çevirsin
        1: pazartesi
        2: salı
        ...
        7: pazar */

        System.out.print("enter your day number:");

        Scanner scanner = new Scanner(System.in);
        int dayNo = scanner.nextInt();

        switch(dayNo){
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("wrong number! Please enter a number between 1-7"); //default istenen aralık dısında olan harici değerler için çalışır.
        }
    }
}
