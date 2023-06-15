package OopExamaple;

import java.util.Scanner;

public class OgrenciTest {
    public static void main(String[] args) {

        Ogrenci obj = new Ogrenci("gokhan turk", 23, 78, 174, 85, 97, "AA");
        System.out.println(obj.name);
        System.out.println(obj.name());
        System.out.println(obj.mathScores);
        System.out.println(obj.fenScores);
        System.out.println(Ogrenci.ogrenciSayisi);
        Ogrenci obj1 = new Ogrenci("ahmet can ",34,79,189,56,67,"DD");
        System.out.println(Ogrenci.ogrenciSayisi);
        System.out.println(obj1.mathScores);
        System.out.println(obj1.fenScores);
    }
}
