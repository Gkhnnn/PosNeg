package day7;

public class TypePromotion {
    // iki aynı degerdeki deklere edilen bir sayı bazı durumlarda sayının toplamı deklere edilen data type dan büyük olma durumu oldugu için bunun önüne gecme amaçlı daha büyük bir data type deklerasyon yapılır.
    public static void main(String[] args) {
        short num1 = 10;
        short num2 = 20;
        short sum;

        //sum= num1+num2; bunların toplamı kendi data tipinden büyük olabilecegi için java bunu yazmaya izin vermiyor.
        // ve tekrar bir dekleration yapmamızı istiyor.

        int sum2 = num1 + num2;
        sum = (short) (num1 + num2);
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
        byte b1 = 2;
        byte b2;
        //b2= b1*2;
        int b3 = b1 * 2;
        b2 = (byte) (b1 * 2);
        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);





    }

}
