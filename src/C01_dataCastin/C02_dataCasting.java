package C01_dataCastin;

import java.util.Scanner;

public class C02_dataCasting {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bölünecek sayıyı giriniz.");
        int a = scan.nextInt();
        System.out.println("Lütfen bölecek sayı giriniz.");
        int b= scan.nextInt();

        System.out.println("İşleminin sonucu "+ a/b);

        double sonuc = a/b;

        System.out.println(sonuc);

        double dogruSonuc = (double) a/b;
        System.out.println(dogruSonuc);

    }
}
