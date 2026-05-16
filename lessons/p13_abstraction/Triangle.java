package lessons.p13_abstraction;

public class Triangle extends Shape{
    //parameter:
    double base;
    double height;
    private double sideA;
    private double sideB;

    //constructor:
    public Triangle(String name, double base, double height, double sideA, double sideB){
        super(name);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //bussinness logic:
    @Override
    public double findArea(){
        double area = this.base * this.height / 2 ;
        return area;
    }

    @Override
    public double findPerimeter(){
        double perimeter = this.base + this.sideA + this.sideB;
        return perimeter;
    }

    //getter setter
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return this.base;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public double getSideA(){
        return this.sideA;
    }

    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public double getSideB(){
        return this.sideB;
    }
}
