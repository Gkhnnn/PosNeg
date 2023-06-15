package alistirmalar1;

public class C01_replace {
    public static void main(String[] args) {
        String sonuc = "1-16 of over 100,000 results for \"apple\"";
        int indexover = sonuc.indexOf("over");
        int indexresults = sonuc.indexOf("results");

        String sonucSayısı = sonuc.substring(indexover+5,indexresults-1);
        sonucSayısı=sonucSayısı.replace("," , "");

        int sonucSayısıint= Integer.parseInt(sonucSayısı);

        if(sonucSayısıint>10000){
            System.out.println("Arama 10000' den buyuktur.");
        }else {
            System.out.println("Arama sayısı 10000' den kucuktur.");
        }

    }
}
