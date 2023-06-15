package day10;

public class LogicaloperatorOR {


        public static void main(String[] args) {

            boolean b = (3 >= 7) | (5 <= 9);

        /*
        Expression1       Expression2          Result
            True            True                True
            True            False               True
            False           True                True
            False           False               False
         */

            System.out.println(true | true);
            System.out.println(true | false);
            System.out.println(false | true);
            System.out.println(false | false);

            int i1 = 15;
            int i2 = 10;
            double d1 = 20.5;
            double d2 = 15.8;

            System.out.println((i1 >= i2));
            System.out.println((d1 >= d2));

            // Tekli | operator
            boolean res1 = (i1 >= i2) | (d1 <= d2);
            System.out.println("res1 = " + res1);  // T / F = T

            boolean res2 = (i1 <= i2) | (d1 <= d2); // F / F = F
            System.out.println("res2 = " + res2);

            // Ciftli || Operator
            boolean res3 = (i1 >= i2) || (d1 <= d2);
            System.out.println("res3 = " + res3);  // T / F = T

            boolean res4 = (i1 <= i2) || (d1 <= d2); // F / F = F
            System.out.println("res4 = " + res4);

            System.out.println(true || true); // true
            System.out.println(true || false); // true
            System.out.println(false || true); // true
            System.out.println(false || false); //false

            // Tek operator ile cift operator arasindaki fark
            // Eger operantlardan biri true donuyor ise ikinci veya diger operantlati check etmeden sonucu true olarak donduruyor
            // Tamamen performance ile ilgili
            // Sonuc acisindan hic bir fark yok
        }
    }

