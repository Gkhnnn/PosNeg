package alistirmalar1;

import java.util.Scanner;

public class A01_CharSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz :");
        char girilenKarakter = scan.nextLine().charAt(0);
        for (int i = 1; i <=10 ; i++) {

            System.out.print((char) (girilenKarakter+i) + " ");

        }

    }
}
