package alistirmalar2;

public class C13_ArraySoru {
    public static void main(String[] args) {
        // verilen bir array deki pozitif tamsayıları yazdıran bir method oluturun
        int [] sayi ={1,-4,-6,7,-9};
        System.out.println(arrayToplam(sayi));

    }

    public static int arrayToplam(int[] sayi) {
        int total = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > 0) {
                total += sayi[i];
            }

        }
        return total;
    }
}
