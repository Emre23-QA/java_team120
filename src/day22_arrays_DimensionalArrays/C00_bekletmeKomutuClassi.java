package day22_arrays_DimensionalArrays;

public class C00_bekletmeKomutuClassi {
    public static void main(String[] args) {


        try {
            Thread.sleep(1000); // 1 saniye bekletme
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
    public static void beklemeKomutu(int milis)
    {
        try {
            Thread.sleep(milis); // istendigi kadar saniye bekletme
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}
