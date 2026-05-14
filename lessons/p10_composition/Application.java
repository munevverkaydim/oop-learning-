package lessons.p10_composition;

public class Application {
    public static void main(String[] args) {
        
        Engine myEngine = new Engine();
        Rotor myRotor = new Rotor();
        Store myStore = new Store();

        Helicopter rose = new Helicopter(180, myEngine, myRotor, myStore);

        System.out.println(rose.getTailNumber() + " " + rose.getEngine() + " " + rose.getRotor() + " " + rose.getStore());
        
        rose.getEngine().startEngine(); //motoru çalıştırma fonksiyonu için önce motoru getirdik(get), ondan sonra fonksiyonu çağırdık.
        rose.getEngine().stopEngine();//önce motoru getirdik(get), ondan sonra fonksiyonu çağırdık.


        Helicopter peterSutherland = new Helicopter();

        System.out.println(peterSutherland.getTailNumber() + " " + peterSutherland.getEngine() + " " + peterSutherland.getRotor() + " " + peterSutherland.getStore());

    }
}
