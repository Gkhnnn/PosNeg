package alistirmalar2;

import java.util.Scanner;

public class C24_codingbatSoru {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String str = sc.next();

        if(str.length()<2){
            System.out.println(str.substring(0));
        }else {
            System.out.println(str.substring(0,2));
        }
    }
}
