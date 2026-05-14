package lessons.p11_polymorphism;

public class Application {
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
    }
}
