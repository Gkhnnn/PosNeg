package alistirmalar1;

import java.util.Arrays;

public class Alistirma {
    public static void main(String[] args) {
        System.out.println("Hello\rWorld");// \r kendisinden önceki metni siler.
        System.out.print("BMW\n");//boşluk bırakır.
        System.out.print("Honda\t");// tab tuşu olarak kullanılır.
        System.out.println("Kartal\b");// kendisinden önceki harfi siler.


        System.out.println("I am from" + "Turkey " + "Where are you" + " from?");
        // parantez içerisinde tırnaktan sonra artı işareti konulur yoksa java hata verir.
        // tırnak içerisinde bırakılan her harf, her işaretin java dilin de bir anlamı vardır.


        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println(" ");
        System.out.println("*********"); //kolay yolu budur.
        System.out.println("Merhaba gökhan\fTürk");
        System.out.println("Şampion\'Gökhan\'");// tek tırnak bırakır.
        System.out.println("bana \"merhaba dedi\"");// çift tınak işareti bırakmak için kullanılır.
        System.out.println("\\\\\\\\");// iki tane ters slash işareti bıraktığımız da tek ters slash yazdırır.

        // tek satır açıklama yapmak için kullanılır.
        System.out.println(" tek satır açıklama yapmak için kullanılır.");
        /* çoklu satır açıklama tutacaksa front slash yıldız işareti kullanılır
        */
        System.out.println("/*");


        


    }
}
