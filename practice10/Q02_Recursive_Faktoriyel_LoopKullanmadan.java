package practice_repo.b103Practice.practice10;

public class Q02_Recursive_Faktoriyel_LoopKullanmadan {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) throws Exception {


        System.out.println(faktoriyel(5));

    }

    public static int faktoriyel(int sayi) throws Exception {

        if(sayi>0){
            if(sayi==1){
                return 1;
            }else {
                return sayi * faktoriyel(sayi-1);
            }
        }else {
            throw new Exception("Sayi sifirdan buyuk olmali");
        }
    }
}
