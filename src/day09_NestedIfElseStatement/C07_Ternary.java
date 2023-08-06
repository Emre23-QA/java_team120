package day09_NestedIfElseStatement;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        // kullanicidan alinan sayinin mutlak degerini yaz
        Scanner scanner =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi = scanner.nextDouble();
        System.out.println(sayi>0 ? sayi : -sayi );

    }
}
