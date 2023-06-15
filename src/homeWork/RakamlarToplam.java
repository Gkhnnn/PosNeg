package homeWork;

import java.util.Scanner;

public class RakamlarToplam {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir sayı giriniz.");
        int sayi = scan.nextInt();
        int toplam  =0;


       toplam = sayi%10;
       sayi = sayi/10;
       toplam = toplam + (sayi%10);
       sayi = sayi/10;
       toplam = toplam + (sayi%10);
       sayi= sayi/10;
       toplam=toplam+(sayi%10);
       sayi = sayi/10;
       toplam = toplam +(sayi%10);


        System.out.println("sayi = " + sayi);
        System.out.println("toplam = " + toplam);


    }
}
