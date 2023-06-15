package alistirmalar1;

public class AAaaaaaaa {
    public static void main(String[] args) {
        System.out.println("    \\/");
        System.out.println("   \\\\//");
        System.out.println("  \\\\\\///");
        System.out.println("  ///\\\\\\");
        System.out.println("   //\\\\");
        System.out.println("    /\\");


        int total = 25;
        for (int number = 1; number <= (total / 2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        }
    }
}
