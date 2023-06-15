package alistirmalar1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HesapMakinesi {
    public static int sum(int sayi1, int sayi2) {
        int result = sayi1 + sayi2;
        System.out.println("Toplama islemi :" + result);
        return result;
    }

    public static int subtraction(int sayi1, int sayi2) {
        int result = sayi1 - sayi2;
        System.out.println("Cıkarma islemi :" + result);
        return result;
    }

    public static int multpilication(int sayi1, int sayi2) {
        int result = sayi1 * sayi2;
        System.out.println("Carpma İslemi :" + result);
        return result;
    }

    public static int division(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            if (sayi2 == 0) {
                System.out.println("İkinci sayi Sıfırdan büyük olmalı.");
            }
            return 0;
        }
        int result = sayi1 / sayi2;
        System.out.println("Bölme islemi :" + result);
        return result;

    }

    public static int mod(int sayi1, int sayi2) {
        return sayi1 % sayi2;
    }

    public static int square(int sayi1, int sayi2) {
        int result = 1;
        for (int i = 0; i < sayi2; i++) {
            result *= sayi1;
        }
        return result;
    }

    public static void alanHesaplama(int sayi1, int sayi2) {
        System.out.println("Karenincevreuzunlugu =" + 2 * (sayi1 + sayi2));
        System.out.println("Kareninalanı = " + sayi1*sayi2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;


        String menu = "1 : Toplama İslemi\n" +
                "2 : Çıkarma İslemi\n" +
                "3 : Carpma İslemi\n" +
                "4 : Bölme İslemi\n" +
                "5 : Karesini Alma\n" +
                "6 : Mod alma islemi\n" +
                "7 : Karenin alan ve cevre hesaplaması\n"+
                "0 : Cıkıs Yap.";
        System.out.println(menu);
        while (true) {

            System.out.print("Bir işlem seciniz :");
            select = scan.nextInt();


            if (select == 0) {
                System.out.println("Çıkıs yaptınız.");
                break;
            }


            System.out.print("Lütfen ilk sayiyi giriniz.");
            int sayi1 = scan.nextInt();
            System.out.print("Lütfen ikinci sayiyi giriniz.");
            int sayi2 = scan.nextInt();

            switch (select) {
                case 1:
                    sum(sayi1, sayi2);
                    break;
                case 2:
                    subtraction(sayi1, sayi2);
                    break;
                case 3:
                    multpilication(sayi1, sayi2);
                    break;
                case 4:

                    division(sayi1, sayi2);
                    break;
                case 5:
                    square(sayi1, sayi2);
                    System.out.println("Üslü İfadesi :" + square(sayi1, sayi2));
                    break;
                case 6:
                    System.out.println(mod(sayi1, sayi2));
                    break;
                case 7:
                    alanHesaplama(sayi1, sayi2);
                    break;
                case 0:
                    System.out.println("Çıkıs yaptınız.");
                    break;
                default:
                    System.out.println("Gecersiz deger girdiniz.!!");
            }

        }


    }
}
