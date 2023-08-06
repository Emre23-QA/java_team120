package day03_scanner;

import java.util.Scanner;

public class C07_swap {
    public static void main(String[] args) {
        // kullanıcıdan iki sayi alip ikisinin degerlerini degistirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz");
        int ilkSayi = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();
        int temp = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = temp;
        System.out.println(ilkSayi + " " + ikinciSayi);

    }
}
