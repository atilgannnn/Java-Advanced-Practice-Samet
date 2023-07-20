package practice_repo.b103Practice.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    /*
    Tek bir String i�erisinde verilen euro ve dolarlar�n ayr� ayr� toplamlar�n bulan bir kod yaz�n�z.
    Ornek:
     String str ="$1 $12 �34 �56 $45 �78";
      dolarToplami: 58
      euroToplami: 168
     */
    public static void main(String[] args) {
        String str ="$1 $12 �34 �56 $45 �78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dollarToplami = 0;
        int euroToplami = 0;

        for(String w : arr){
            if(w.contains("$")){
                dollarToplami += Integer.parseInt(w.replace("$",""));//parseInt() ==> Intiger de�ere �eivirir.
            }else {
                euroToplami += Integer.parseInt( w.replace("�",""));
            }
        }
        System.out.println("dollarToplami = " + dollarToplami+"$");
        System.out.println("euroToplami = " + euroToplami+"�");
    }
}
