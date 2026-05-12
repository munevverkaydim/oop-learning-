package lessons.p08_constructors;

public class Application {
    public static void main(String[] args) {

        Student student1 = new Student("münevver", 20, 23291132, 100); //burdaki new kelimesi construcor cagırıyor.
        /* 
        student1.setName("münevver");
        student1.setAge(21);
        student1.setID(2329132);
        student1.setGrade(100);
        */

        System.out.println("student1 age is " + student1.getAge());

        //daha sonra bu özellikleri değiştirmek için set method u kullanırız.
        student1.setAge(21);

        System.out.print("student1 name is " + student1.getName());
        System.out.print(" age is " + student1.getAge());
        System.out.print(" ID is " + student1.getID());
        System.out.print(" grade is " + student1.getGrade());
    }
}
