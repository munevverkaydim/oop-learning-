package p15_collections_maps;

import java.util.HashMap;

public class HashMapStudent {

    //dizilerde (Arrays) veya listelerde bir elemana erişmek için 0, 1, 2 gibi indeksleri kullanıyorduk 
    //HashMap te ise indeksler yerine kendi belirlediğimiz benzersiz anahtarları (Key) kullanıyoruz.
    
    public static void main(String[] args) {
        
        // Tanımlama: <Key Tipi, Value Tipi>
        HashMap <Integer , String> students = new HashMap<>();

        //veri eklerken .put()
        students.put(101, "munevver" );
        students.put(102, "ayse" );
        students.put(103, "ali" );

        //veriye ulaşmak için .get
        String studentName = students.get(101);
        System.out.println(studentName);

        System.out.println(students.get(102));


        // Aynı Key ile tekrar .put() yaparsan eski değerin üzerine yazar
        students.put(102, "fatma");
        System.out.println(students.get(102));


        //veriyi silmek için .remove()
        students.remove(103);

        // boyut Öğrenme .size()
        System.out.println("Total student number : " + students.size());


        // Bir Anahtarın Var Olup Olmadığını Kontrol Etme .containsKey()
        if (students.containsKey(101)) {
            System.out.println("there is a student who has nuber 101.");
        }
    }
}

//Bir HashMap içinde aynı Key'den sadece bir tane olabilir.
//Eğer aynı key ile yeni bir veri eklemeye çalışırsan, eski verinin üzerine yazar (Overwrites).
//value lar aynı olabilir

//HashMap, elemanları senin ekleme sırana göre dizmez. belleğe random dizer

//çok çok hızlıdır. bu sebeple tercih edilir
//Listeler gibi tek tek döngüyle arama yapmaz. O(1) 