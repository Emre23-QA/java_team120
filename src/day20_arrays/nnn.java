package day20_arrays;

import java.util.Arrays;

public class nnn {
    public static void main(String[] args) {
     int ll =33666323;
     String hjj=""+ll;
        System.out.println(hjj);
        String[] str = {"ali", "vv","dd"};
        String[] str2 = {"a", "v2","d2"};
        str=str2;
        str2[0]="ss";
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str2));

    }
}
