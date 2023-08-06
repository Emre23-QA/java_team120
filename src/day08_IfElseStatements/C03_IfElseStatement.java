package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
       double not = scanner.nextDouble();
       if (not >= 85 && not <= 100) System.out.println("durumunuz AA");
       else if (not >= 65 ) {
           System.out.println("durumunuz BB");
       } else if (not >= 50 ) {
           System.out.println("durumunuz CC");
       } else if (not >= 0 ) {
           System.out.println("durum DD");
       }
       else System.out.println("gecerli bir not giriniz");
    }
}
