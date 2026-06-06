package p16_exception_handling;

import p09_inheritance.Car;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
      
        int x = 100;
        int y = 0;
        Car car = null;

        try{  // Bir try arkasına birden fazla catch yazılarak farklı hata senaryoları yönetilebilir.


            int z = x / y;

            System.out.println(car.getBrand());

            /* * TRY BLOĞU:
         * Hata çıkarma riski olan, "tehlikeli" kod satırlarını buraya yazarız.
         * Java bu bloğun içindeki kodları çalıştırmayı DENER.
         * Eğer bir satırda hata fırlatılırsa, try bloğunun kalan kısmı ÇALIŞMAZ,
         * program anında ilgili 'catch' bloğuna atlar.
         */

        }catch(ArithmeticException e){// 100 / 0 burada ArithmeticException fırlatır! Program alt satıra geçmeden catch'e zıplar.

            /* * CATCH BLOĞU:
         * Try içinde fırlatılan hatayı "YAKALADIĞIMIZ" ve yönettiğimiz yerdir.
         * Parantez içine yakalamak istediğimiz spesifik hata türünü yazarız.
         * Sadece try içinde o hata türü oluşursa bu blok tetiklenir.
         */
            System.out.println("we tried to divide an integer to zero");
            e.printStackTrace();// Hatanın terminaldeki kırmızı detaylı log dökümünü basar (programı çökertmez)

        }catch(NullPointerException k){// Eğer hata null bir nesneye erişimden kaynaklansaydı burası çalışacaktı
            System.out.println("there is a null pointer exception");
            
        }finally{
            System.out.println("there is finally part...");
            /* * FINALLY BLOĞU:
         * Hata çıksa da, çıkmasa da, hangi catch bloğuna girilirse girilsin
         * HER HALÜKARDA çalışacak olan koddur.
         * 
         * * ÖNEMLİ SINAV/MÜHENDİSLİK NOTU (Dosya Okuma Senaryosu):
         * Eğer burada bir dosyadan veri okuyor olsaydık (örneğin bir BufferedReader veya FileReader ile),
         * try bloğu içinde dosya açıldıktan sonra bir hata oluşursa dosya bellekte açık kalabilirdi.
         * İşte bu açık kalan dosyayı sisteme geri iade etmek ve kapatmak için 
         * 'dosya.close();' kodunu MUTLAKA bu finally bloğunun içine yazardık.
         * Böylece program hata alıp catch'e düşse bile dosya güvenle kapatılmış olurdu.
         */
        }

        // Eğer try-catch mekanizması olmasaydı program 15. satırda çökecek ve bu alt satıra asla gelemeyecekti.
        // Hata başarıyla yönetildiği (handle edildiği) için hayat normal bir şekilde devam eder:
        System.out.println("all program worked. have a nice day");

    }
    
}

// try-catch mekanizması, try içinde İLK hatayı gördüğü anda ilgili catch bloğuna sıçrar.
// Hatanın fırlatıldığı satırdan sonraki try kodlarına GERİ DÖNMEZ.
// Önce catch bloğunu, ardından HER HALÜKARDA finally bloğunu çalıştırıp mekanizmadan çıkar ve normal akışa devam eder.