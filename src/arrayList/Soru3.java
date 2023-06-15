package arrayList;

import java.util.*;

public class Soru3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

       // Random rnd = new Random();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            // int sayi = rnd.nextInt(100); bu şekilde de sayı ekleme yapılabilir.
            list.add((int) (Math.random() * 10 + 1));

            if (list.get(i) < 5 ){
                // System.out.println("20'den küçük olan sayılar = "+list.get(i));
                list.remove(i);
                i--; // burada List'in eleman sayısı azaltılmazsa IndexOutOfBoundsException hatası alırız.
                // Bu RuntimeException hatasıdir. yani run edildikten sonra ortaya çıkan bir hatadır....
                count++;
            }
        }
        System.out.println(count);

        Collections.sort(list);
        if(count==0){
            System.out.println("90'den küçük eleman yoktur.");
        }

        System.out.println();
        System.out.println(list);

    }
}
