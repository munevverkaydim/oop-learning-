package LessonsWithAI.lesson02_encapsulation;

public class Student {
    // 1. Değişkenleri private yaparak dışarıdan direkt erişimi kapattık
    private String name;
    private double gpa;

    // 2. Getter (Veriyi okumak için)
    public String getName() {
        return name;
    }

    // 3. Setter (Veriyi kontrol ederek yazmak için)
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) { // İşte kontrol mekanizması!
            this.gpa = gpa;
        } else {
            System.out.println("Hata: Geçersiz not ortalamasi!");
        }
    }
    
    public double getGpa() {
        return gpa;
    }
} 
/*Neden Encapsulation Kullanırız?:
Veri Gizleme (Data Hiding): Sınıfın içindeki değişkenlerin (örneğin gpa veya password) dışarıdan doğrudan değiştirilmesini engelleriz.

Kontrol ve Geçerlilik: Veri atanırken belirli kurallar koyabiliriz (Örneğin: "Not ortalaması 0'dan küçük, 4'ten büyük olamaz").

Esneklik ve Bakım: Sınıfın içindeki bir mantığı değiştirdiğinde, o sınıfı kullanan diğer kodları bozmamış olursun.*/

