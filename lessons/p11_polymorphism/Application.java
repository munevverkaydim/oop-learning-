package lessons.p11_polymorphism;

import javax.naming.BinaryRefAddr;

public class Application {

    //POLYMORPHİSM:bir nesnenin birden fazla obje gibi davranabilmesi.
        //burda hayvan kapsar kedi, köpek kuş.
        public static void makeAnimalTalk(Animal A){ //buranın içine cat, dog, bird ve animal(genel sınıf da dahil) yollayabilirsin
            A.makeNoise();
        } // BU METHOD MAİN İN DIŞIDA OLMALII   


        //polymorphism olmasaydı ne olurdu:

        //statik methodları önemi: nesneyi oluşturmadan direkt çağırabiliyoruz. class a bağlı. class içinde çağrılabilir.
        //başka sınıftan çağırıyorsak da (public yapıysak) hangi class da ise oClassınAdı.methodAdı() şeklinde kullanılabilir
        public static void makeAnimalTalk2(Object object){ //Object en üst türdür. bütün nesneler bu sınıftan türer.(java ya özel)
            if (object instanceof Cat){
                Cat cat = (Cat) object;// CASTING Zorla Dönüştürme
                cat.makeNoise();
            }else if(object instanceof Dog){
                Dog dog = (Dog) object;// CASTING Zorla Dönüştürme
                dog.makeNoise();
            }else if(object instanceof Bird){
                Bird bird = (Bird) object;// CASTING Zorla Dönüştürme
                bird.makeNoise();
            }else if(object instanceof Animal){
                Animal animal = (Animal) object;// CASTING Zorla Dönüştürme
                animal.makeNoise();
            }// instanceof: Bir nesnenin belirli bir sınıfa ait olup olmadığını kontrol eden güvenlik kapısıdır (true/false döner).
        }


    public static void main(String[] args) {

        
        Animal animal1 = new Animal();
        System.out.println(animal1.getName());

        Animal animal2 = new Animal("animal");
        System.out.println(animal2.getName());

        Cat cat1 = new Cat("Tom");
        cat1.makeNoise();

        Dog dog1 = new Dog("recep");
        System.out.println(dog1.getName());

        Bird bird1 = new Bird("Tweety");
        System.out.println(bird1.getName());

        animal1.makeNoise();
        cat1.makeNoise();
        dog1.makeNoise();
        bird1.makeNoise();

        makeAnimalTalk(animal1);
        makeAnimalTalk(animal2);
        makeAnimalTalk(cat1);
        makeAnimalTalk(dog1);
        makeAnimalTalk(bird1);

    }
}
