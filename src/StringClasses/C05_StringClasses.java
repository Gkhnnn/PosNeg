package StringClasses;

import java.util.Scanner;

public class C05_StringClasses {
    public static void main(String[] args) {
        kacTekrar();
    }

    public static void kacTekrar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz= ");
        String input = scan.nextLine();
        String str = "a";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
           if(input.charAt(i)==str.charAt(0)){
               counter++;
           }
        }
        System.out.println(counter);
    }
}
