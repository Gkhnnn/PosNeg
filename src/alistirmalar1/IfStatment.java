package alistirmalar1;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi > 0) {
            System.out.println("sayi pozitif bir sayidir = " + sayi);
        }
        if (sayi > 99 && sayi < 1000) {
            System.out.println("sayi 3 basamaklı pozitif bir sayidir = " + sayi);
        }
        if (sayi % 3 == 0) {
            System.out.println("sayi 3 tam bölünebilen bir sayıdır. = " + sayi);
        }
        if (sayi % 10 == 7) {
            System.out.println("sayimiz mükkemmel bir sayıdır = " + sayi);
        }
    }
}
