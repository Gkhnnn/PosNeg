package homeWork;

import java.util.Scanner;

public class C01_IsimVeSoyisim_B7 {
    public static void main(String[] args) {
        nameLastname();
    }

    public static void nameLastname() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen isim ve soyisminizi giriniz: ");
        String nameLastname = sc.nextLine();
        int karakterSayisi = nameLastname.length();
        System.out.println("karakterSayisi = " + karakterSayisi);

    }

}

