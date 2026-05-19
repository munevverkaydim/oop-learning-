package p14_static;

public class Application {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Ali");
        System.out.println(employee1.getName());

        Employee employee2 = new Employee("Veli");
        System.out.println(employee2.getName());

        System.out.println(Employee.showNumOfEmployee());


        Employee employee3 = new Employee("Ayşe");
        System.out.println(employee3.getName());

        System.out.println(Employee.showNumOfEmployee());
    }
}
