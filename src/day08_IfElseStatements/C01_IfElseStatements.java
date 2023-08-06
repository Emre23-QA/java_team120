package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter gir");
        char karakter = scanner.next().charAt(0);
        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("karakter buyuk harf");
        }
        else {
            System.out.println("karakter kucuk hartf");
        }
    }
}
