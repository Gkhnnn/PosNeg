package day6;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        b=a+b;
        a=b-a;
        b=b-a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
