package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
        List<String> str=new ArrayList<String>();

        str.add("Cyhun");
        str.add("Yaldiz");
        str.add("Mustafa");
        str.add("Tugba");
        str.add("Muhammed");
        str.add("Muhmmed");

        System.out.println(str);
        str = sil(str,"a");
        System.out.println(str);


    }
    public static List<String> sil(List<String> str, String silenecekHarf){
        for (int i = str.size()-1; i >=0; i--) {
             if(str.get(i).contains(silenecekHarf)){ // objectlerde contains methodu ile aramak istediğimiz elemanın List de olup olmadıgına bakıyoruz.
                 str.remove(i);
             }
        }
        return str;
    }
}
