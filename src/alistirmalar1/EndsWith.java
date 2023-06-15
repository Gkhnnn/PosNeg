package alistirmalar1;

public class EndsWith {
    public static void main(String[] args) {

        String str = "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));// true
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));// true
        System.out.println(str.endsWith(""));// true

    }
}
