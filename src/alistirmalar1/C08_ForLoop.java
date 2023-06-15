package alistirmalar1;

public class C08_ForLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <1000 ; i++) {
            System.out.print(i + " ");
            total+=i;

        }
        System.out.println();
        System.out.println("Sayıların toplamı =" + total);
    }
}
