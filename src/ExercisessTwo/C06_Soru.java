package ExercisessTwo;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        boolean sonuc = sonRakamlar();
        System.out.println("sonuc = " + sonuc);


        System.out.println("-------------------------");

        boolean sum = sonRakam(13, 23, true);
        System.out.println("sum = " + sum);
    }

    public static boolean sonRakamlar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen karşılaştırma yapacagınız ilk rakamı giriniz = ");
        int number1 = scan.nextInt();
        System.out.print("Lütfen karşılaştırmak istediğiniz ikinci numarayı giriniz = ");
        int number2 = scan.nextInt();
        if (number1 % 10 == number2 % 10) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean sonRakam (int a , int b , boolean deger){
        deger = a%10==b%10;
        return deger;
    }
}
