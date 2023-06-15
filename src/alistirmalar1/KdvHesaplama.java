package alistirmalar1;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String [] args){
        // kdv tutarı hesaplama
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Ürünün Fiyatını Giriniz :");
        double urunTutarı = scan.nextDouble();
        double kdv= 0.18;
        double kdvliTutar= urunTutarı*kdv;
        urunTutarı = urunTutarı +kdvliTutar;
        System.out.println("Kdv dahil tutar = "+ urunTutarı);
    }
}
