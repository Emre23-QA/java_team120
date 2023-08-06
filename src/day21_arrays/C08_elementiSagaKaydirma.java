package day21_arrays;

import java.util.Arrays;

public class C08_elementiSagaKaydirma {
    public static void main(String[] args) {
        /*Soru 3- Verilen bir array’deki tum elementleri
        bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun,
array’i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

         */
        int[] arrSayi = {2, 3, 5, 6, 4, 0};

        elementiSagaKaydir(arrSayi);
        System.out.println(Arrays.toString(arrSayi));
    }

    public static void elementiSagaKaydir(int[] arr) {
        int arrTutucu1;
        int arrTutucu2 = arr[0];
        int sonElement = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            arrTutucu1 = arr[i + 1];
            arr[i + 1] = arrTutucu2;
            arrTutucu2 = arrTutucu1;
        }

        arr[0] = sonElement;

    }

}
