package alistirmalar2;

import java.util.Scanner;

public class B_7EnerjiHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Suyun agırlıgını kilogram cinsinden giriniz: ");
        double suyunAgirligi = sc.nextDouble();
        System.out.print("Suyun baslangıc sıcaklıgını giriniz: ");
        double finalTemp = sc.nextDouble();
        System.out.print("Suyun son sıcaklıgını giriniz: ");
        double initialTemp = sc.nextDouble();
        double sonuc = enerjiHesapla(suyunAgirligi, finalTemp, initialTemp);
        System.out.println("sonuc = " + sonuc);


    }

    public static double enerjiHesapla(double suyunAgirligi, double finalTemp, double initialTemp) {
        double enerjiHesaplama = suyunAgirligi * (finalTemp - initialTemp) * 4184;
        return enerjiHesaplama;
    }
}
