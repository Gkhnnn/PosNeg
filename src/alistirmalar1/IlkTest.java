package alistirmalar1;

public class IlkTest {
    public static void main(String[] args) {
        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf = input.indexOf("of");
        int results = input.indexOf("results");

        String sonucSayisiString =input.substring(indexOf+3,results-1);

        int sonucSayisiİnt= Integer.parseInt(sonucSayisiString);

        if(sonucSayisiİnt>50){
            System.out.println("\"NUTELLA\" arama sonucumuz PASSED");
        }else{
            System.out.println("\"NUTELLA\" arama sonucumuz FAİLED");
        }
    }
}
