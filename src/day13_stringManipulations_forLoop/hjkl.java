package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class hjkl {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin
        // ,girilen karakter kucuk harf ise onu buyuk olarak yazdirin,
        // yoksa girilen harfi yazdirin. bunu ternary operator da nasil yapabiliriz
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf girin:");
       String str = scanner.next();
       char harf = str.charAt(0);
        System.out.println((harf<='z' && harf>='a')?str.toUpperCase():str);
        }




}
