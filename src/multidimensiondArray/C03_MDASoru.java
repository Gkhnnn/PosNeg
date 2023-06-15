package multidimensiondArray;

import java.util.Arrays;

public class C03_MDASoru {
    public static void main(String[] args) {
        String[][] arrry = {{"Ali", "Zafer"}, {"Betül", "Hüseyin", "Hasan"}, {"Said"}};
        String arananMetin = "a";
        elemanYaz(arrry, arananMetin);

    }

    public static void elemanYaz(String[][] arry, String arananMetin) {

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {

                if (arry[i][j].contains(arananMetin)) {
                    System.out.print(arry[i][j] + "  ");
                }
            }

        }
        System.out.println();
    }
}
