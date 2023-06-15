package alistirmalar1;

public class B03_Faktoryel {
    public static void main(String[] args) {
       int input = 15;
       if(input>0&&input<15){
           faktoryel(input);
       }else{
           System.out.println("Girilen sayı 15 den kücük olmalı.");
       }

    }
    public static void faktoryel(int sayi){
        int faktoryelSonucu= 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelSonucu*=i;
        }
        System.out.println("verilen sayının faktoryeli "+ faktoryelSonucu+ "'dur.");

    }


}