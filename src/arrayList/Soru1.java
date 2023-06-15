package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
        // burada belirtilen sayı kadar fibo sayılarını store eden bir List oluşturma işlemi yapıyoruz....
        int max = 100;
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        int sayi = 0;


        while (sayi < max) {
            sayi = fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2);
            if (sayi >= max) {
                break;
            }
            fibo.add(sayi);
        }
        System.out.println(fibo);
/*
        for (int i =0; i < max ; i++) {
            sayi = fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2);
            if(sayi>=max){
                break;
            }
            fibo.add(sayi);
        }
        System.out.println(fibo);


 */


    }
}

