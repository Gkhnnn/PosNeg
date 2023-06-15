package alistirmalar1;

import java.util.Scanner;

public class IfElseÜrün {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen aldıgınız ürün adedini yazınız.");
        int urunAdedi= scan.nextInt();
        System.out.println("Lütfen ürünün liste fiyatını giriniz.");
        double listeFiyatı= scan.nextDouble();
        System.out.println("Müsteri kartınız var mı?\n Evet: E,e , Hayır: H,h");
        char kartVarMı = scan.next().charAt(0);

        if(kartVarMı=='E'||kartVarMı=='e'&&urunAdedi>10){
            System.out.println((urunAdedi*listeFiyatı)-((urunAdedi*listeFiyatı)/20));
        } else if (kartVarMı=='E'||kartVarMı=='e'&&urunAdedi>0) {
            System.out.println((urunAdedi*listeFiyatı)-((urunAdedi*listeFiyatı)/15));

        } else if (kartVarMı=='H'&&kartVarMı=='h'&&urunAdedi>10) {
            System.out.println((urunAdedi*listeFiyatı)-((urunAdedi*listeFiyatı)/15));

        }else{
            System.out.println((urunAdedi*listeFiyatı)-((urunAdedi*listeFiyatı)/10));
        }
    }
}
