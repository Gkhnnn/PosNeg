package randomMathDate;

import java.util.Random;

public class C03_RandomZarOynu {
    public static void main(String[] args) {
       while(true){
           Random rnd = new Random();
           int zar1 = rnd.nextInt(1,7);
           int zar2 = rnd.nextInt(1,7);
           if(zar1+zar2<8){
               System.out.println("Lütfen tekrar deneyiniz!!");

           }else{
               int total = zar1+zar2;
               System.out.println("tebrikler dogru bildiniz= "+ total);
               break;
           }
       }


    }
}
