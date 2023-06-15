package day6;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        // 5 tane aritmetik operator vardır.
        System.out.println(5+5);
        int a=10;
        int b=20;
        int sonuc=a+b;
        System.out.println("sonuc = " + sonuc);
        double d= 10.20;
        // int +int =int olur. double +double =double olur.
        // numeric ler birbiriyle toplanabilir.
        //numeric olmayanlar için
        boolean b1= true;
       //double d4= b1 +d; non numeric olanları birbiryle toplayamazyız.
        char c= 'a';
        char b3= 'b';
        int i= c+b3; // karakterlerin ascii table daki degerlerini toplar.
        System.out.println("i = " + i);
        String ab= "c"+"b3";
        System.out.println("ab = " + ab);
        // String kendisinden sonraki her karakteri string yapar.






    }
}
