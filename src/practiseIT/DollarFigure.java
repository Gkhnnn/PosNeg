package practiseIT;

public class DollarFigure {
    public static final int size = 5;
    public static void main(String[] args) {
        /*Write a Java program called DollarFigure that produces the following output. Use nested for loops to capture the structure of the figure.
        $$$$$$$**************$$$$$$$
        **$$$$$$************$$$$$$**
        ****$$$$$**********$$$$$****
        ******$$$$********$$$$******
        ********$$$******$$$********
        **********$$****$$**********
        ************$**$************
*/
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= 2*i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size-i; j++) {
                System.out.print("$");
            }
            for (int j = 1; j <= 2*size-2*i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size-i; j++) {
                System.out.print("$");
            }
            for (int j = 1; j <=2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
