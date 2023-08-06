package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class fhgjhj {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("urun adedi gir");
        int urunSayisi = scanner.nextInt();
        System.out.println("liste fiyatini gir");
        double listeFiyati = scanner.nextDouble();

        System.out.println("musteri kartiniz varmi? \nE: EVET ,H:HAYİR");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);
        if (kartVarmi=='E'){

            System.out.println("%20 indirimli toplam fiyat: "+urunSayisi*listeFiyati*80/100);
        } else if (kartVarmi=='H') {


        }
    }
}
