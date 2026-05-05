package LessonsWithYT;

public class StringManipulation{
     public static void main(String[] args){
        String metin = "Hello Java!";
        metin = metin.toUpperCase(); // metinin içindeki karakterlerin hepsini büyüttü.
        System.out.println(metin);

        String altmetin = metin.substring(7, 11); // substring içine yazdığımız index aralığında okuma yapar sonuncu dahil değil.(her dilde farklı bu)
        System.out.println(altmetin);  

        String test = " 7";
        String yenimetin = altmetin + test; //iki metni bu şekilde birleştirebiliriz
        System.out.println(yenimetin);
     }    
}
