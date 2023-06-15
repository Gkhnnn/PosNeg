package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ArrayListForEachSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif tamsayı giriniz: ");
        int input = scan.nextInt();
        if (input <= 0) {
            System.out.println("Gecersiz sayi!!");
        } else {
            List<Integer> bolenler = tamBol(input);
            System.out.println("bolenler = " + bolenler);
        }


    }

    public static List<Integer> tamBol(int input) {

        List<Integer> tamBolenlerList = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                tamBolenlerList.add(i);
            }

        }
        return tamBolenlerList;


    }

}
