package lessons.p11_polymorphism;

public class Animal {
    
     //POLYMORPISM: Bir object in brirden fazla object gibi davranması.

     private String name;


     //constructor1
     public Animal(String name){
        this.name = name;
     }
     //constructor2
     public Animal(){
        this("karabas");
     }


     //business logic
     public void makeNoise(){
        System.out.println("Animal make sound.");
     }


     //getter setter methods
     public void setName(String nm){
        this.name = nm;
     }
     public String getName(){
        return this.name;
     }

}
