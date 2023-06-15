package singleton;

public class StaticMember {
    final int number1 = 10;
    final int number2;
    final int number3;
    final int number4;

    // final tanımlanmış bir degere daha sonradan deger ataması yapılamaz. final tanımlı bir variable sadece bir kere atama yapılabilir.
    // final tanımlanmış degerlere CONSTANS denir.
    // Final tanımlı degerlerin variable isimleri Büyük Harfle yazılır ve ikinci isimleri yazılırken araya "_" bırakılır..
    StaticMember(){
        number2 = 12;
        number4 = 9;
    }
    {
        number3 = 23;
    }
    static {
        // number4 = 56;  static blok içinde deger ataması yapılmaz..
    }

    void topla(){
        // number4 = 45; atama yapılamaz..
    }
}
