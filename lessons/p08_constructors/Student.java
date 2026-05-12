package lessons.p08_constructors;

public class Student {

    //Bir sınıf bir taslaktır (ev planı gibi)
    //Constructor, o evi inşa ederken eline tuğlayı, çimentoyu aldığın ve evin rengine, oda sayısına karar verdiğin o "yapım aşaması"dır.

    private String name;
    private int age;
    private int iD;
    private int grade;

    //Constructor 1
    public Student(String name, int age, int iD, int grade){
        this.name = name;
        this.age = age;
        this.iD = iD;
        this.grade = grade;
    }   // constructor sayesinde bir Student nesnesi oluştururken set method unu uzunca kullanmak zorunda kalmıyoruz.


    //Constructor 2 (default) --> parametre girilmezse default buradaki değerleri alır.
    public Student(){ //Constructor 2 (default) --> parametre girilmezse default buradaki değerleri alır.
        this("Ali", 18, 12345678, 50);
    }
    /*  constructor bu şekilde de tanımlanabilir ama ilk hali daha kolay tercih edilen
    public Student(){
        this.name = "Ali";
        this.age = 18;
        this.iD = 12345678;
        this.grade = 50;
    }   */


    public String getName(){ //get method u değer okuyor. yani değer döndürmek zorunda.
        return this.name;
    }
    public void setName(String nme){ //set methodu değer döndürmüyor(void)
        this.name =nme;
    }


    public int getAge(){ //get method u değer okuyor. yani değer döndürmek zorunda.
        return this.age;
    }
    public void setAge(int A){ //set methodu değer döndürmüyor(void)
        this.age =A;
    }


    public int getID(){ //get method u değer okuyor. yani değer döndürmek zorunda.
        return this.iD;
    }
    public void setID(int i){ //set methodu değer döndürmüyor(void)
        this.iD =i;
    }


    public int getGrade(){ //get method u değer okuyor. yani değer döndürmek zorunda.
        return this.grade;
    }
    public void setGrade(int Grd){ //set methodu değer döndürmüyor(void)
        this.grade =Grd;
    }

}

/*Constructor yazmadığımız zaman boş kabul ediyor. şu şekilde gibi boş:
    public Student(){
    
    }   
*/
