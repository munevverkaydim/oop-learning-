package p06_classes_objects;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car(); //burda car1 objesi oluşturduk. Car methodunu kullanarak.
        car1.colour = "green"; //colour ı public yaptığımız için başka class lardan erişebiliyoruz. brand e direkt erişemeyiz
        car1.maxSpeed = 160;

        System.out.println(car1.colour + " " + car1.maxSpeed);

        Car car2 = new Car(); //burda car2 objesi oluşturduk.
        car2.colour = "red";
        car2.maxSpeed = 200;

        System.out.println(car2.colour + " " + car2.maxSpeed);        
    }
}
