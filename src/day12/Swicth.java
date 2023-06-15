package day12;

import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz ");
        int gunNo = scan.nextInt();


        switch (gunNo) {


            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("gun yok");
        }
    }
}