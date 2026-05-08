package LessonsWithYT;

public class Lesson14_MethodOverLoading {
    // Method Overloading !! ÖNEMLİİİ
    // Aynı fonksiyonu birden fazla kez yazıp içine aldığı parametreleri değiştirmek

    public static void showYourMessage(int sayi1, int sayi2, String metin){ //void değer döndürmeyecek demek
        System.out.println("merhaba " + sayi1 + " " + sayi2 + " " + metin);
    }

    public static void showYourMessage(int sayi1, String metin){ 
        System.out.println("merhaba " + sayi1 + " " + metin);
    }

    public static void showYourMessage(int sayi1, int sayi2){ 
        System.out.println("merhaba " + sayi1 + " " + sayi2);
    }

    public static void main(String[] args){
        showYourMessage(3, 2);
        showYourMessage(2, 6, "World");
        showYourMessage(9, "Java");
    }
}

//arguments: Fonksiyonu çağırırken içine gönderdiğin gerçek değerler (Örn: 3, "Java").
//parameter: Fonksiyonu tanımlarken parantez içine yazdığın değişkenler (Örn: int sayi1).
//method signiture: Metodun Adı ve Parametrelerin Listesi (Parametrelerin sayısı, tipi ve sırası)

//Diyelim ki şöyle bir metodumuz var: public static int topla(int a, int b)
// -->Bu metodun imzası şudur: topla(int, int)
