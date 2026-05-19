package p12_interfaces;

public class Application {
    public static void main(String[] args) {
        // 1. Creating objects
        Bird myBird = new Bird("Eagle");
        Fish myFish = new Fish("Goldfish");
        Cat myCat = new Cat("Whiskers");

        // 2. Polymorphism: Using Animal reference for different animals
        System.out.println("--- General Animal Activities ---");
        Animal[] zoo = {myBird, myFish, myCat};
        /* bu şekilde yapmaktansa;
        for (int i = 0; i < zoo.length; i++) {
        Animal a = zoo[i];
            a.makeSound();
        } */

        for (Animal animal : zoo) { //zoo dizisindeki her bir Animal nesnesi için tek tek bakıyor. dizilerde. 
            animal.breathe();   // Comes from Animal (Concrete)
            animal.makeSound(); // Comes from Subclasses (Overridden)
        }

        System.out.println("\n--- Special Ability Checks ---");

        // 3. Using Interfaces as Types
        // Only objects that implement 'Flyable' can be assigned here
        Flyable flyer = myBird; //Interface'ler aslında birer veri tipidir. CASTİNG yaptık. 
        flyer.fly();

        // 4. Checking and Casting (Instanceof)
        // Let's check if our animals can swim
        checkSwimmingAbility(myFish);
        checkSwimmingAbility(myCat);
    }

    public static void checkSwimmingAbility(Animal animal) {
        if (animal instanceof Swimmable) {
            System.out.println(animal.getName() + " has swimming skills.");
            // Casting: Treating the animal specifically as a Swimmable object
            ((Swimmable) animal).swim(); //Downcasting: Kutuyu açıp içindeki canlıya "Yüzücü" kimliğini takıyorum.
        } else {
            System.out.println(animal.getName() + " cannot swim.");
        }
    }
}

//"Upcasting" hiyerarşi: fish, swimmable, animal --> bir balık hepsinin tipindedir. yerine gore kullanabiliriz casting.

//Animal olarak bakarsan: Sadece nefes almasını ve ses çıkarmasını görürsün.
//Swimmable olarak bakarsan: Sadece yüzme yeteneğini görürsün.
//Fish olarak bakarsan: Hepsini görürsün.

//bu projede üstten alta:
//Animal (Abstract Class): En genel tip. (Nefes alan her şey).

//Swimmable (Interface): Bir yetenek tipi. (Yüzebilen her şey).

//Fish (Concrete Class): En özel tip. (Hem hayvandır hem yüzebilir).

//Yukarı Çıkış (Güvenli): Flyable f = myBird; (Otomatik, parantez gerekmez. Her kuş uçabilir.)
//Aşağı İniş (Riskli): Bird b = (Bird) flyer; (Parantez şart. Çünkü her uçan şey bir kuş olmayabilir, uçak da olabilir. Java onay ister.

// Upcasting, bir nesneyi daha genel bir kılıfa koymak  ---------------------->   Animal myAnimal = new Bird(); 
// Downcasting, genel bir kılıfın içindeki nesneyi tekrar özel haline döndürmekt  Bird myBird = (Bird) myAnimal;
// Interface Casting İşin İçine Interface Girince Aslında hiçbir şey değişmiyor Interface'leri de sadece birer "üst kimlik
// Flyable f = new Bird();  Upcasting - Otomatik. Çünkü kuş uçabilir.
// Bird b = (Bird) f;   Downcasting - Manuel. Çünkü her uçan şey kuş olmayabilir.