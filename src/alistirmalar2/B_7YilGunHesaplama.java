package alistirmalar2;

import java.util.Scanner;

public class B_7YilGunHesaplama {
    static double yilDakika = 360 * 24 * 60;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen dakika giriniz: ");
        double minute = sc.nextDouble();
        yilGunHesapla(minute);
    }

    public static void yilGunHesapla(double minute) {
        int yil = (int) (minute / yilDakika);
        System.out.println(yil);
        int gun = (int) ((minute - yil * yilDakika)/60);
        System.out.println(gun);
    }
}
