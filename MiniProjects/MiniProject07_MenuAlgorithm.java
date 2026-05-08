package MiniProjects;

import java.util.Scanner;

public class MiniProject07_MenuAlgorithm {
    public static void main(String[] args){
        //kullancıya menüyü gösterip seçimini ekrana yazdıran program: (çıkış seçilirse program biter)
        //MENU
        //1-karışık pizza   
        //2-sebzeli pizza
        //3-mantarlı piiza
        //4-EXIT
        Scanner scanner = new Scanner(System.in);

        System.out.println("please choose your meal number:\n1-mixed pizza\n2-vegatables pizza\n3-mushrooms pizza\n4-EXIT");
        int choose = scanner.nextInt();

        if(choose > 0 && choose <= 4){
            if(choose == 1){
                System.out.println("your choose is mixed pizza");
            }else if(choose == 2){
                System.out.println("your choose is vegetables pizza");
            }else if(choose == 3){
                System.out.println("your choose is mushrooms pizza");
            }else if(choose == 4){
                System.out.println("you will EXIT");
            }else{
                System.out.println("please enter a digit betwen 1 - 4");
            }
        }


    }
}
