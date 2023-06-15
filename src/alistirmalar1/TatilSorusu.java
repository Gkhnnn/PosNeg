package alistirmalar1;

import java.util.Scanner;

public class TatilSorusu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Hangi Gün Oldugunu Yazınız.");
        String girilenGun = scan.next();
        String kullanılacakGun = girilenGun.toLowerCase();


        switch (kullanılacakGun){
            case "pazartesi" :
                System.out.println("Şimdi çalışma zamanı tatile 5 gün var.");
                break;
            case "salı":
                System.out.println("Şimdi çalışma zamanı tatile 4 gün var.");
                break;
            case "çarsamba" :
                System.out.println("Şimdi çalışma zamanı tatile 3 gün var.");
                break;
            case "perşembe":
                System.out.println("Şimdi çalışma zamanı tatile 2 gün var.");
                break;
            case "cuma":
                System.out.println("Şimdi çalışma zamanı tatile 1 gün var.");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Şimd dinlenme zamanı");
                break;
            default:
                System.out.println("Tanımlanamayan bir gün girdiniz.");


        }


    }
}
