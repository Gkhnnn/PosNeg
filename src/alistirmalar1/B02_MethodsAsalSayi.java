package alistirmalar1;

public class B02_MethodsAsalSayi {
    public static void main(String[] args) {
        boolean total = asalSayi(51);
        boolean total1 = asalSayi(127);
        System.out.println(total);
        System.out.println(total1);

    }

    public static boolean asalSayi(int number) {
        boolean sonuc = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }
}