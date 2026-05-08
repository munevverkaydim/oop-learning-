package LessonsWithYT;

public class Lesson17_MultiDimensionalArrays {
    public static void main(String[] args){

        //7 4 1
        //3 5 8 
        //int[][] multiArr = new int[2][3] 

        int[][] multiArr = { {7, 4, 1}, {3, 5, 8}};

        for (int i=0 ; i<2 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(multiArr[i][j] + "  ");
            }
            System.out.println();
        }



    }
}
