package alistirmalar2;

import java.util.Scanner;

public class C01_Codingbat {
    public static void main(String[] args) {
        String input= "madam";
       if(input.length()==0){
           System.out.println(input);
        }
       String yeni = (input.substring(1, input.length()-1));
        System.out.println(input.charAt(input.length()-1)+ yeni+ input.charAt(0));
       }
    }

