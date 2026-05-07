package MiniProjects;

import java.util.Scanner;

public class MiniProject03_GradeCalculator {
    public static void main(String[] args){

        /* karne not uygulaması
        0 - 44: zayıf
        45 - 54: geçer
        55 - 64: orta
        65 - 74: iyi
        75 - 84: çokiyi
        85 - 100: pekiyi  
         */

        System.out.print("notunuzu giriniz:");
        Scanner scanner = new Scanner(System.in);
        int not = scanner.nextInt();

        if ((not >= 0) && (not <= 44)){
            System.out.println("zayif");

        }else if((not >= 45) && (not <= 54)){
            System.out.println("gecer");

        }else if((not >= 55) && (not <= 64)){
            System.out.println("orta");

        }else if((not >= 65) && (not <= 74)){
            System.out.println("iyi");

        }else if((not >= 75) && (not <= 84)){
            System.out.println("cokiyi");

        }else{
            System.out.println("pekiyi");
        }

    }
    
}
