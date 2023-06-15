package alistirmalar2;

import java.util.Scanner;

public class C02_codingbat {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz :");
        String str = scan.nextLine();

        if(str.length()==2){
            System.out.println(str+str.charAt(0));
        }else if(str.length()==1){
            System.out.println(str+str.charAt(0)+str.charAt(0));
        }else if(str.length()>=3){
            System.out.println(str.substring(0,3)+str.substring(0,3)+str.substring(0,3));
        }
    }
}
