import java.util.Arrays;

public class ArrayEqualityChecker {
    public static void main(String[] args){

        int[] array = {10, 20, 30, 40};

        int[] array2 = array; // BURDA BU İKİ ARRAY HAFIZADA AYNI YERİ GÖSTERİR!!

        int[] array3 = {10, 20, 30, 40}; // array ile aynı içerik olasa da hafızada farklı yerleri kaplarlar.

        //eşitliği kontrol edicez

        //1.yol: ÖNEMLİİ
        boolean flag = true;
        for(int i=0 ; i<array.length ; i++){
            if (array[i] != array3[i]){
                flag = false;
                break;
            }
        }if(flag == true){ //sadece flag yazsak da true mu diye bakardı yazdırma işlemini döngüden sonra yaptırdık
                System.out.println("equal");
            }else{
                System.out.println("not equal");
            }

        //2.yol:
        if(Arrays.equals(array,array3)){
            System.out.println("equal");
            }else{
                System.out.println("not equal");
        }


    }
}
