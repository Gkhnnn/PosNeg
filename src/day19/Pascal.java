package day19;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz ");
        Scanner scan =new Scanner(System.in);
        int no= scan.nextInt();
        int bosluk =no;
        int number =1;
        for (int i = 0; i < no;i++) {
            for (int j = 1; j <=bosluk ; j++) {
                System.out.print(" ");
                
            }
            number =1;
            for (int k = 0; k <=i ; k++) {
                System.out.print(number + " ");
                number = number*(i-k)/(k+1);
                
            }
            bosluk--;
            System.out.println("");
        }
    }
}
