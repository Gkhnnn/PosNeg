package alistirmalar1;

import java.util.Random;

public class oddNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int odd = rnd.nextInt(50,99);
            if(odd%2!=0){
                System.out.println("The odd numbers are "+odd);
            }

        }
        System.out.println("**********************");
        for (int i = 0; i < 10; i++) {
            int even = rnd.nextInt(50,99);
            if(even%2==0){
                System.out.println("The even numbers are " +even);
            }

        }
    }
}
