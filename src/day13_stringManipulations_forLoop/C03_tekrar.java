package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_tekrar {
    public static void main(String[] args) {
        // Kullanicidan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek    input : J1*2av4.a C67//an=+dir--_
        //          output "Java Candir."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str1 = scanner.nextLine();
        str1 = str1.replaceAll("\\d","");
        str1 = str1.replaceAll(" ","1");
        str1 = str1.replaceAll("\\W","");
        str1 = str1.replaceAll("_","");
        str1 = str1.replaceAll("1"," ");
        str1 += ".";

        System.out.println(str1);

    }
}
