package lessons.p10_composition;

public class Engine {
    private int torque;
    private int horsePower;


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

