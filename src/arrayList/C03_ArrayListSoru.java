package arrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ArrayListSoru {
    public static void main(String[] args) {
        List<String> verilenListe = C01_ArrayListSoru.isimListesiEkle();
        List<String> liste = elementSil(verilenListe);
        System.out.println(liste);
    }

    public static List<String> elementSil(List<String> verilenListe) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen istenmeyen harfi giriniz: ");
        String istenmeyenHarf = scan.next().substring(0, 1);
        List<String> yeniListe = new ArrayList<>();


        for (int i = 0; i < verilenListe.size(); i++) {
            if (!verilenListe.get(i).contains(istenmeyenHarf)) {
                yeniListe.add(verilenListe.get(i));
            }

        }

        return yeniListe;
    }
}
