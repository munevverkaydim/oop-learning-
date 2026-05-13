package lessons.p09_inheritance;

public class GasCar extends Car{//extends dediğimizde benzinli arabaları, car class ından inheritence  yoluyla türettik
    //burda Car class ında olan bütün özellikler var.

    //1 VARİABLES TANIMLADIK:
    private int fuelAmount;
    private boolean isTurbo; 

    

    //2. Constructor (Yapıcı Metot) -> Getter/Setter'dan ÖNCE  (1.constructor um)
    public GasCar(int fuelAmount, boolean isTurbo){
        super();
        this.fuelAmount = fuelAmount;
        this.isTurbo = isTurbo;
    }
    public GasCar(){ // OVERLOAD 2.CONSTRUCTOR UM
        this(20, true );
    }



    //3. BUSİNNES LOGİC (iş mantığı method ları)
    public void fillTank(){ //depoyu fulleyen bir function (method) oluşturduk.
        this.fuelAmount = 100;
    }

    //4. Getter ve Setter Metotları -> EN SONA YAKIN
    public int getFuelAmount(){ //GETTER
        return this.fuelAmount;
    }
    public void setFuelAmount(int fuel){ //SETTER
        this.fuelAmount = fuel;
    }


    public boolean setIsTurbo(){ //GETTER
        return this.isTurbo;
    }
    public void setIsTurbo(boolean is){ //SETTER
        this.isTurbo = is;
    }

    //OVERWRİTE METHODLAR --> üstünü çiğneyip yeniden yazma.
    @Override
    public void makeSound(){
        System.out.println("Gas cars are very loud");
    }
    
}


