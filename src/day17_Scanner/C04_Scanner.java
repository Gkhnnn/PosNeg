package day17_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ismini, sayismini ve yasini alip
        ismin ilk harfi soyismi, yas şeklinde yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi girin");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz.");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yasınızı giriniz.");
        int yas = scan.nextInt();
        System.out.println("Girilen bilgiler : " + isim.charAt(0)+ " "+
                soyisim +", " + yas);

    }
}
