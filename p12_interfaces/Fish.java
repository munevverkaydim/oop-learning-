package p12_interfaces;

public class Fish extends Animal implements Swimmable {
    
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is making bubble sounds.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the water.");
    }
}