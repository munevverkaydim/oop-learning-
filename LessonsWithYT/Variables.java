package LessonsWithYT;

public class Variables {

    public static void main(String[] arg){

        int a = 2;
        System.out.println("a=" + a);

        float b = 7f;  //float tanımladığın değerin sonuna f yazmak zorundasın. (32byte)
        System.out.println("y=" + b); //floatı integer a cevir

        float x;
        x = (float) a / 3; //işlem sonucunda küsuratı kaybetmek istemiyosak parantez içi flot yazmamız lazım
        System.out.println(x);
    
        double h=20.0; // 64byte yer kaplar. virgülden sonrası daha uzun.
        System.out.println(h);

        boolean flag = true; // varsayılan FALSE!!!
        System.out.println(flag);

        char l = 'k';
        char deneme = 3;  //eğer char değişkenineint ataması yapılırsa ASCII değerini alır.
        System.out.println(l); //bir karakter yazabilirsin sadece.
        System.out.println(deneme);

        String metin = "Hello World!";
        System.out.println(metin);
        
    }

}

// bir doble içine float atayabiliriz. double büyük olan. Küçük olana büüyüğü atayamazsın.
