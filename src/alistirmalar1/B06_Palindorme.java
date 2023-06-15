package alistirmalar1;

public class B06_Palindorme {
    public static void main(String[] args) {

        String str = "ada";
        String tersStr = B05_TerseCevirme.metniTerseCevir(str);

        if(str.equals(tersStr)){
            System.out.println("Verilen metin palindormedir. ");
        }else {
            System.out.println("Verilen metin pslindorme degildir.");
        }
    }
}
