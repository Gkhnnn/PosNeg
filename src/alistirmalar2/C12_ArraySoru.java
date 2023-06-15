package alistirmalar2;

import java.util.Arrays;

public class C12_ArraySoru {
    public static void main(String[] args) {
        String[] isimler = {"Huseyin", "Yusuf", "Mehmet", "Akile", "Said"};
        String silinecekHarf = "u";

        for (int i = 0; i < isimler.length; i++) {
            if(isimler[i].contains(silinecekHarf)){
                isimler[i]= null;
            }
            System.out.println(isimler[i]);
        }
        System.out.println(Arrays.toString(isimler));
    }
}
