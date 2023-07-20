package practice_repo.b103Practice.practice09.Q04_Interface_MaasHesaplama;

public class InterfaceRunner {
     /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
    Maaş kriterleri: Brüt maaş belirle.
                     Çalışanın toplam çalışma yılına göre her yıl için maaşı 100 dolar  artır.
                     Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için maaşı 10 dolar artır.
                     10 yıl ve üstü çalışma yılı bulunan çalışanların maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */

    public static void main(String[] args) {
        MaasHesapla ali = new MaasHesapla();
        double alinanMaasi =ali.netMaas(10000,20,170);
        System.out.println("alinanMaasi = " + alinanMaasi);

    }


}
