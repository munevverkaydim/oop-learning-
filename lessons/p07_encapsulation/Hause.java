package lessons.p07_encapsulation;

public class Hause {

    private String colour;
    private int howManyRooms;
    private boolean hasGarage; 


    //her class ın kendine ait methodu (function bulunur)
    public String getColour(){ //GETTER
        return this.colour; ////this burda bu classın demek. 
        //Bu içinde bulundugun sınıfın kendi özelliklerini aynı sınıf içinde kullanırken "this".
    }
    public void setColour(String clr){//SETTER
        this.colour = clr;
    }


    public int getHowManyRooms(){ //public yapıyoruz ki bu House class ı dışında kullanabilelim bu method u. 
        return this.howManyRooms;
    }
    public void setHowManyRooms(int hwMR){
        this.howManyRooms = hwMR;
    }

    public boolean gethasGarage(){ //get method u değer okuyor. yani değer döndürmek zorunda.
        return this.hasGarage;
    }
    public void sethasGarage(boolean hasG){ //set methodu değer döndürmüyor(void)
        this.hasGarage =hasG;
    }
}

//ENCAPSULATİON!!: Class ın değişebilen özelliklerini başka class lardan değiştirmeyin, okumayın!!
// method ile değiştir, oku. --> setter, getter methodları ile.


//kalabalık ekiplerle çalışırken method u kim çağırdı görebiliriz.
