package lessons.p10_composition;

    public class Rotor {

    private int length; 
    private int rpm;


    //constructor
    public Rotor(int length, int rpm){
        this.length = length;
        this.rpm = rpm;
    }
    
    public Rotor(){ //parantez içi boş yani kullanıcıdan değer gelmezse bu method çalışacak.
        this(10, 50);
    }



    public int getRpm() {        
        return this.rpm;
    }
    public void setRpm(int rp){
        this.rpm = rp;
    } 


    public int getLength(){
        return this.length;
    }
    public void setLenght(int lngth){
        this.length = lngth;
    }
}