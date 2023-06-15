package alistirmalar1;

import java.util.Scanner;

public class DaireninAlaniniHesaplama {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıcapını giriniz : ");
        double yariCap = input.nextDouble();

        double daireninAlani = pi * yariCap * yariCap;
        double daireninCevresi = 2 * pi * yariCap;
        System.out.println("daireninAlani = " + daireninAlani);
        System.out.println("daireninCevresi = " + daireninCevresi);

    }
}
