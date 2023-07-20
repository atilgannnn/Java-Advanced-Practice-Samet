package practice_repo.b103Practice.practice05;

public class Q03_Overloading {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Hacim hacim = new Hacim();
        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdortgenPrizma = hacim.hacimHesapla(5,6,1);
        System.out.println("karePrizma = " + karePrizma);//karePrizma = 150
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);//dikdortgenPrizma = 30
        System.out.println(hacim.hacimHesapla(10));//1000

    }
}
