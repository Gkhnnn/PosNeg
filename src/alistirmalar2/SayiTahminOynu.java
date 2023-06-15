package alistirmalar2;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOynu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd =new Random();
        System.out.println("Sayı Tahmin Oynuna Hosgeldiniz");
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz :");
        int input = scan.nextInt();
        int sayi = rnd.nextInt(101);
        int total = 0;
        while (input!=sayi){

            if(input<0||sayi>100){
                System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");
                total++;
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz :");
                input= scan.nextInt();
            } else if (input<sayi) {
                System.out.println("Daha büyük bir sayı giriniz.");
                total++;
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz :");
                input=scan.nextInt();
            }else{
                System.out.println("Daha kücük bir sayı giriniz.");
                total++;
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz :");
                input = scan.nextInt();
            }
        }
        boolean tekrarSayisi = true;
        if(tekrarSayisi){
            if(total<=3&&total>0){
                System.out.println("woow");
            } else if (total>=4&&total<=8) {
                System.out.println("Aferin");
            }else{
                System.out.println("Basarısız!!!");
            }
        }

        System.out.println("Tekrarlanan deneme sayısı = " +total);


    }
}
