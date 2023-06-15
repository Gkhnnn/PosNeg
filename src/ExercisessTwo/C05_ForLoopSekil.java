package ExercisessTwo;

public class C05_ForLoopSekil {
    public static void main(String[] args) {
        int sembol = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < sembol; j++) {
                System.out.print("*");
            }
            System.out.println();
            sembol++;
        }
        System.out.println("---------------------------------------------");
        int sekil = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < sekil; j++) {
                System.out.print("*");
            }
            System.out.println();
            sekil--;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j >10  ; j++) {

            }
        }
        for (int j = 0; j >10 ; j++) {
            System.out.print("*");
            System.out.print("");
        }
        System.out.println();


        System.out.println("---------------------------------");
        for (int i = 0; i > 10; i++) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");

            for (int k = 0; k < i ; k++) {
                System.out.println("*");
            }
            }

        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for (int i = 0; i <= 10 ; i++) {
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
