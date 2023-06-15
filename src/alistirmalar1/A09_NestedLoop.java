package alistirmalar1;

public class A09_NestedLoop {
    public static void main(String[] args) {
        int input = 8;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
