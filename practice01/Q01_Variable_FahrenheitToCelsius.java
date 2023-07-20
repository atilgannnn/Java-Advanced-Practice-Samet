package practice_repo.b103Practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");

        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit-32)*5/9;
        System.out.println("celcius = " + celcius);
        //-----------
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println(f.format(celcius));
        System.out.printf("%.2f",celcius);
    }
}