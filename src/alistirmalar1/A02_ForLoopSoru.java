package alistirmalar1;

public class A02_ForLoopSoru {
    public static void main(String[] args) {
        String input = "Java candir, Selenium heyecandir";

        for (int i = 0; i <input.length() ; i++) {
            System.out.print(i%2==0 ? input.substring(i,i+1).toUpperCase(): input.substring(i,i+1).toLowerCase());

        }

    }
}
