package lessons.p13_abstraction;

public class Circle extends Shape {
    //parameter:
    double radius;

    //constructor:
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    //businnes logic;
    @Override
    public double findArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    @Override
    public double findPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }
    
    //GETTER SETTER
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
}
