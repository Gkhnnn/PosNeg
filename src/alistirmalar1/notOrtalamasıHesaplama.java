package alistirmalar1;

import java.util.Scanner;

public class notOrtalamasıHesaplama {
    public static void main(String[] args) {

        double sonuc = notOrtalama(75, 65, 89);
        System.out.println("sonuc = " + sonuc);

    }

    public static double notOrtalama(double Quiz, double Vize, double Final) {
        double quizOrtalama = Quiz*0.2;
        double vizeortalama = Vize*0.4;
        double ortalamaFinal = Final*.4;
        return quizOrtalama+vizeortalama+ortalamaFinal;

    }
}
