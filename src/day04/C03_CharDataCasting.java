package day04;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        /*
        char data turu ozel bir data turudur
        her ne kadar char data turu
        '' icerisinde sayi,harf,ozel karakter olsada
        ascii tablosundaki degeri de kullanilabilir

        ayni sekilde
        char data turundeki bir variable'i
        matematiksel islemde kullanirsaniz
        ascii tablosundaki degeri ile matematikselisleme girer
         */
        char ch1 = 'a';
        int sayi1 = ch1;
        System.out.println("ch1: "+ch1);
        System.out.println("sayi1: "+sayi1);

        String str1 = "java";
        String str2 = " ";
        String str3 = "candir";
        System.out.println(str1+str2+str3); //java candir

        char ch2 = 'a';
        char ch3 = 'b';
        System.out.println(ch3+ch2); //98+97=195

        // int sayinin ascii char karsiligini yaz?
        int sayi6 = 97;
        char ch9 =(char) sayi6;
        System.out.println("sayi nin ch5 karsiligi: "+ch9);// a
        System.out.println((char) sayi6);// a




    }
}
