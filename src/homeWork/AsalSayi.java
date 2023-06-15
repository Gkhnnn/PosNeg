package homeWork;

public class AsalSayi {
    public static void main(String[] args) {


        int sayi = 100;
        int sayac = 0;
        do {
            sayac = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(sayi + " asal bir sayidir.");
            }
            sayi--;

        } while (sayi > 2);

        System.out.println("---------------------------------------------------");


    }
}
