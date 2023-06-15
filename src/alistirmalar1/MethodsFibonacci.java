package alistirmalar1;

public class MethodsFibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
         int fibonacciSayisi =  fibonacci(3);
        System.out.println("fibonacciSayisi = " + fibonacciSayisi);
    }
}
