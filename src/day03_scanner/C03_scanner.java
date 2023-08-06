package day03_scanner;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir double sayi giriniz");
double dbl = scanner.nextDouble();
        System.out.println("bir int sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println("iki sayi toplam: " + (dbl + sayi));
        System.out.println("iki sayi carpim: " + dbl * sayi);
    }
}
