package p13_abstraction;

public class Square extends Shape {
    //parameter
    double side;

    //constructor
    public Square(String name, double side){
        super(name);
        this.side = side;
    }

    //business logic
    @Override
    public double findArea(){
        double area = this.side * this.side;
        return area;
    }

    @Override
    public double findPerimeter(){
        double perimeter = this.side * 4;
        return perimeter;
    }

    public boolean isPerfectSquare(){
        return true;
    }

    //getter setter
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }

}
