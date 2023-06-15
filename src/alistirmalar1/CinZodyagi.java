package alistirmalar1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int zodyag = dogumYili(1990);
        dogumYili(1985);
        System.out.println("zodyag = " + zodyag);
    }

    public static int dogumYili(int dogumYili) {
        int sonuc = dogumYili % 12;
        switch (sonuc) {
            case 0:
                System.out.println("Maymun");
                break;
            case 1 :
                System.out.println("Horuz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavsan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Uyusan bir deger yoktur.");


        }
        return sonuc;
    }
}
