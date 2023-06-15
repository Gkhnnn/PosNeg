package alistirmalar1;

public class A03_AsalSayi {
    public static void main(String[] args) {
        int input= 4737;
        String sonuc = input + " asal sayıdır.";
        for (int i = 2; i <input ; i++) {
            if(input%i==0){
                sonuc= input + " asal sayı degildir.";// burada java kendisinden once gelen karakter primitive bir data typr olsa dahi
                break;                                  // kendisinden sonra gelen string ifadeyle concation olusturur.
                                                            // ve ifadenin hepsi string olur.

            }
        }
        System.out.println(sonuc);
    }
}
