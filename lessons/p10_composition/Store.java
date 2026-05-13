package lessons.p10_composition;

public class Store {
    private int storageCapacity;

    //constructor:
    public Store(int storageCapacity){
        this.storageCapacity =storageCapacity;
    }
     
    //setter getter:
    public int getStorageCapacity(){
        return this.storageCapacity;
    }
    public void setStorageCapacity(int capacity){
        this.storageCapacity = capacity;
    }

}
