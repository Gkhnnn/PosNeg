package alistirmalar1;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 kenar uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if(kenar1==kenar2&&kenar1==kenar3){
            System.out.println("Eskenar ücgen");
        }else if(kenar1!=kenar2&&kenar1==kenar3){
            System.out.println("İkizkenar");
        } else if (kenar1!=kenar2&&kenar1!=kenar3) {
            System.out.println("Çesit kenar ");

        }


    }
}
