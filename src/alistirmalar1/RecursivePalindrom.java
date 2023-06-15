package alistirmalar1;

public class RecursivePalindrom {
    public static void main(String[] args) {
        String input = "ey edip adanada pide ye";
        boolean sonuc =palindromuKontrolet(input);
        System.out.println(sonuc);
    }

    public static boolean palindromuKontrolet(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        } else if (input.substring(0, 1).equalsIgnoreCase(input.substring(input.length() - 1))) {
            return palindromuKontrolet(input.substring(1, (input.length() - 1)));
        } else {
            return false;
        }
    }
}
