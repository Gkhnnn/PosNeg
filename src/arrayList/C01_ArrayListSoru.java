package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayListSoru {
    public static void main(String[] args) {
        List<String> liste = isimListesiEkle();
        System.out.println(liste);

    }

    public static List<String> isimListesiEkle() {
        List<String> isimlistesi = new ArrayList<>();
        String girilenİsim = "";
        Scanner scan = new Scanner(System.in);

        while (!girilenİsim.equalsIgnoreCase("q")) {
            System.out.println("Lütfen listeye eklemek istediğiniz ismi giriniz: \nLütfen çıkmak için \"Q\"veya\"q\"ya basın.");
            girilenİsim = scan.nextLine();
            if (!girilenİsim.equalsIgnoreCase("q")) {
                isimlistesi.add(girilenİsim);
            }
        }
        return isimlistesi;
    }
}
