package homeWork;


public class Fibonacci {
    public static void main(String[] args) {

        int number = 100;
        int a = 0;
        int b = 1;
        for (int i = 1; i < number; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
    }
}
