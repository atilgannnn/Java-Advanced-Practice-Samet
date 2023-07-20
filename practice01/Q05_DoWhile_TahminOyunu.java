package practice_repo.b103Practice.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {

    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int sayi;
        int rastgeleSayi = (int) (Math.random() * 101);
        int sayac = 0;
        System.out.println("1-100 arasi bir sayi tahmini giriniz");


        do {
            sayac++;

            sayi = input.nextInt();
            if (sayi == rastgeleSayi) {
                System.out.println("Tebrikler, " + sayac + " tahminde sayiyi buldunuz!");
                System.out.println("Puaniniz hesaplaniyor...");
                Thread.sleep(3000);
                System.out.println("Puaniniz: " + (11 - sayac) * 10);
            } else if (sayi < rastgeleSayi) {
                System.out.print("Bilemediniz, tahmin icin " + (10 - sayac) + " hakkiniz kaldi! Daha buyuk bir sayi giriniz:");
            } else {
                System.out.print("Bilemediniz, tahmin icin " + (10 - sayac) + " hakkiniz kaldi! Daha kucuk bir sayi giriniz:");
            }
            if (sayac == 10) {
                System.out.println("Hakkiniz bitti oyunu kaybettiniz.\nTekrar oynamak icin 1, cikmak icin herhangi bir sayi girin");
                int secenek = input.nextInt();
                if (secenek == 1) {
                    sayac = 0;
                    rastgeleSayi = (int) (Math.random() * 100) + 1;
                } else {
                    break;
                }
            }

        } while (sayi != rastgeleSayi);
    }
}
