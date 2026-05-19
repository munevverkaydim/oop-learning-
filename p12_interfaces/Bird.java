package p12_interfaces;

public class Bird extends Animal implements Flyable {// 'implements', bu sınıfın ilgili arayüzdeki (interface) boş metodun 
// içini dolduracağına dair verdiği bir söz.
    
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet Tweet!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying through the sky.");
    }
}