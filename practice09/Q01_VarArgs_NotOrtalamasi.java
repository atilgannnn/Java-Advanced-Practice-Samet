package practice_repo.b103Practice.practice09;

public class Q01_VarArgs_NotOrtalamasi {
    //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.
    public static void main(String[] args) {

        ortalamaHesapla("Ali",96.9, 96.7, 100, 100, 96, 95);
        ortalamaHesapla("Ayse", 90, 99, 100, 100);
        ortalamaHesapla("Fatma", 90, 99, 100);
        ortalamaHesapla("Hayriye", 90, 99, 100, 99, 66);

    }

    public static void ortalamaHesapla(String isim, double... not) {

        double toplam = 0;
        for (double w : not) {
            toplam += w;
        }
        System.out.println(isim+"'nin not ortalamasi: "+String.format("%.2f",toplam / not.length));
    }
}
