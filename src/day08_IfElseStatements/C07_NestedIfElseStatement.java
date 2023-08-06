package day08_IfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyetinizi girin E: erkek , K: kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("yasinizi girin");
        double yas = scanner.nextDouble();
        if (cinsiyet == 'E'){
            if (yas<=100 && yas>=65) System.out.println("erkek emekli olabilir");
            else if (yas<65 && yas>=0) {
                System.out.println("Erkek emekli olamaz, "+(65-yas) + " yiliniz var");
            }
            else System.out.println("yas hatali girildi");
        }

        else if (cinsiyet == 'K') {
            if (yas<0 || yas >100) System.out.println("yas hatali");
            else if (yas>=60) {
                System.out.println("Kadin emekli olabilir");
            }
            else System.out.println("kadin emekli olamaz, "+(60-yas) + " yiliniz var");


        }
        else System.out.println("cinsiyet hatali girildi");
    }
}
