package OopExamaple;

import java.util.Scanner;

public class Ogrenci {
    public String name;
    public int age;
    public int weight;
    public int size;
    public int mathScores;
    public int fenScores;
    public String degree;

    static int ogrenciSayisi = 0;

    public Ogrenci(String name, int age, int weight, int size, int mathScores, int fenScores, String degree) {
        this();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.size = size;
        this.mathScores = mathScores;
        this.fenScores = fenScores;
        this.degree = degree;
    }

    public Ogrenci() {
        String okulADi = "Yunus";
        String adress = "Elbistan";
        ogrenciSayisi++;
    }

    public int courseScore(int fenScores) {
        this.fenScores = fenScores;
        return this.fenScores;
    }

    public int courseScores(int mathScores) {
        this.mathScores = mathScores;
        return this.mathScores;
    }

    public String degree(String degree) {
        this.degree = degree;
        return this.degree;
    }
    public String name (){
        this.name = name;
        if (name.charAt(0) != 'a' || name.charAt(0) != 'z') {
            return  name.replace(name.charAt(0), name.toUpperCase().charAt(0));
        } else {
            return name;
        }
    }
}
