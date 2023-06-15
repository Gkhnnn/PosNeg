package StringClasses;

import java.util.Arrays;

public class C03_StringCharAt {
    public static void main(String[] args) {
        String input = "Eurotech Study";
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i)+" ");

        }
        System.out.println();
        String [] str = input.split("");
        for (String each :str) {
            System.out.print(each+" ");
        }
    }
}
