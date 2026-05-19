package p06_classes_objects;

public class Car {

    public int maxSpeed;  //Bu sınıftan bir nesne oluşturulduğunda her yerden erişilebilir.
    // Başka bir sınıf içinde 'car.maxSpeed = 200;' diyerek doğrudan okunabilir veya değiştirilebilir.
  
    public String colour; //maxSpeed ile aynı şekilde, dış dünyadaki tüm sınıflara açıktır.(public)
    // 'car.colour = "Kırmızı";' şeklinde sınırsız erişim izni verir.

    private String brand = "audi"; //Bu değişken "kilitlidir". Sadece bu sınıfın (Car) süslü parantezleri içinden erişilebilir.(private)
    // Car sınıfı dışındaki hiçbir yer (örn: Main sınıfı) 'car.brand' diyerek bu veriyi göremez veya değiştiremez.
    // Veriyi korumak ve sadece kontrollü şekilde sunmak (Getter/Setter ile) için kullanılır.

    private int height = 1;
    
    public String getBrand(){ //get demeye alış method un başına okurken get methodu kullanılır.
        return this.brand;  //this burda bu classın demek.  
        //Bu içinde bulundugun sınıfın kendi özelliklerini aynı sınıf içinde kullanırken "this".
    }

    public int getHeight(){
        return this.height;
    }
}

//ENCAPSULATİON!!:bir sonraki ders bakıcaz. burdaki kod uymuyor.