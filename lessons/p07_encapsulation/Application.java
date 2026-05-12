package lessons.p07_encapsulation;

public class Application {
    public static void main(String[] args) {

    Hause hause1 = new Hause(); 
    hause1.setColour("red");
    hause1.setHowManyRooms(3);
    hause1.sethasGarage(false);    
    
    System.out.print("the colour of house1 is " + hause1.getColour());
    System.out.print(", hause1 has " + hause1.getHowManyRooms());
    System.out.println(" rooms and is hause1 has a garage: " + hause1.gethasGarage());


    Hause hause2 = new Hause(); 
    hause2.setColour("green");
    hause2.setHowManyRooms(4);
    hause2.sethasGarage(true);    
    
    System.out.print("the colour of house2 is " + hause2.getColour());
    System.out.print(", hause2 has " + hause2.getHowManyRooms());
    System.out.println(" rooms and is hause2 has a garage: " + hause2.gethasGarage());
    }


}
