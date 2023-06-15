package practiseIT;

public class StarFigure {
    public static final int size = 4;

    public static void main(String[] args) {
        /*
         * Write a program in a class named StarFigure that produces the following output using for loops.
         *
         * ////////////////\\\\\\\\\\\\\\\\
         * ////////////********\\\\\\\\\\\\
         * ////////****************\\\\\\\\
         * ////************************\\\\
         * ********************************
         */
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < (4 * size) - 4 * i; j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= 8 * i - 8; k++) {
                System.out.print("*");
            }
            for (int j = 1; j < (4 * size) - 4 * i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
