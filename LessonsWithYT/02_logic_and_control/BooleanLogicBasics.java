public class BooleanLogicBasics {
    public static void main(String[] args){
        
        //  > , < , <= , >=  
        
        boolean sonuc;
        sonuc = 10 > 5;
        System.out.println(sonuc);

        boolean sonuc2;
        sonuc2 = 5 > 5;
        System.out.println(sonuc2);

        //  == , != 
        //  &&  || 

        boolean cevap;
        cevap = (5 == 5) && (7 != 8);
        System.out.println(cevap);

        boolean cevap2;
        cevap2 = (5 == 5) || (7 != 8);
        System.out.println(cevap2);

    }
    
}
