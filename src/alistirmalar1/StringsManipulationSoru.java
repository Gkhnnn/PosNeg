package alistirmalar1;

import java.util.Scanner;

public class StringsManipulationSoru {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mail'inizi yazın.");
        String mail = scan.nextLine();

        if(!mail.contains("@")){
            System.out.println("Gecersiz mail adresi girdiniz. Lütfen tekrar deneyin.");

        }else if(!mail.contains("@gmail.com")){
            System.out.println("mail'iniz gmail.com olmalı.");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("mail de yazım hatası var.");
        }
    }
}
