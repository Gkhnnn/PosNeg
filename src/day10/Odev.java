package day10;

import javax.swing.plaf.metal.MetalIconFactory;

public class Odev {
    public static void main(String[] args) {
       /* Odev1 : Bir evin 2 kapisi ve 2 penceresi icin alarm sistemi programi yazın
        Ve verdiginiz degerlere gore alarm sisteminin calisip calismadigini test edin

        Odev2: Verilen 3 tane acidan bir ucgen olusturulup olusturlamayacagini check eden bir program yazınız
        Kural 1: Ucgenin ic acilarinin toplami 180 e esit olmalidir
        Kural 2: Herhangi bir acı 1 den kucuk veya 180 e esit olamaz

                */
        /*boolean Kapi1 = true;
        boolean Kapi2 = false;
        boolean Pencere1 = false;
        boolean Pencere2 = false;
        boolean AlarimCalisirmi = Kapi1 || Kapi2 || Pencere1 || Pencere2;
        System.out.println("AlarimCalisirmi = " + AlarimCalisirmi);


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        int x, y, z;
        x = 56;
        y = 24;
        z = 100;

        boolean AcilarToplami;
        AcilarToplami = (x + y + z) == 180;
        boolean AcilarinBuyukKucuk;
        AcilarinBuyukKucuk = (x >= 1 && x < 180) && (y >= 1 && y < 180) && (z >= 1 && z < 180);
        System.out.println("AcilarinBuyukKucuk = " + AcilarinBuyukKucuk);
        boolean UcgenOlusurMU;
        UcgenOlusurMU = ((AcilarToplami) && (AcilarinBuyukKucuk));
        System.out.println("UcgenOlusurMU = " + UcgenOlusurMU);

         */

        int k1, k2, k3;
        k1 = 12;
        k2 = 97;
        k3 = 71;
        boolean AcilarToplam;
        AcilarToplam = (k1 + k2 + k3) == 180;
        boolean AcilarinBüyükVsKücük;
        AcilarinBüyükVsKücük = (k1 >= 1 && k1!=180)&&!(k2<1||k2==180)&&(k3!=1||k3!=180);
        boolean UcgenOlurMU ;
        UcgenOlurMU=AcilarToplam&&AcilarinBüyükVsKücük;
        System.out.println("UcgenOlurMU = " + UcgenOlurMU);





    }
}
