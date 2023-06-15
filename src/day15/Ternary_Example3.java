package day15;

import java.util.Scanner;

public class Ternary_Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double puan = scan.nextDouble();

        System.out.println(puan>=50 ? "Sinifi gectiniz" : "Maalesef kaldin");
    }
}
