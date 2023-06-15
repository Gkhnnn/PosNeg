package WrapperClasses;

import java.util.Locale;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";

        System.out.println(str.toUpperCase());

        int sayiP = 20;

        //primitive data turlerinin hazır methodları yoktur, sadece deger içerirler.

        // Wrapper Classları primitive data turleriyle aynı degeri tasırken
        // degerlerinin yanında ayrıca hazır method kullanmamızada ımkan saglayan classlardır.

        Integer sayiW = 30;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        char karekP= 'a';
        Character karekW = 'b';

        System.out.println(Character.isDigit(karekP));
        System.out.println(Character.isLowerCase(karekW));

        String str1 = "1234";
        String str2 = "1000";

        System.out.println(str1+str2);

        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));


    }
}
