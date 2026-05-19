package p12_interfaces;

public abstract class Animal {
    private String name;


    //CONSTRUCTOR
    public Animal(String name) {
        this.name = name;
    }

    //SETTER 
    public String getName() { //getter tanımlamadık çünkü isim bir kez obje oluşurken verilmesini sonradan değişmemesini istedik
        return name;
    }

    // Concrete method: Every animal breathes the same way in our logic
    public void breathe() {//gövdesi var çünkü tüm hayvanlar aynı şekilde nefes alıyor.(bu kod için:)
        System.out.println(name + " is breathing.");
    }

    // Abstract method: Every animal makes a sound, but HOW is specific to the animal
    public abstract void makeSound();  //Hayvan olan her sınıfın bir sesi olmak ZORUNDA
    //Ama ne ses çıkaracağını üst sınıf bilemez, alt sınıflar kendi yazmalı.
}

//abstract sınıf kullanarak hem kod tekrarını önlüyoruz (name ve breathe bir kez yazıldı)
//hem de alt sınıflara "ses çıkarmayı unutma!" diye zorunluluk getiriyoruz. 