package alistirmalar1;

public class B7_AsalSayilar {
    public static void main(String[] args) {
        // 2 3 4 5 6 7
        // 2 3   9
//        boolean asalSayiMi = true;
//        for (int i = 2; i < 100; i++) {
//            for (int n = 2; n < i; n++) {
//                if (i % n == 0) {
//                    asalSayiMi = false;
//                }
//            }
//            if (asalSayiMi) {
//                System.out.println(i + " asal sayidir");
//            }
//            asalSayiMi = true;
//        }
        asalSAyilariYazdir(10, 20);
        asalSAyilariYazdir(30, 50);
    }

    static void asalSAyilariYazdir(int baslangic, int son) {
        // 10 ile 20 arasindaki asal sayilari yazdiriyoruz
        System.out.println(baslangic + " ile " + son + " arasindaki asal sayilari yazdiriyoruz.");
        boolean asalSayiMi = true;
        for (int i = baslangic; i < son; i++) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    asalSayiMi = false;
                }
            }
            if (asalSayiMi) {
                System.out.println(i + " asal sayidir");
            }
            asalSayiMi = true;
        }
    }
}
