package alistirmalar1;

public class GirilenKelime {
    public static void main(String[] args) {
        String str = "Javayı iyi ogrenmek icin cok calısmam lazım cok";

        int ilkCokIndexi = str.indexOf("cok");
        int sonCOkIndexi = str.lastIndexOf("cok");

        if(!str.contains("cok")){
            System.out.println("cok kelimesi kullanılmamıs");
        }else if (ilkCokIndexi==sonCOkIndexi){
            System.out.println("cok kelimesi bir kere kullanılmıs");
        }else{
            System.out.println("cok kelimesi birden fazla kullanılmıstır.");
        }

    }
}
