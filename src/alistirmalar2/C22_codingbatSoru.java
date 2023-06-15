package alistirmalar2;

public class C22_codingbatSoru {
    public static void main(String[] args) {
        String str = ortayaEkle("[[]]", "ahmet");
        String str1 = ortayaEkle("alim", "veli");
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
    }

    public static String ortayaEkle(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
