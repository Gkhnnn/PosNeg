package alistirmalar1;

import java.util.Scanner;

public class KullanıcıdanSifreAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz : ");
        String sifre = scan.nextLine();
        int flag=0;

        if (!(sifre.charAt(0) >='a' && sifre.charAt(0) <= 'z')) {
            System.out.println("Sifrenizin ilk harfi kücük harf olmalı ");
            flag++;
        }
        if(!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmalı.");
            flag++;
        }
        if(sifre.contains(" ")){
            System.out.println("Sifrede bosluk olmamalı");
            flag++;
        }
        if(!(sifre.length()>=10)){
            System.out.println("Sifre en az 10 karakter olmalı.");
            flag++;
        }
        if(flag==0){
            System.out.println("Sifreniz basarıyla kayıt edilmiştir.");
        }

    }
}
