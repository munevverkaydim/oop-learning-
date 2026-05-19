package p15_collections_maps;

import java.util.HashMap;

public class FirstRepeatingChar {

    //HashMap Google Facebook mülakat sorusu

    //bir String de ilk tekrar eden karakteri bulan fonksiyon yaz
    //String k = "ABCABC" -> ilk tekrar eden karakter A.

    public static char findFirstRepeatingChar(String a){

        HashMap<Character, Integer> hashMap =new HashMap<> (); //ikinci hashmap içi boş olabilir. java anlar.

        //char veya int sadece düz bir veridir
        //hafızada yer kaplar ama kendilerine ait metotları (örneğin nesne karşılaştırma araçları) yoktur

        //Character veya Integer ise birer nesnedir.


        for(int i=0 ; i<a.length() ; i++){
            char c = a.charAt(i);

            //containsKey() map arayüzünü (interface) uygulayan tüm sınıflarda çalışır. 
            // Çünkü bu metot, bir yapının içinde belirli bir "anahtarın" (Key) olup olmadığını kontrol eder.
            if(!hashMap.containsKey(c)){  //burda ! geldiği için negatiflik kattı.
                hashMap.put(c, 1);
            }else return c;
        }
        return '-'; // Eğer döngü biter ve hiç tekrar eden bulunamazsa burası çalışır

    }

    public static void main(String[] args) {
         
        String a = "SFHSDFHJLSDVJSL";
        System.out.println(findFirstRepeatingChar(a));
    }
}
