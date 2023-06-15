package day6;

public class Aritmetikoperatorler2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = b - a;
        System.out.println("c = " + c);
        double d = 30.50;
        System.out.println(d - a);
        System.out.println(a - d);

        int c1 = a * b;
        System.out.println("c1 = " + c1);
        System.out.println("a*b*c = " + a * b * c);
        // parantez içi ardından çarpma, bölme,modulus,toplama ve cıkarma.
        // olarak aritmetik operatorlerin işlem önceliği vardır.
        


    }
}
