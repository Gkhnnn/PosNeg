package alistirmalar2;

import java.util.Arrays;

public class C14_ArraySoru {
    public static void main(String[] args) {


        // bir marketin fiyatlarını tutan bir array var ve bu arrayın en yuksek ve en dusuk fiyatlarını yazdıran method olusturun.

        double[] fiyatlar = {23, 34.5, 42.1, 5.7, 3.4, 23.5};
        minAndMax(fiyatlar);
    }

    public static void minAndMax(double[] sayi) {
        double min = sayi[0];
        double max = sayi[0];
        for (int i = 0; i < sayi.length; i++) {
            if (max < sayi[i]) {
               max=sayi[i];
            }
            if (min > sayi[i]) {
                min= sayi[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}