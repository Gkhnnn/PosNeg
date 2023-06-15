package alistirmalar1;

import java.util.Scanner;

public class IfStatementÖgrenciNotu {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notu giriniz.");
        double girilenNot= scan.nextDouble();

        if(girilenNot>=85){
            System.out.println("Notunuzun Harf Karşılıgı AA");
        }else if(girilenNot>=65){
            System.out.println("Notunuzun Harf Karşılıgı BB");
        } else if (girilenNot>=50) {
            System.out.println("Notunuzun Harf Karşılığı CC");

        } else if (girilenNot<50) {
            System.out.println("Notunuzun Harf Karşılığı DD");

        } else if (girilenNot<0||girilenNot>100) {
            System.out.println("Gcersiz not aralıgı tekrar kontrol edeniz.");

        }
    }
}
