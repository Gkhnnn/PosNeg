package alistirmalar1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class A04_ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir baslangıc degerini giriniz :");
        int baslangıc = scan.nextInt();
        System.out.println("Lütfen pozitif bir bitis degeri giriniz :");
        int bitis = scan.nextInt();
        if (bitis < baslangıc) {
            System.out.println("Uyarı");

        } else {
            int toplam = 0;
            for (int i = baslangıc; i <= bitis; i++) {
                toplam += i;
                System.out.println(i);
            }
            System.out.println("toplam = " + toplam);

            



        }
    }
}
