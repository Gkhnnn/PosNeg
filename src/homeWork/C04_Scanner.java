package homeWork;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazın");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi yazın");
        String soyİsim = scan.next();
        System.out.println("lütfen yasınızı yazın");
        int yas = scan.nextInt();
        System.out.println("Girilen bilgiler " + isim.charAt(0) + " " + soyİsim + ", " + yas);

    }
}
