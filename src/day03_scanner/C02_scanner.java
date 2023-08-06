package day03_scanner;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        // kullanıcıdan bir tam sayı alıp karesini yaz
        // 1. adım: scanner objesi oluştur
        Scanner scanner = new Scanner(System.in);
        // 2. adım: bilgi girişi iste
System.out.println("bir tam sayi giriniz");
        // 3. adım: istadiğiniz data turune uygun variable olustur
        // ve scanner objesini kullanarak uygun metotla
        // kullanıcının girdiği değeri al
        int girilenSayi = scanner.nextInt();
        // 4. adım: girilen sayı kaydedildi
        System.out.println("Girilen sayinin karesi"+ ": "+girilenSayi*girilenSayi);

    }
}
