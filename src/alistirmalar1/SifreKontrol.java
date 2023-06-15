package alistirmalar1;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean tekrarSifreIste = true;
        String sifre = "";

        while (tekrarSifreIste) {

            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();

            if (sifreKontrolEt(sifre)) { // sifre kontrolu true donerse sifre basarili demektir
                System.out.println("basari ile olusturuldu");
                // break;
                tekrarSifreIste = false; // break veya bu kod yazilabilir

            }
        }
    }

    public static boolean sifreKontrolEt(String sifre) {
        int flag = 0;
        if (!(sifre.charAt(0) > 'a' && sifre.charAt(0) < 'z')) {
            System.out.println("ilk harf kucuk harf olmalı");
            flag++;

        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("Son karakter rakam olmalı.");
            flag++;
        }
        if ((sifre.contains(" "))) {
            System.out.println("sifre bosluk içermemeli.");
            flag++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

}

