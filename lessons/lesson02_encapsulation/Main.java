package lessons.lesson02_encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Münevver");
        s1.setGpa(3.9);
        
        System.out.println(s1.getName() + " adli ogrencinin notu: " + s1.getGpa());
    }
}