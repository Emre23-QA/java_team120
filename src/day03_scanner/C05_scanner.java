package day03_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen dikdortgenin 1. kenar uzunlugunu giriniz");
         double aKenari = scanner.nextDouble();
        System.out.println("simdi de 2. kenar uzunlugunu giriniz");
        double bKenari = scanner.nextDouble();
        System.out.println("dikdortgen alani: " + aKenari * bKenari);


    }
}
