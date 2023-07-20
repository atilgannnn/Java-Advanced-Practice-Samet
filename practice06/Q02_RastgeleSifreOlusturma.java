package practice_repo.b103Practice.practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {
    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz");
        int karakterSayisi = input.nextInt();
        String sifre = "";
        int sayac =0;

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndeks = karakterler.length();

        while (sayac<karakterSayisi){

            int rastgeleIndeks = (int)(Math.random()*maxIndeks);

            sifre += karakterler.charAt(rastgeleIndeks);

            sayac++;

        }

        System.out.println("Sifre = " + sifre);

    }

}
