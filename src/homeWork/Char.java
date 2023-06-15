package homeWork;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char harf = scan.next().charAt(0);

        System.out.println((char) (++harf) + "," + (char) (++harf) + "," + (char) (++harf));


        String str = "345";
        String str1= "123";

        int strint= Integer.parseInt(str);
        int str1int = Integer.parseInt(str);

        System.out.println(strint+str1int);

    }
}
