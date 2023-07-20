package practice_repo.b103Practice.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
      /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yuksekligi gir");
        double yukseklik = input.nextDouble();
        double toplamYol = 0;
        int vurmaSayisi = 0;

        do {
            vurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik = yukseklik*0.75;
            toplamYol += yukseklik;
        }while (yukseklik>1);

        System.out.println("Yere Vurma Sayisi = " + vurmaSayisi);
        System.out.println("Toplam Alinan Yol = " + toplamYol);

        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));

    }
}
