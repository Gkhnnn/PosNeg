package alistirmalar2;

import java.util.Arrays;

public class C10_ArrayYazdirma {
    public static void main(String[] args) {

         // verilen bir String Array'ın tüm elementlerini yazdırın.
        String[] isimler = {"Hüseyin", "Yusuf", "Mehmet", "Akile", "Said" };
        String total = Arrays.toString(isimler);
        System.out.println("total = " + total);

        // array olarak degilde element olarak yazılmasını istersek

        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i]+ " ");

        }
    }
}
