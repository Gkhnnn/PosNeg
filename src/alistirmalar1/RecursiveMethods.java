package alistirmalar1;

public class RecursiveMethods {
    public static void main(String[] args) {
      //  recursiveMethods(2);
        System.out.println(recursiveMethods(2));
    }

  /*  public static int f(int x) {
        int toplam = 0;
        for (int i = 1; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }

   */
        public static int recursiveMethods ( int x){
            if (x == 1) {
                return 1;
            }
            return x + recursiveMethods(x - 1);
        }
    }
