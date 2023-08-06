package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki basamakli pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int ilkBasamak = sayi % 10;
        int ikinciBasamak = (sayi/10)%10;


        switch (ikinciBasamak){
            case 1 :
                System.out.print("On ");
                break;
            case 2 :
                System.out.print("Yirmi ");
                break;
            case 3 :
                System.out.print("Otuz ");
                break;
            case 4 :
                System.out.print("Kirk ");
                break;
            case 5 :
                System.out.print("Elli ");
                break;
            case 6 :
                System.out.print("Atmis ");
                break;
            case 7 :
                System.out.print("Yetmis ");
                break;
            case 8 :
                System.out.print("Seksen ");
                break;
            case 9 :
                System.out.print("Doksan ");
                break;
            default:
                System.out.print("yanlis sayi girildi");
                break;
        }
        switch (ilkBasamak){
            case 1 :
                System.out.print("bir");
                break;
            case 2 :
                System.out.print("iki");
                break;
            case 3 :
                System.out.print("uc");
                break;
            case 4 :
                System.out.print("dort");
                break;
            case 5 :
                System.out.print("bes");
                break;
            case 6 :
                System.out.print("alti");
                break;
            case 7 :
                System.out.print("yedi");
                break;
            case 8 :
                System.out.print("sekiz");
                break;
            case 9 :
                System.out.print("dokuz");
                break;
            default:
                break;

        }

    }
}
