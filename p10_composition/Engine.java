package p10_composition;

public class Engine {
    private int torque;
    private int horsePower;


    //constructor:
    public Engine(int torque, int horsePower){
        this.torque= torque;
        this.horsePower = horsePower;
    }
    public Engine(){
        this(40, 1000 );
    }


    //businnes logic
    public void startEngine(){
        System.out.println("engine is starting..");
    }

    public void stopEngine(){
        System.out.println("engine is stopped..");
    }



    public void setTorque(int trq){ //SETTER
        this.torque = trq;
    }
    public int getTorque(){ //GETTER
        return this.torque;
    }

    public void setHoursePower(int hp){//SETTER
        this.horsePower = hp;
   }
   public int getHoursePower(){ //GETTER
        return this.horsePower;
   }
}

//eğer hiç biir sey yazmazsak başına (private, public, protected) varasyılan "Package-Private" erişim seviyesini atanır.

// PRIVATE: Sadece tanımlandığı dosya (.java) içinden erişilebilir; sınıfın "özel sırrıdır".

// DEFAULT: Hiçbir şey yazılmazsa; sadece aynı klasör (paket) içindeki dosyalar erişebilir.

// PROTECTED: Aynı klasördekiler + farklı klasörde olsa bile o sınıfı miras alanlar (subclass) erişebilir.

// PUBLIC: Proje içindeki tüm klasörlerden ve dosyalardan sınırsızca erişilebilir.