package StringClasses;

public class C01_StringClassess {
    public static void main(String[] args) {
        String str = "Apple";
        String str1 = new String("Apple");
        System.out.println(str==str1);  // bunun false cıkmasının nedeni birinin JVM içerinde string pool içerinde kayıt edilmiş olması.
                                        //  diğerinin ise new keywordu kullanılarak olusturuldugu için kendisine ait bir alan olusturularak craete edilmiesidir.
                                        // burada java referans yerlerini kontrol eder ve sonucu ona göre döndürür.
        System.out.println(str.equals(str1));// burada javanın yaptıgı atanan degerlerinin eşit olup olmadıgını kontrol eder.referans numaralarına bakmaz.
    }
}
