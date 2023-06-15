package alistirmalar1;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str = "Ja1va 56Guz, zel-dir.";
        str =str.replace("1" ,"");
        str = str.replace("56", "");
        str = str.replace(", z", "");
        str = str.replace("-", "");
        System.out.println(str);
    }
}
