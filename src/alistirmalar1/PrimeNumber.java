package alistirmalar1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayi alarak bu sayının asal sayı olup olmadığını kontrol ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
        int num = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Asal sayıdır.");
        } else {
            System.out.println("Asal sayı degildir.");
        }


    }
}
