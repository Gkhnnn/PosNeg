package alistirmalar1;

import java.util.Scanner;

public class Leap_year_calculation {
    public static void main(String[] args) {
      String sonuc= artıkYil(1990);
        System.out.println("sonuc = " + sonuc);


    }
    public static String artıkYil(int dogumYili){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lüfen Dogum Yılınızı Giriniz : ");
        int yil = scan.nextInt();
        if(yil%4==0){
            return "Girilen yıl artık yıldır : " + yil;
            }if(yil%400==0){
            return "Girilen yıl artık yıldır : " + yil;
        }else{
            return "Girdiginiz yıl artık yıl degildir.";
        }

    }
}
