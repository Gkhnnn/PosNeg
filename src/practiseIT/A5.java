package practiseIT;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your phrase? ");
        String parhase = scan.nextLine();

        int times = scan.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(parhase);
        }
    }
}
