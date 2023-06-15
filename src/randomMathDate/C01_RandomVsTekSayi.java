package randomMathDate;

import java.util.Random;

public class C01_RandomVsTekSayi {
    public static void main(String[] args) {
        Random random = new Random();
        int tekSayiBul = random.nextInt(50, 100);
        System.out.println("tekCiftSayiBul(tekSayiBul) = " + tekCiftSayiBul(tekSayiBul));

    }

    public static int tekCiftSayiBul(int tekSayiBul) {

        while (true) {
            if (!(tekSayiBul % 2 == 0)) {
                return tekSayiBul;

            } else {
                return tekSayiBul + 1;
            }

        }

    }
}