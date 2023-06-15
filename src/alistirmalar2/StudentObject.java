package alistirmalar2;

public class StudentObject {
    public static void main(String[] args) {
        student ogrenci = new student();
        ogrenci.name = "Ali";
        ogrenci.surname = "Can";
        ogrenci.age = 12;
        ogrenci.weight = 65;
        ogrenci.okulAdı = "Yunus Emre Okulu";
        ogrenci.className = "11 Fen Sube";
        ogrenci.sinifKodu = 'A';
        ogrenci.schoolNumber = 155;
        ogrenci.ders = "Java";
        ogrenci.dersNotu = 75;
        ogrenci.devamsızlık = 12;

        System.out.println(ogrenci.name);
        System.out.println(ogrenci.surname);
        System.out.println(ogrenci.age);
        System.out.println(ogrenci.className);
        System.out.println(ogrenci.sinifKodu);
        System.out.println(ogrenci.schoolNumber);
        System.out.println(ogrenci.weight);
        System.out.println(ogrenci.ders);
        System.out.println(ogrenci.dersNotu);
        System.out.println(ogrenci.devamsızlık);

        System.out.println(ogrenci.notOrtalaması(75, 65));
        System.out.println(ogrenci.devamsizlik(17));

        System.out.println("*******************************************************************");

        student ogrenci1 = new student();
        ogrenci1.name = "Canberk";
        ogrenci1.surname = "Kaya";
        ogrenci1.age = 14;
        ogrenci1.weight = 78;
        ogrenci1.okulAdı = "Mükremin Lisesi";
        ogrenci1.className = "Matematik Bölümü";
        ogrenci1.sinifKodu = 'B';
        ogrenci1.schoolNumber = 123456;
        ogrenci1.ders = "Matematik";
        ogrenci1.dersNotu = 98;
        ogrenci1.devamsızlık = 23;
        System.out.println(ogrenci1.name);
        System.out.println(ogrenci1.surname);
        System.out.println(ogrenci1.age);
        System.out.println(ogrenci1.weight);
        System.out.println(ogrenci1.okulAdı);
        System.out.println(ogrenci1.className);
        System.out.println(ogrenci1.sinifKodu);
        System.out.println(ogrenci1.schoolNumber);
        System.out.println(ogrenci1.ders);
        System.out.println(ogrenci1.dersNotu);
        System.out.println(ogrenci1.devamsızlık);
        System.out.println(ogrenci1.notOrtalaması(98, 97.5));
        ogrenci1.devamsizlik(23);


    }
}
