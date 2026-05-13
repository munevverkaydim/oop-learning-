package lessons.p09_inheritance;

    public class Application {
        public static void main(String[] args) {
            
            Car car1 = new Car("green", "toyota", 300,2);
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            Car car2 = new Car("green", 300,1);
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            Car car3 = new Car();
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());
            car3.makeSound();


            ElectricCar electricCar1 = new ElectricCar();
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());
            electricCar1.makeSound();


            GasCar gasCar1 = new GasCar(45, true);
            System.out.print(gasCar1.getColour() + " " + gasCar1.getBrand() + " " + gasCar1.getMaxSPEED() + " " + gasCar1.getHeight());
            System.out.println(" " + gasCar1.getFuelAmount() + " " + gasCar1.getFuelAmount());

            GasCar gasCar2 = new GasCar();
            System.out.print(gasCar2.getColour() + " " + gasCar2.getBrand() + " " + gasCar2.getMaxSPEED() + " " + gasCar2.getHeight());
            System.out.println(" " + gasCar2.getFuelAmount() + " " + gasCar2.getFuelAmount());
            gasCar1.makeSound();
            
            /* asagıdakı gibi bir araba tanımlamak istiyorsak bu şekilde 6 parametreli bir constructor tanımlaman lazım 
            GasCar gasCar3 = new GasCar("Red", "Ferrari", 320, 1, 50, true);  */
            
        }
    }
