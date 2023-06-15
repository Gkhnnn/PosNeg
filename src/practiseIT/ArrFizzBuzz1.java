package practiseIT;

import java.util.Arrays;
import java.util.Scanner;

public class ArrFizzBuzz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen başlangıc degeri giriniz: ");
        int start = scan.nextInt();
        System.out.print("Lütfen bitiş degeri giriniz: ");
        int end = scan.nextInt();
        String[] arr = new String[end - start];
        for (int i = 0; i < arr.length; i++) {
            int temp = i + start;
            if (temp % 3 == 0 && temp % 5 == 0) {
                arr[i] = "FizzBuzz";
            } else if (temp % 5 == 0) {
                arr[i] = "Buzz";
            } else if (temp % 3 == 0) {
                arr[i] = "Fizz";
            } else {
                arr[i] = String.valueOf(temp);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
