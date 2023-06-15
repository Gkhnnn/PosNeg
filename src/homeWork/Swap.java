package homeWork;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi1'i giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen sayi2'yi giriniz");
        int sayi2 = scan.nextInt();

        sayi1 = sayi1+sayi2;
        sayi2 =sayi1-sayi2;
        sayi1 =sayi1-sayi2;


        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}
