package alistirmalar2;

import javax.swing.text.Style;
import java.util.Scanner;

public class DoWhileLoopSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int sayi = 1;
        do {
            System.out.println("Lütfen bir sayı giriniz :");
            sayi = scan.nextInt();
            total+=sayi;



        } while (sayi != 0);
        System.out.println("Girdiğiniz sayıların toplamı: "+total);
    }
}
