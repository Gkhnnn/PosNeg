package alistirmalar1;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char ilkHarf = scan.next().charAt(0);

        if(ilkHarf=='O'||ilkHarf=='o') System.out.println("Ocak");
        if(ilkHarf=='S'||ilkHarf=='s') System.out.println("Subat");
        if(ilkHarf=='M'||ilkHarf=='m') System.out.println("Mart veya Mayıs");
        if(ilkHarf=='N'||ilkHarf=='n') System.out.println("Nisan");
        if(ilkHarf=='H'||ilkHarf=='h') System.out.println("Haziran");
        if(ilkHarf=='T'||ilkHarf=='t') System.out.println("Temmuz");
        if(ilkHarf=='A'||ilkHarf=='a') System.out.println("Agustos veya Aralık");
        if(ilkHarf=='E'||ilkHarf=='e') System.out.println("Eylül veya Ekim");
        if(ilkHarf=='K'||ilkHarf=='k') System.out.println("Kasım");



    }
}
