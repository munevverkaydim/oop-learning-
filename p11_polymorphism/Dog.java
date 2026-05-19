package p11_polymorphism;

public class Dog extends Animal {

    //paramater yok sadece dog sınıfına ait olan.

    //constructor
    public Dog(String name){//eğer üst objet boş tanımlanmış da olsaydı içerik almadan da yollayabilirdik
        super(name);
    }

    //businnes logic
    @Override
    public void makeNoise(){
        System.out.println(super.getName() + " says hav hav"); //burda super kullanmadan da getName() yaxsbilirdik. 
    }//çünkü üst sınıfta tanımlı her şey burda da tanımlı
    
}
