package practice_repo.b103Practice.practice09;

import java.util.HashMap;

public class Q05_Map_AdSoyAd {
      /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */
      public static void main(String[] args) {
            String[] ad = {"John", "Mark", "Ali"};
            String[] soyAd ={"Doe", "Twain", "Can"};

            HashMap<String,String > adsoyad = new HashMap<>();
            for(int i=0;i< ad.length;i++){

                  adsoyad.put(ad[i],soyAd[i]);
            }
            System.out.println("adsoyad = " + adsoyad);
      }
}
