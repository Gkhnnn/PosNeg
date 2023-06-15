package homeWork;

import java.util.Scanner;

public class İkiTamsayı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı1 giriniz.");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen sayi2'yi giriniz.");
        int sayi2 = scan.nextInt();
        System.out.println("sayıların sonucu =" +(double) sayi1/sayi2);
    }
}
