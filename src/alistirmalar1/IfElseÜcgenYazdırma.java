package alistirmalar1;

import java.util.Scanner;

public class IfElseÜcgenYazdırma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 kenar uzunlugu giriniz.");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if(kenar1==kenar2&&kenar1==kenar3&& kenar1>0){
            System.out.println("Eskenar Ucgendir.");

        } else{
            System.out.println("Eskenar ucgen degildir.");

        }
    }
}
