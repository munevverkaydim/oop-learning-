package lessons.lesson01_classes_object;

public class Student {
    // ozellikler (Fields)
    String name;
    String department;
    double gpa;

    // Davranis (Method)
    void study() { //class icindeki fonksiyonlara Method diyoruz. Metotlar bir nesnenin davranislarini temsil eder.
        System.out.println(name + " munevver is working here right now...");
    }
}