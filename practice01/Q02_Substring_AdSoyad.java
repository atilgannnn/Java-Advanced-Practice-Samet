package practice_repo.b103Practice.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

      /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz.");
            String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").trim().replaceAll("\\s+", " ");
            char adIlkHarf = adSoyad.substring(0,adSoyad.indexOf(" ")).toUpperCase().charAt(0);
            String ad = adIlkHarf+adSoyad.split(" ")[0].substring(1).toLowerCase();

            char soyAdIlkHarf = adSoyad.substring(adSoyad.indexOf(" ")+1).toUpperCase().charAt(0);
            String soyAd = soyAdIlkHarf+adSoyad.split(" ")[1].substring(1).toLowerCase();

            System.out.println("Ad: "+ad);
            System.out.println("Soyad : "+soyAd);

      }
}
