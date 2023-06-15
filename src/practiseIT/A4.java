package practiseIT;

public class A4 {
    public static final int R = 3;

    public static void main(String[] args){

            System.out.print("+");
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= R; j++)
                    System.out.print("=");
                System.out.print("+");
            }
            System.out.println();
            for (int k = 1; k <= R; k++) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print("|");
                    for (int j = 1; j <= R; j++)
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.print("+");
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= R; j++)
                    System.out.print("=");
                System.out.print("+");
            }
            window();
        }

        public static void window() {
            System.out.println();
            for(int k = 1; k <= R; k++) {
                for(int i = 1; i <= 3; i++) {
                    System.out.print("|");
                    for(int j = 1; j <= R; j++)
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.print("+");
            for(int i = 1; i <= 2; i++) {
                for(int j = 1; j <= R; j++)
                    System.out.print("=");
                System.out.print("+");
            }
        }

}