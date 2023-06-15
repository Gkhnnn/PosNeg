package FinalKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalKeyword {

    // final tanımlı variableların isimleri Büyük harfle yazılır
    // ikinci bir kelime varsa arasında ("_") bırakılır

    final int number = 12;
    final int number1;
    {
        number1 = 132;

    }
    final static int number2;
    static {
        number2 = 345;
        // number2 = 23; fianl tanımlı bir variable'a bir kere deger verildikten sonra
        // bir daha deger ataması yapılamaz.

    }
    /*
    final keyword tanımlı bir variable'a bir method içerisinde tanımlama
    (initizialize) yapılamaz.

    final int number3;
    public void method(){
        number3 = 5678;
    }

     */

    // constructors içerisinde fianl tanımlı bir variable'a atama yapılabilir.
    final int number4;
    FinalKeyword(){
        number4 = 12;
        // constructors içerisinde fianl tanımlama yapılabilir ancak deger ataması yapılmazsa
        // sout içeisinde yazdırma işlemi yaoılamaz çünkü deger atanmadıgı için hata verir.

        final int number5;
        number5=34;
        System.out.println(number5);
    }

  /*
    final  int number6;
    final  public  void method( int number){
        number = 12;
        number6 = number;
    }

   */

    // final tanımlı bir array'e eleman atama ve elemanlarını değiştirme işlemi yapabiliriz.
    // Ancak fianl tanımlı bir array'e baska bir array'i atayamayız.

    public static void main(String[] args) {
        final int[] arr = new int[2];
        arr[0]=1;
        arr[1]=3;
        // atama yapıp yazddırdık.
        System.out.println(Arrays.toString(arr));

        arr[0]=234;
        arr[1]=23456;
        // final tanımlı bir array'in elemanlarını silebiliriz.
        // tekrar elemanlarını değiştirip yazdırık
        System.out.println(Arrays.toString(arr));

        int[]arry = new int[2];
        arry[0]=66;
        arry[1]=345;
        // arr = arry; burada arr fianl bir array olarak tanımlandığı için
        // içerisine başka bir array tanımlaması yapılamaz.
        
    }
}
