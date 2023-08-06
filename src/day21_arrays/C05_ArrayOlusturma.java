package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlusturma {

    public static void main(String[] args) {
 /*Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
     array’i olusturan ve bize donduren bir method olusturun.

     */
        System.out.println(Arrays.toString(arrayOlusturma()));

    }

    public static int[] arrayOlusturma(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Array'in boyutunu giriniz:");
        int arrayBoyutu = scanner.nextInt();
        int[] arr = new int[arrayBoyutu];


        for (int i = 0; i < arr.length; i++) {// array'e element atama
            scanner = new Scanner(System.in);
            System.out.println("Array 'in "+i+". elementini giriniz:");
            arr[i]= scanner.nextInt();
        }
        return arr;
    }

}
