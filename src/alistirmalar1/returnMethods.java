package alistirmalar1;

public class returnMethods {
    /*
    Input olarak verilen isim ve soyismi
    ilk harf buyk, diger harfler kucuk olarak degistirip programın
    sonraki bölümlerinden kullanılabilmek uzere isimSoyisim varialbe 'ına  atayacak bir methods olusturun
    input -isim : ALI, Soyisim :CAN
    Output : isimSoyisim : Ali Can seklinde kayit
     */
    public static void main(String[] args) {
        String isim = "BULENT";
        String soyisim = "YILMAZ";

        String isimSoyisim = isimDuzenle(isim, soyisim);

        System.out.println("İlk girilen isim Soyisim : "+ isim + " " + soyisim);

        System.out.println(isimSoyisim);
    }

    public static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase();

        String duzenlenmisSoyisim = soyisim.substring(0, 1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        String isimSoyisim = isimDuzenlenmis + " " +duzenlenmisSoyisim;

        return isimSoyisim;


    }
}
