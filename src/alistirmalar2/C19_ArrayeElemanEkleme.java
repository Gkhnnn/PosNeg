package alistirmalar2;

import java.util.Arrays;

public class C19_ArrayeElemanEkleme {
    public static void main(String[] args) {
        String [] arr = {"Ali", "Veli", "Gökhan", "Nuran", "Hakan","Ceyda"};
        String eklenecekIsim = "Ahmet";
        arr = elemanEkle(arr,eklenecekIsim);
        System.out.println(Arrays.toString(arr));
    }
    public static String [] elemanEkle(String []arry, String eklenecekElement){
        String [] temp = new String[arry.length+1];
        for (int i = 0; i < arry.length; i++) {
            temp[i] = arry[i];

        }
        temp[temp.length-1] = eklenecekElement;
        ;
        return temp;
    }
}
