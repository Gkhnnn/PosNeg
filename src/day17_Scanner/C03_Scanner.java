package day17_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan bir kelime isteyip
        // kelimenin ilk harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin.");
         char ilkHarf = scan.next().charAt(0);

         /*
         Java da String içerisindeki karakterler index ile tutulur
         ornegin kullanıcı Ali yazarsa
         0.index: A  , 1.index: l  ,  2.index : i

         scanner classında scan.nextChar() yoktur
         bunu yerine scan.next() kullanıp
         kullanıcının girdigi ilk kelimeyi alır,
         sonra cahrAt(0) kullanılarak 0.index'deki
         kelimenin ilk harfini aliriz.

          */
        System.out.println("Girilen kelimenin ilk harfi : " + ilkHarf);
    }
}
