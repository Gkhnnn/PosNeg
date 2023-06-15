package randomMathDate;

import java.util.Random;

public class C04_RandomTo90Ustu {

    public static void main(String[] args) {
        do {
            Random rnd = new Random();
            int rastgeleSayi =rnd.nextInt(0,101);
            if(rastgeleSayi>90){
                System.out.println("Secilen sayı 90'dan büyük basardınız!! "+rastgeleSayi);
                break;
            }else {

                System.out.println("Secilen sayı  "+rastgeleSayi+"  90'dan kücük oldugu için lütfen tekrar sayını giriniz!!!");
            }
        }while(true);
    }
}
