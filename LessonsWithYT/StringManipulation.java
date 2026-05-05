package LessonsWithYT;

public class StringManipulation{
     public static void main(String[] args){
        String metin = "Hello Java!";
        metin = metin.toUpperCase(); // metinin içindeki karakterlerin hepsini büyüttü.
        System.out.println(metin);

        String altMetin = metin.substring(7, 11); // substring içine yazdığımız index aralığında okuma yapar sonuncu dahil değil.(her dilde farklı bu)
        System.out.println(altMetin);  

        String test = " 7";
        String yenimetin = altMetin + test; //iki metni bu şekilde birleştirebiliriz
        System.out.println(yenimetin);
     }    
}
