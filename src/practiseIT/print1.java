package practiseIT;

public class print1 {
    public static void main(String[] args) {

        int min = 1;
        int max = 5;
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = min; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
