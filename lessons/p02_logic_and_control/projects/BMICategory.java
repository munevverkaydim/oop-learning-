import java.util.Scanner;

public class BMICategory {

    public static void main(String[] args){

            /*BMI = ağırlık / (boy * boy)

    BMI < 18.5 ise zayıf

    18.5 <= BMI <= 25 ise normal 

    25 < BMI < 30 ise kilolu 
  
    BMI >= 30 ise obez
    
    */

        System.out.println("Enter your weight:");

        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();

        System.out.println("Enter your hight(m)");
        float hight = scanner.nextFloat(); 

        double BMI = weight / Math.pow(hight, 2);

        // Switch için kategoriyi sayıya çeviriyoruz
        int category;

        if (BMI < 18.5) {
            category = 1;
        } else if (BMI >= 18.5 && BMI <= 25) {
            category = 2;
        } else if (BMI > 25 && BMI < 30) {
            category = 3;
        } else {
            category = 4;
        }

        switch(category){
            case 1:
                System.out.println("you are slim");
                break;

            case 2:
                System.out.println("you are normal");
                break;
            case 3:
                System.out.println("you are fat");
                break;

            case 4:
                System.out.println("you are obez");
                break;
        }

    }

}
