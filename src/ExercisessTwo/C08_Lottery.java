package ExercisessTwo;

import java.util.Random;
import java.util.Scanner;

public class C08_Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen iki rakamlı tahmın sayınızı giriniz = ");
        String sayi = scan.nextLine();
        Random rnd = new Random();
        int number = rnd.nextInt(10, 99);
        String str = String.valueOf(number);

        if (sayi.equals(str)) {
            System.out.println("Tahmininiz tamamen eslesti. Ödülünüz $10.000 dolardır.");
        } else if (sayi.charAt(0) == str.charAt(0) || sayi.charAt(0) == str.charAt(1)||sayi.charAt(1) == str.charAt(0) || sayi.charAt(1) == str.charAt(1)) {
            System.out.println("Tahmin sayınız Lottery sayısının tek rakamıyla esleşti. Ödülünüz $1.000 dolardır.");
        } else if (sayi.charAt(0) == str.charAt(1) && sayi.charAt(1) == str.charAt(0)) {
            System.out.println("Tahmin sayınız Lottery sayısının rakamlarının yerleri degişmiş olarak check oldu. Ödülünüz $3.000 dolardır.");
        } else {
            if (sayi != str) {
                System.out.println("Tahmininiz tutmadı. Ödülünüz $0.0 dolardır.");
            }
        }
    }
}