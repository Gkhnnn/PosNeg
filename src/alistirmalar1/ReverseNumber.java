package alistirmalar1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        // Kullanıcıdan birden fazla basamaklı sayi alarak
        // bu sayiyi ters ceviren bir program yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen en az iki basamaklı bir sayı giriniz : ");
        int number = scan.nextInt();
        int num = reverseNumber(number);
        System.out.println(num);

    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        return reversed;
    }
}
