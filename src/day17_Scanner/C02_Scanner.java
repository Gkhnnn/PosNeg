package day17_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan dairenin yarıcapını alıp, alanını hesaplayın
        // ve yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıcapını giriniz.");
        double yaricap= scan.nextDouble();


        // lalnını hesaplayın ve yazdırın.

        double daireninAlani = 3.14* yaricap*yaricap;
        System.out.println("daireninAlani = " + daireninAlani);



    }
}
