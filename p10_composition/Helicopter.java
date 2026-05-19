package p10_composition;

public class Helicopter {
    // Parçaları nesne olarak tanımlıyoruz (Composition)
    private int tailNumber;
    private Engine engine; //composition bu. oop nin özelliği bu. nesne içinde nesne tutulabiliyor
    private Rotor rotor; //temel veri tiplerinden farklı veri tipi yerine nesne yazdık.
    private Store store;

    
    //constructor1
    public Helicopter(int tailNumber, Engine engine, Rotor rotor, Store store){
        this.tailNumber = tailNumber;
        this.engine = engine;
        this.rotor = rotor;
        this.store = store;
    }
    //constructor2
    public Helicopter(){//burda constructor içinde obje ürettik.(composition yani nesne içinde nesne)
        this(1234, new Engine(), new Rotor(), new Store());
    }


    //setter getter methodları:
    public void setTailNumber(int tnum){
        this.tailNumber = tnum;
    }
    public int getTailNumber(){
        return this.tailNumber;
    }

    public void setEngine(Engine eng){
        this.engine = eng;
    }
    public Engine getEngine(){
        return this.engine;
    }

    public void setRotor(Rotor rt){
        this.rotor = rt;
    }
    public Rotor getRotor(){
        return this.rotor;
    }

    public void setStore(Store st){
        this.store = st;
    }   
    public Store getStore(){
        return this.store;
    }
}
