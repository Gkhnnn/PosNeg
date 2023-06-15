package day7;

public class CastingToChar {
    public static void main(String[] args) {
        // her bir char degerin numeric bir degeri oldugu için casting yapılabilir.
        // ascii her harfin bir degerinin oldugu tablodur.
        char ch= 'c';
        int num= 65;
        ch=(char)num; // Expilicit Casting(data kaybı)
        System.out.println("char degeri = " + ch);
        int num2=ch;//Impilicit Casting(java kendi içinde yapar.)
        System.out.println("int deger = " + num2);
        // Boolean can not be casted to any primitive
        boolean b1= true;
        //int i=(int)b1;



    }
}
