package lessons.p09_inheritance;

    public class Application {
        public static void main(String[] args) {
            
            Car car1 = new Car("green", "toyota", 300,2);
            System.out.println(car1.getColour() + " " + car1.getBrand() + " " + car1.getMaxSPEED() + " " + car1.getHeight());

            Car car2 = new Car("green", 300,1);
            System.out.println(car2.getColour() + " " + car2.getBrand() + " " + car2.getMaxSPEED() + " " + car2.getHeight());

            Car car3 = new Car();
            System.out.println(car3.getColour() + " " + car3.getBrand() + " " + car3.getMaxSPEED() + " " + car3.getHeight());
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
         
            

                //REFERENCES: 
                //Obje: Car fabrikamdan çıkan bir arabadır (car1). 
                //Referans (car1): Elindeki bir kağıtta yazan o arabanın hafızadaki adresidir.

                car3 = car1; //bunu yazdıkatan sonra car1 değeri artık car3 ün gösterdiği değeri gösterir.
                System.out.println(car3.getColour() + " " + car3.getBrand() + " " + car3.getMaxSPEED() + " " + car3.getHeight());
                //çıktıda car1 in değerleri yazdı
            }
        }
