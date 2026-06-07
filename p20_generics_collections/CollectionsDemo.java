package p20_generics_collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    
    //there are 3 type of collection:
        //1-collection: the conept 
        //2-Collection: interface
        //3-Collections: class 

    // Collection (interface) --> List(interface) --> Arraylist(class)

    //Collection interface does not work with INDEX

    public static void main(String[] args) {
        
        //int a[] = new int [4];  --> this arrays size is fixed. (not changeable)

        //we should choose the type <here>.
        Collection <Integer> values = new ArrayList<Integer>();  //this array size is flexible

        values.add(21);
        values.add(2);
        //if i want to add a value between these two, i can t. 
        //because collections does not work with INDEX.

        // FOR EACH loop works perfectly with Collection interface!
        for (int n : values) {
            System.out.println(n);
        }

    }
}

