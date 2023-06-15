package day15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ternary_Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(girilenSayi%5==0 ? "Sayi 5'in tam kati" : "5'in tam kati degil");

    }
}
