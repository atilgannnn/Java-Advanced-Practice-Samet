package practice_repo.b103Practice.practice10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_BufferedReader_TextOkuma {
    //Bir text dosyasındaki 3. satırının kelime sayısını veren bir kod yazınız.
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("C:/Users/TechPro/Desktop/HelloWorld.txt"));
        file.readLine();
        file.readLine();
        String line3=file.readLine();
        System.out.println(line3);
        String[] arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        //Son satırı okutma...
        String line = null;
        while (file.readLine() != null) {
            line = file.readLine();
        }
        System.out.println(line);

    }
}
