package alistirmalar1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B04_HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1. sayiyi giriniz :");
        int number1 = scan.nextInt();
        System.out.print("Lütfen 2. sayiyi giriniz :");
        int number2 = scan.nextInt();

        String menu = "1-Carpma İslami\n" +
                "2-Bölme İslemi\n" +
                "3-Toplama İslemi\n" +
                "4-Cıkarma İslemi";
        System.out.println(menu);
        System.out.print("Lütfen Yapmak istediginiz İslemi Seciniz :");

        int select = scan.nextInt();
        switch (select){
            case 1 :
                Carpma(number1,number2);
                break;
            case 2 :
                Bolme(number1,number2);
                break;
            case 3:
                Toplama(number1, number2);
                break;
            case 4:
                Cikarma(number1,number2);
                break;
        }

    }
    public static int Carpma(int number1, int number2){
        int result = number1*number2;
        System.out.println(result);
        return result;

    }
    public static int Bolme(int number1 , int number2){
        if (number2 != 0) {
            int result = number1/ number2;
            System.out.println(result);
            return result;
        }else{
            System.out.println("number2 sıfırdan buyuk olmalı.");
            return 0;
        }


    }
    public static int Toplama(int number1, int number2){
        int result = number1+number2;
        System.out.println(result);
        return result;
    }
    public static int Cikarma(int number1, int number2){
        int result = number1-number2;
        System.out.println(result);
        return result;
    }
}
