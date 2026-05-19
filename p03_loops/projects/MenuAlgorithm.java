package p03_loops.projects;
import java.util.Scanner;

public class MenuAlgorithm {
    public static void main(String[] args){
        //kullancıya menüyü gösterip seçimini ekrana yazdıran program: (çıkış seçilirse program biter)
        //MENU
        //1-karışık pizza   
        //2-sebzeli pizza
        //3-mantarlı piiza
        //4-EXIT
        Scanner scanner = new Scanner(System.in);

        int choice; // döngü içinde tanımlasaydık while için koşul olarak choice kullanamazdık.

        do{
            System.out.println("\n--- PIZZA MENU ---");  //tek satırdansa ayrı ayrı yazarak okunabilirlği arttırdık.
            System.out.println("1- Mixed Pizza");
            System.out.println("2- Vegetables Pizza");
            System.out.println("3- Mushrooms Pizza");
            System.out.println("4- EXIT");
            System.out.print("Please choose your meal number: ");

            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\nyour choice is mixed pizza");
                    break;
                case 2:
                    System.out.println("\nyour choice is vegetables pizza");
                    break;
                case 3:
                    System.out.println("\nyour choice is mushrooms pizza ");
                    break;
                case 4:
                    System.out.println("\nEXITing the program");
                    break;
                default:
                    System.out.println("\ninvalid value! Please enter a number between 1 and 4\n");
            }

        }while(choice != 4);   // do while döngüsünde yazınca kullanıcı 4 girene kadar sistem çalışmaya devam edecek.
            

    }
}
