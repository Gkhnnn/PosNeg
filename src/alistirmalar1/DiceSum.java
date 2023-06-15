package alistirmalar1;

import java.util.Random;
import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {
        // Kullanıcıdan 1 ile 12 arasında bir sayı alın
        // Daha sonra iki zar atarak kullanıcıdan
        // alınan rakama kacıncı atmada ulaştığını söyleyen bir method yazın.

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 12 arasında bir rakam giriniz : ");
        int sayi = scn.nextInt();
        Random rnd = new Random();
        int zar1 = rnd.nextInt(1, 7);
        int zar2 = rnd.nextInt(1, 7);
        int result = zar1 + zar2;
        int count = 0;
        if(sayi == result){
            count++;
        }
        System.out.println(count);
    }
}
