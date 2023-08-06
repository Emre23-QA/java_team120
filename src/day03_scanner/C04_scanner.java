package day03_scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz");

        String isim = scanner.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println("isminiz: " + isim +"\nsoy isminiz: " + soyIsim + "\nyasiniz: " + yas);
    }
}
