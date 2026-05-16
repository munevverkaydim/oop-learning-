package lessons.p12_interfaces;

public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
    // Cat doesn't implement Flyable or Swimmable
}