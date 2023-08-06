package day26_forEachLoop_consructor;

public class C02_HarfKullanimAdedi {
    /*Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
     kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
     */
    public static void main(String[] args) {
        String cumle ="Java her gecen gun daha zevkli hale geliyor";
        String harf ="a";

        String[] cumleArr = cumle.split("");

        int sayac =0;

        for (String each:cumleArr
             ) {
            if (each.equals(harf))
            {
                sayac++;
            }

        }
        if (sayac==0)
        {
            System.out.println("aradiginiz harf cumlede kullanilmamis");
        }
        else System.out.println("aradiginiz "+harf+" harf cumlede " + sayac + " kere kullanilmis");
    }
}
