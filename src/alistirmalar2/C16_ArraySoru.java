package alistirmalar2;

public class C16_ArraySoru {
    public static void main(String[] args) {
        double [] fiyatlar = {23,34.5,42.1,5.7,13.4,123.5};
        maxAndMin(fiyatlar);
    }
    public static void maxAndMin(double[]fiyatlar){
        double max = fiyatlar[0];
        double min = fiyatlar[0];
        for (int i = 0; i < fiyatlar.length; i++) {
            if(fiyatlar[i]<min){
                min=fiyatlar[i];
            }
            if (fiyatlar[i]>max) {
                max = fiyatlar[i];

            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
