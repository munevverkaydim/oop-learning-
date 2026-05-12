package lessons.p09_inheritance;

    public class Application {
        public static void main(String[] args) {
            
            Car car1 = new Car("green", "toyota", 300,2);
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            Car car2 = new Car("green", 300,1);
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            Car car3 = new Car();
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());


            ElectricCar electricCar1 = new ElectricCar();
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            

        }
    }
