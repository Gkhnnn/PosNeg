package day15;

import java.util.Scanner;

public class NestedTernaryExample_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz.");
        int a = scan.nextInt();

        System.out.println(a > 0 ? a % 2 == 0 ? "çift sayı" : "çift sayı degil" : a<-100 && a > -1000 ? "sayı üc basamaklı" : "sayı üc basamaklı degil");
    }
}
