package p13_abstraction;

public class Application {

    public static void tellName(Shape A){
        System.out.println("shape name is " + A.getName());
    }

    public static void main(String[] args) {
        
        Square sq = new Square("Blue Square", 5);
        Circle ci = new Circle("Red Circle", 3);
        Triangle tr = new Triangle("Grey Triangle" , 4.43, 0.23, 93, 43);

        tellName(sq); 
        tellName(ci);
        tellName(tr);

        // 1. Şekil Dizisi Oluşturma (Upcasting burada gerçekleşiyor)
        Shape[] shapes = {
            new Square("My Square", 5.0),
            new Circle("My Circle", 3.0),
            new Triangle("My Triangle", 10.0, 5.0, 8.0, 7.0)
        };

        for(Shape i: shapes){
            if(i instanceof Square){
                Square sqr = (Square) i;    //Eski değişkeni (i) yeni ve özel bir tiple tanımlanan başka bir değişkene ataman gerekir. (sq)
                System.out.println("Perfect Square: " + sqr.isPerfectSquare());
            }else if(i instanceof Triangle){
                Triangle trg = (Triangle) i;
                System.out.println("the largest angle of a triangle is " + trg.getLargestAngle());
            }else if(i instanceof Circle){
                Circle crc = (Circle) i;
                System.out.println("Diameter of circle is " + crc.calculateDiameter());
            }
        }
        
    }
}
