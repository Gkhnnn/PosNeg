package WrapperClasses;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_RakamlarToplamı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir pozitif tamsayı giriniz.");
        int sayi = scan.nextInt();
        int birlerBasamagı = 0;
        int sayiToplami = 0;
        birlerBasamagı = sayi % 10;
        sayiToplami = sayiToplami + birlerBasamagı;
        sayi = sayi / 10;

        birlerBasamagı = sayi % 10;
        sayiToplami = sayiToplami + birlerBasamagı;

        sayi = sayi / 10;

        birlerBasamagı = sayi % 10;
        sayiToplami = sayiToplami + birlerBasamagı;
        sayi = sayi/10;
        System.out.println("sayiToplami = " + sayiToplami);


    }
}
