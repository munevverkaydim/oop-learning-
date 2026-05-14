package lessons.p11_polymorphism;

public class Cat extends Animal{
    //cat class ın kendine ait paramater ı yok.

    //constructor
    public Cat(String name){
        super(name);
    }

    //businnes logic
    @Override
    public void makeNoise(){
        System.out.println("cat is aking soud meoww");
    }

}
