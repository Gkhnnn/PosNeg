package InstanceMethodsVsVariable;

import java.util.Scanner;

public class PenInstanceMethods {
    public void addToInventory(int pen) {
        Pen object = new Pen();
        object.stockAmount=23;
        int total = object.stockAmount+pen;
        System.out.println("total = " + total);

    }
    public void extraction(int pen){
        Pen object = new Pen();
        object.stockAmount = 23;
        int sum = object.stockAmount-pen;
        System.out.println("total = " + sum);
    }

    public void creating() {

        System.out.println("Kalem olusturuldu...");
    }

}
