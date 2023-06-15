package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_ArrayListSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String girilenCumle = scan.nextLine();
        System.out.println("Lütfen bir harf giriniz: ");
        String istenenHArf = scan.next();

        String [] cumleArry = girilenCumle.split("");
        List<String> list1 = new ArrayList<>();
        int sayac = 0;
        for (String each:cumleArry) {
            list1.add(each);
        }

        for (String each:list1) {
            if(each.equals(istenenHArf)){
                sayac++;
            }

        }
        System.out.println(girilenCumle+ "'da " + istenenHArf + "'" +sayac+" kere kulanılmıstır.");
    }
}
