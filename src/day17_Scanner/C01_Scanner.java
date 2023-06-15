package day17_Scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        // Kullanıcıdan ismini alıp sonra da yazdıralım.

        // 1. adım scanner objesi olustur.

        Scanner scan = new Scanner(System.in);

        // kullanıcıya ne istediğimizi soyleyelim.

        System.out.println("Lütfen isminizi giriniz.");


        // 3. adım : scan objesini kullanarak, kullanıcıdan bilgiyi alığ
        //           olusturacagımız uygun bir variable'a kaydedelim.

        String kullanıcıİsmi = scan.nextLine();
        // next() sadece ilk space'e kadar olan metni alırken
        // nextline() tüm satırı alır.

        System.out.println("girilen kullanıcı ismi :" + kullanıcıİsmi);



    }
}
