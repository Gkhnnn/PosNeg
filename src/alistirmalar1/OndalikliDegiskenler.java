package alistirmalar1;

public class OndalikliDegiskenler {
    public static void main(String[] args) {
        // float ve double ondalıklı degiskenlerdir.
        float x= 10.2f;
        System.out.println("x = " + x);
        x=30.5f; // bir sayıya tekrar ataama yapılabilir ama tekrar dekelere edilemez.
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        double d= 23.9;
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        double d1= d;
        System.out.println("d1 = " + d1);

    }
}
