package day08_IfElseStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip
// vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
// vucut kitle endeksi 30’dan buyukse obez,
// 25-30 arasi ise kilolu,
// 20-25 arasi ise normal,
// 20’den kucukse zayif yazdirin.
        Scanner scanner = new Scanner(System.in);

        System.out.println("kilonozu kilo olarak giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("boyunuzu CM olarak giriniz");
        double boy = scanner.nextDouble();
        double v_KitleEndeksi = kilo*10000 / (boy * boy);
        if (v_KitleEndeksi >= 30) {
            System.out.println("Durumunuz: OBEZ");
        }
        else if (v_KitleEndeksi >= 25) {
            System.out.println("Durumunuz: KILOLU");
        }
        else if (v_KitleEndeksi >= 20) {
            System.out.println("Durumunuz: NORMAL");
        }
        else System.out.println("Durumunuz: ZAYIF");
    }
}
