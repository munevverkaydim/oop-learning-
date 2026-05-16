package lessons.p12_interfaces;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
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