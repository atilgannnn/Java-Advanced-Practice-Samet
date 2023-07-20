package practice_repo.b103Practice.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        String str = "!s";
        System.out.println(str.matches(".s"));//true ==> herhangi bir karakter ile başlayıp 's' harfi ile bitiyor.
        //matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.
        System.out.println(str.matches("..s"));//false ==> 3 karakterli olamadığı için

        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        System.out.println("&shgfh".matches(".s.*"));//true ==> ilk karakter herhangi biri, ikinci karakter 's'
        //  .* ==> esnek sayıda karalter(0 yada daha fazla)
        System.out.println("&shgfh".matches(".r.*"));//false ==> ikinci karakter uyuşmuyor.

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("ca".matches("[a-zA-Z]*"));//

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("Abchd".matches("[a-zA-Z]{5}"));//true ==> 5 karakterli ve hepsi de harf
        System.out.println("AbchdX".matches("[a-zA-Z]{5}"));//false ==> 5'ten fazla karakter içeriyor.
        System.out.println("1dfgh".matches("[a-zA-Z]{5}"));//false ==> harf dışında karakter içeriyor.

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("[0-9]{6,}"));//true ==> en az 6 rakam içeriyor.
        System.out.println("12345".matches("[0-9]{6,}")); // false ==> 6'dan az karakter içeriyor.
        System.out.println("12345X".matches("[0-9]{6,}"));//false ==> rakam dışı karakter içeriyor.

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//true ==> en fazla 10 karakter(\\w) içeriyor.
        // \\w = [a-zA-Z0-9_]
        System.out.println("abcd123".matches("\\w{7,10}"));//true ==> en az 7 karakter(\\w) içeriyor.

        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));//true ==> tüm koşullaru sağlıyor.
        System.out.println("1?12345678".matches("[1]{1}[\\p{Punct}]{1}[0-9]{8}"));//true ==> üstteki ile aynı

    }
}
