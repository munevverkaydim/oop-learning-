package lessons.p09_inheritance;

public class ElectricCar extends Car { //extends dediğimizde elektrikli arabaları, car class ından inheritence  yoluyla türettik
    //burda Car class ında olan bütün özellikler var.

    private float charge; //yeni özellik tanımladık

    public float getCharge(){ //GETTER METHODU
        return charge;
    }
    public void setCharge(float chrg){ //SETTER METHODU
        this.charge = chrg;
    }

   
    public void chargeItFull(){
        this.charge = 100;
    }

}
