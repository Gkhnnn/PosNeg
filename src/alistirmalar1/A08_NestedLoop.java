package alistirmalar1;

public class A08_NestedLoop {
    public static void main(String[] args) {
        int kısaKenaar=5;
        int uzunKenar=8;
        for (int i = 1; i <= kısaKenaar; i++) {
            for (int j = 1; j <= uzunKenar; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}