package practice_repo.b103Practice.practice05;

public class Q04_Varargs_HesapMakinesi {
    //Temel 4 matematik işlemi yapan bir kod yazınız.

    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplama(3,5,7,100);
        hesapMakinesi.cikarma(10,10);
        hesapMakinesi.carpma(12,12,10,0);
        hesapMakinesi.bolme(10,1.2);

    }
}
