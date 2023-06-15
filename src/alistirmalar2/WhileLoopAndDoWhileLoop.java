package alistirmalar2;

import java.util.Scanner;

public class WhileLoopAndDoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi =1 ;
        int total =0;

        while(sayi!=0){
            System.out.println("Lütfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            total += sayi;


        }
        System.out.println("Girilen sayıların toplamı :" + total);
    }
}
