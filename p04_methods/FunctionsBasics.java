package p04_methods;
public class FunctionsBasics {

    public static void showYourMessage(String name, int age){ //lower camel case (method yazım kuralı:)
        System.out.print("Hello ");
        System.out.println(name);
        System.out.print("your age is ");
        System.out.println(age);
    }


    public static void main(String[] args){ //zorunlu main fonksiyon. kullanıcı ile iletişime geçilen yer
        // Function ve Method aynı şeyler.

        String name; 
        showYourMessage("munevver", 21);  //string değerlerde tırnağı unutma

    }
}
