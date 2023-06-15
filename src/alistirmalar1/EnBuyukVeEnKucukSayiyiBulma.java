package alistirmalar1;

import java.util.Scanner;

public class EnBuyukVeEnKucukSayiyiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz :");
        int num1 = scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz :");
        int num2 = scan.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz :");
        int num3 = scan.nextInt();
        System.out.println("Lütfen 4. sayıyı giriniz :");
        int num4= scan.nextInt();
        int enBuyukSayi;
        if(num1>num2&&num1>num3&&num1>num4){
            enBuyukSayi=num1;
        }else if(num2>num3&&num2>num4){
            enBuyukSayi=num2;
        }else if(num3>num4){
            enBuyukSayi= num3;
        }else{
            enBuyukSayi= num4;
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
    }
}
