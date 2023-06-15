package StringClasses;

import java.util.Scanner;

public class C02_StringScannerLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz= ");
        String input = scan.nextLine();
        System.out.println("input.length() = " + input.length());

    }
}
