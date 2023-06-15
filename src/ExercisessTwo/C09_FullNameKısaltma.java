package ExercisessTwo;

import java.util.Arrays;
import java.util.Scanner;

public class C09_FullNameKısaltma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi tam olarak giriniz.");
        String firstName = scan.next();
        String midName = scan.next();
        String lastName = scan.next();
        String name = firstName.toUpperCase().charAt(0)+"."+midName.toUpperCase().charAt(0)+"."+lastName.toUpperCase();
        System.out.println("name = " + name);

        System.out.println("---------------------------------");

    }
}
