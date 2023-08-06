package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
 /*
        Kullanicidan satir sayisi olarak bir rakam alin
        ve asagidaki gibi bir sekil cizdirin
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satirSayisi = scanner.nextInt();
        for (int i = 1; i <= satirSayisi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
