package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicidan 3 basamakli bir sayi alip
        // sayinin rakamlarini toplayip yaz
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");

         int sayi = scanner.nextInt();
        int ilkBasamak = sayi%10;
        int ikinciBasamak = (sayi/10)%10;
        int ucuncuBasamak = (sayi/100)%10;
        System.out.println(ilkBasamak+ikinciBasamak+ucuncuBasamak);


    }
}
