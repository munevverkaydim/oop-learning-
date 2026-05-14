package lessons.p11_polymorphism;

public class Bird extends Animal{

    //burada variable tanımlamayalım

    //constructor
    public Bird(String name){
        super(name);
    }

    //businnes logic
    @Override //üst class taki metodu ghostladık. aynı method adını afrklı kez kullandık üstüne yazdık
    public void makeNoise(){
        System.out.println("bird is making sound. cik cik");
    }

    //getter setter tanımlamıyoruz çünkü paramater yok bird class ında.
}