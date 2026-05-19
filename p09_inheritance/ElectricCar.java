package p09_inheritance;

public class ElectricCar extends Car { //extends dediğimizde elektrikli arabaları, car class ından inheritence  yoluyla türettik
    //burda Car class ında olan bütün özellikler var.

    private float charge; //yeni özellik tanımladık
    private char batteryType; // A, B, C tipleri var kabul edelim.


    //2. Constructor (Yapıcı Metot) -> Getter/Setter'dan ÖNCE  (1.constructor um)
    public ElectricCar(int charge, char batteryType){
        super();
        this.charge = charge;
        this.batteryType = batteryType;
    }
    public ElectricCar(){ // OVERLOAD 2.CONSTRUCTOR UM
        this(20, 'C' );
    }


    //3. BUSİNNES LOGİC (iş mantığı method ları)
    public void chargeFull(){ //şarjı fulleyen bir function (method) oluşturduk.
        this.charge = 100;
    }


    //4. Getter ve Setter Metotları -> EN SONA YAKIN
    public float getCharge(){ //GETTER METHODU
        return charge;
    }
    public void setCharge(float chrg){ //SETTER METHODU
        this.charge = chrg;
    }

    public char getBatteryType(){ //GETTER
        return this.batteryType;
    }
    public void setBatteryType(char type){ //SETTER
        this.batteryType = type;
    }

   
    public void chargeItFull(){
        this.charge = 100;
    }

    @Override
    public void makeSound(){
        System.out.println("Electric cars are not very loud");
    }
    

}
