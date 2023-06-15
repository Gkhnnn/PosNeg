package alistirmalar2;

import java.util.Scanner;

public class CodingbatNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir dize giriniz :");
        String str = scan.nextLine();
        if(str.contains("not")){
            System.out.println(str);
        }else{
            System.out.println(str +" not");
        }
    }
}
