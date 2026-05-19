package p09_inheritance;

import javax.print.DocFlavor.READER;

public class Car {
    private String colour;
    private String brand;
    private int maxSpeed;
    private int height;


    //constructor 1
    public Car(String colour,String brand, int maxSpeed, int height){
        this.colour = colour;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.height = height;
    }

    //constructor 2 --> 1.sini yazmadan 2. yi yazamazdın!
    public Car(){ //DEFAULT
        this("black", "BMW", 200, 2); // hiç bir değer girilmemişse
    }
    
    /*  constructor overloading: eğer bazı değerleri bilip ötekileri bilmemiyor olsaydın buna gore istediğin kadar tanımlayabilirsin
    public Car(String colour,String brand, int maxSpeed){
        this.colour = colour;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String colour, int heightString brand){
        this.colour = colour;
        this.brand = brand;
        this.height = height;
    }

    public Car(String brand, int maxSpeed, int height){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.height = height;
    } */  //bu şekilde uzunca yazmaktansa 2.constructor daki gibi kısa yol kullan

    //CONSTRUCTOR 3 height bilinmiyor(manuel girdik)
    public Car(String colour, int maxSpeed, String brand){
        this(colour, brand, maxSpeed, 3); // 1. constructor'a boyutu 3 olarak pasla
    }

    // constructor 4 -> HATA VERİR çünkü 3 numara ile TIPI AYNI (String, String, int)
    // Eğer bunu kullanmak istiyorsan parametre sırasını değiştirmen lazım:
    public Car(String colour,String brand, int height){
        this(colour, brand,300, height);
    }

    //constructor 5
    public Car(String colour,int maxSpeed, int height){
        this(colour, "audi", maxSpeed, height);
    }

    // constructor 6 -> HATA VERİR çünkü 5 numara ile TIPI AYNI (String, int, int)
    // Eğer bunu kullanmak istiyorsan parametre sırasını değiştirmen lazım:
    public Car(int maxSpeed, int height, String brand){ // (int, int, String) yaptık
        this("white", brand, maxSpeed, height); // Şimdi düzeldi!       
    }


    public void makeSound(){
        System.out.println("Vroom Vroom! Cars are loud");
    }


    public String getColour(){
        return colour;
    }

    public String getBrand(){
        return brand;
    }

    public int getMaxSPEED(){
        return maxSpeed;
    }

    public int getHeight(){
        return height;
    }
}


//ÖZET: overload da dikkat!!: program degerlere bakar isimlere değil!!
// String, int, int --> method 1 de
// String, int, int --> method 2 de ise HATA. tiplerin yerini değiştir.


// çok parametreli yapılarda her durum için overload yazılmaz
//"Builder Pattern" gibi yapılar kullanılır. --> ilerde öğrenilecek
//şu an öğrenme aşaması olduğundan bu kadar yazdık overload.
// çok da iyi bir kod olmaz bu şekilde. 
