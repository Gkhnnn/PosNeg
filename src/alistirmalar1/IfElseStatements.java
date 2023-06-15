package alistirmalar1;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter yazınız.");
        char harf = scan.next().charAt(0);

        if(harf>='a'&&harf<='z'){
            //System.out.println((char)(harf-32));
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }
    }
}
