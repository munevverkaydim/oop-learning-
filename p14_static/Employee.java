package p14_static;

public class Employee {

    private String name;
    private static int numOfEmployee = 0; // main methodu çalışmadan önce derelyicistatic değişkeb var mı diye bakar.
    // static değişken görünce bellekte yer açılır daha program başlamadan. 

    //constructor
    public Employee(String name){
        this.name = name;
        numOfEmployee ++;
    }


    //getter setter
    public void setName(String nme){
        this.name = nme;
    }
    public String getName(){
        return this.name;
    }

    public static int showNumOfEmployee(){
        return numOfEmployee;
    }
}

//static method lar da değişkenler de class a özgü. kullanıcının bunlara erişmesi tercih edilmez.
//static değişkenlerin ve method ların nesnelerle bir alakası yok.