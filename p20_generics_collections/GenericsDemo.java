package p20_generics_collections;

import java.util.ArrayList;
import java.util.List;

class Conteiner<T extends Number>{ //T type can be only a number type(like float double or integer)

    T value;

    //business logic
    public void show(){
        System.out.println(value);
    }

    //getter setter
    public T getValue(){
        return this.value;
    }
    public void setValue(T vlue){
        this.value = vlue;
    }   

    public void demo(ArrayList<? extends T> obj){
        // 1. The "?" symbol is a Wildcard (Joker). It means "Unknown Type".
        // 2. "? extends T" means: "We can accept type T OR any child class of T".
        // 3. For example: If T is "Number", we can send a list of Integers 
        //    or a list of Doubles. They are all children of Number.
        // 4. This gives our method great flexibility while keeping it safe.
    }
}


public class GenericsDemo {
    
    public static void main(String[] args) {
         
        //List<> values = new ArrayList<>(); ----> if we made like this, we wouldn t have TYPE SAFETY

        // < > --> we define inside here the GENERİC
        List<Integer> values =new ArrayList<Integer>(); 

        values.add(3);
        values.add(2);

        Conteiner<Double> obj = new Conteiner<>();

        obj.show();

    }
}
