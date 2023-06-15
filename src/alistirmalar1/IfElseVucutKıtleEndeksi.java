package alistirmalar1;

import java.util.Scanner;

public class IfElseVucutKıtleEndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz.");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu  cm cinsinden giriniz");
        double boy = scan.nextInt();
        double kitleEndeksi = kilo*10000/(boy*boy);
        System.out.println("Vücüd kitle endeksiniz = " + kitleEndeksi);

        if(kitleEndeksi>=30){
            System.out.println("Fazla Kilolusunuz ve Obezsiniz.");
        } else if (kitleEndeksi<30&&kitleEndeksi>25) {
            System.out.println("Kilolusunuz.");
        } else if (kitleEndeksi>=20&& kitleEndeksi<=25) {
            System.out.println("Normal Kilodasınız.");
        } else if (kitleEndeksi<20&&kitleEndeksi>15) {
            System.out.println("Zayıfsınız.");
        }else{
            System.out.println("Gecersiz bilgi girdiniz.");
        }

    }
}
