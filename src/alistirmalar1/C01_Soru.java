package alistirmalar1;

import java.util.Scanner;

public class C01_Soru {
    public static void main(String[] args) {

        String girilenCumle1 = "evden calısıyorum, is için sirkete gitmeye gerek yok";
        String girilenCumle = girilenCumle1.toLowerCase();

        if(girilenCumle.contains("ev")&&girilenCumle.contains("is")){
            System.out.println("Hem ev lazım hem de is");
        }else if(girilenCumle.contains("is")){
            System.out.println("Calısmak güzeldir.");
        }else{
            System.out.println("cok calısman lazım");
        }
    }
}
