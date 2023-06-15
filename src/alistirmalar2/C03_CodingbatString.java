package alistirmalar2;

public class C03_CodingbatString {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.length());
        String yeniStr =str.substring(str.length() - 1);
        String kelime = yeniStr+str.concat(yeniStr);
        System.out.println(kelime);

    }
}
