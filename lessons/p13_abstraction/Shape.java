package lessons.p13_abstraction;

public abstract class Shape { //bu sınıftan obje oluşturamazsın. (abstract class: soyut sınıf)
    //paramater:
    public String name;

    //constructor:
    public Shape(String name){
        this.name = name;
    }

    //businnes logic:
    abstract double findArea();//abstract method: içi boş. bu class a bağlı türeyen her sınıf bu methodu yazmak zorunda
    abstract double findPerimeter();

    //getter setter:
    public void setName(String nme){
        this.name = nme;
    }
    public String getName(){
        return this.name;
    }
}
