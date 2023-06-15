package alistirmalar2;

import java.util.Arrays;

public class C18_ArraySoru {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        arr =elemanKaydir(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int [] elemanKaydir(int[] arry) {
        int temp = arry[arry.length - 1];
        for (int i = arry.length - 1; i >= 1; i--) {
            arry[i] = arry[i - 1];

        }
        arry[0] = temp;
        return arry;

    }
}
