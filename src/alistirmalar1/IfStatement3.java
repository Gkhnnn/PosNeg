package alistirmalar1;

import java.util.Scanner;

public class IfStatement3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char karakter = scan.next().charAt(0);

        if(karakter>='A'&& karakter<='Z'){
            System.out.println("Girilen Harf Büyüktür.");
        }else {
            //System.out.println((char)(karakter+32));
            //System.out.println(Character.toUpperCase(karakter));
        }

    }
}
