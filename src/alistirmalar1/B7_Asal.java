package alistirmalar1;

public class B7_Asal {
    public static void main(String[] args) {

        //asalSayilar(10);
//        System.out.println(tekSayiDegerlendirme(8));
//        System.out.println(tekSayiDegerlendirme(5));
        asalSayilar1(10);
    }

    static void asalSayilar(int adet) {
        boolean asalSayiMi = true;
        int son = 3;
        int sayac = 0;
        for (int i = 2; i < son; i++) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    asalSayiMi = false;
                }
            }
            if (asalSayiMi) {
                System.out.println(i + " asal sayidir");
                sayac++;
            }
            if (adet == sayac) {
                break;
            }
            asalSayiMi = true;
            son++;
        }
    }

    static void asalSayilar1(int adet) {
        int son = 3;
        int sayac = 0;
        for (int i = 2; i < son; i++) {
            if (tekSayiDegerlendirme(i)) {
                System.out.println(i + " asal sayidir");
                sayac++;
            }
            if (adet == sayac) {
                break;
            }
            son++;
        }
    }

    static boolean tekSayiDegerlendirme(int sayi) {
        boolean asalSayiMi = true;
        for (int n = 2; n < sayi; n++) {
            if (sayi % n == 0) {
                asalSayiMi = false;
                break;
            }
        }
        return asalSayiMi;
    }
}
