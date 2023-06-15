package homeWork;
import java.util.Scanner;
public class calculation {
    public static int toplama(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Toplama islemi :" + result);
        return result;
    }
    public static int Çıkarma(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Cıkarma islemi :" + result);
        return result;
    }
    public static int Carpma(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Carpma İslemi :" + result);
        return result;
    }
    public static int Bölme(int number1, int number2) {
        if (number2 == 0) {
            if (number2 == 0) {
                System.out.println("İkinci sayi Sıfırdan büyük olmalı.");
            }
            return 0;
        }
        int result = number1 / number2;
        System.out.println("Bölme islemi :" + result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1 : Toplama İslemi\n" +
                "2 : Çıkarma İslemi\n" +
                "3 : Carpma İslemi\n" +
                "4 : Bölme İslemi\n" +
                "0 : Cıkıs Yap.";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seciniz :");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Çıkıs yaptınız.");
                break;
            }
            System.out.print("Lütfen ilk sayiyi giriniz.");
            int number1 = scan.nextInt();
            System.out.print("Lütfen ikinci sayiyi giriniz.");
            int number2 = scan.nextInt();
            switch (select) {
                case 1:
                    toplama(number1, number2);
                    break;
                case 2:
                    Çıkarma(number1, number2);
                    break;
                case 3:
                    Carpma(number1, number2);
                    break;
                case 4:
                    Bölme(number1, number2);
                    break;
                case 0:
                    System.out.println("Çıkıs yaptınız.");
                    break;
                default:
                    System.out.println("Gecersiz deger girdiniz.!!");
            }
        }
    }
}