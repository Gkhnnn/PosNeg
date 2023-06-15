package alistirmalar1;

import java.util.Scanner;

public class A05_MeshurSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz :\n");
        int girilenSayi = scan.nextInt();
        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("fizz   ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz   ");
            } else {
                System.out.print(i + "   ");
            }
        }

    }
}
