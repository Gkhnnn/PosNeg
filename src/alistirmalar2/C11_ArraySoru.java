package alistirmalar2;

import java.util.Arrays;

public class C11_ArraySoru {
    public static void main(String[] args) {

        int [] sayi = {2,4,6,8};
        for (int i = 0; i < sayi.length; i++) {
           sayi[i] +=5;
        }
        System.out.print(Arrays.toString(sayi));
    }
}
