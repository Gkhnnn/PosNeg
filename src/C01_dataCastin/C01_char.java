package C01_dataCastin;

import java.util.Scanner;

public class C01_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        System.out.println("Girilen karakter :" + girilenKarakter);
        System.out.println("Girilen karakter " + (char) (girilenKarakter + 1));
        System.out.println("Girilen karakter " + (char)(girilenKarakter+2));
        System.out.println("Girilen karakter " + (char)(girilenKarakter+3));

    }

}
