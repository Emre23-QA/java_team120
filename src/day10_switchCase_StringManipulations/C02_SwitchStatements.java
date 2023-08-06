package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("gun numarasini girin");
        int gunNo = scanner.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case  5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gun no 1-7 arasinda olmali");

        }


    }
}
