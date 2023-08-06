package day09_NestedIfElseStatement;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        //kullanicidan ay numarasini al ay ismini yaz
        Scanner scanner = new Scanner(System.in);
        System.out.println("ay numarasini gir");
        int numara = scanner.nextInt();
        if (numara==1) System.out.println("ocak ayi");
        else if (numara==2) System.out.println("subat");
        else if (numara==3) System.out.println("mart");
        else if (numara==4) System.out.println("nisan");
        else if (numara==5) System.out.println("mayis");
        else if (numara==6) System.out.println("haziran");
        else if (numara==7) System.out.println("temmuz");
        else if (numara==8) System.out.println("agustos");
        else if (numara==9) System.out.println("eylul");
        else if (numara==10) System.out.println("ekim");
        else if (numara==11) System.out.println("kasim");
        else if (numara==12) System.out.println("aralik");
        else System.out.println("ay numarasi yanlis");


        switch (numara) {
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayis");
                break;
            case 6 :
                System.out.println("haziran");
                break;
            case 7 :
                System.out.println("temmuz");
                break;
            case 8 :
                System.out.println("agustos");
                break;
            case 9 :
                System.out.println("eylul");
                break;
            case 10 :
                System.out.println("ekim");
                break;
            case 11 :
                System.out.println("kasim");
                break;
            case 12 :
                System.out.println("aralik");
                break;
            default:
                System.out.println("ay numarasi yanlis");

        }

    }
}
