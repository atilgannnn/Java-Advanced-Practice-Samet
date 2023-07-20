package practice_repo.b103Practice.practice08;

import java.util.Scanner;

public class Q03_ForLoop_StringRakamlarToplami {
     /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.

     Örn:
     input : J4\/4 1$ 34$¥
     output : 16

     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Bir String Giriniz");
         String str = input.nextLine();

         rakamlarToplami(str);

     }
     static void rakamlarToplami(String str){

         int toplam =0;
         for(int i=0; i<str.length();i++){

             if(Character.isDigit(str.charAt(i))){
                 toplam += Integer.parseInt(""+str.charAt(i));

             }
         }
         System.out.println("Rakamlar toplami: "+toplam);
     }
}
