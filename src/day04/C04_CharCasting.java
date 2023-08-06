package day04;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
        /*
        kullaniciden bir char iste
        sonraki 3 char karakteri yazdirin
         */
        System.out.println("bir karakter giriniz");
        Scanner scanner = new Scanner(System.in);

        // scanner.nextChar() methodu olmadigindan
        // once next() ile String alip sonra charAt(0) ile ilk karakteri al
        // scanner.next().charAt(0);
        int sayi1 =(int)scanner.next().charAt(0);;
        System.out.println((char) (sayi1+1)+","+ (char) (sayi1+2)+","+(char) (sayi1+3));//a--> b,c,d
        System.out.println();



    }
}
