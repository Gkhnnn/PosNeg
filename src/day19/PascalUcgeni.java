package day19;

public class PascalUcgeni {
    public static void main(String[] args) {
        int number = 1;
        int bosluk = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= bosluk; j++) {
                System.out.print(" ");

            }
            number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);

            }
            bosluk--;
            System.out.println();
        }
    }
}
