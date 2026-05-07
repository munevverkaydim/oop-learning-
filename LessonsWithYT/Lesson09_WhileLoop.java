package LessonsWithYT;

public class Lesson09_WhileLoop {
    public static void main(String[] args){

        /*
        for(int i=0 ; i<10 ; i ++)
            System.out.println(i);    for seklinde böyle olurdu
         */



        //while dongüsü içinde tanımlayamayız değişkeni. dışarda tanımlamamız lazım
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }


    }
}
