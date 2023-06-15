package MethodsAndClass;

public class C01_this {
    int sonuc;
    int sonuc2;

    public void test() {
        this.sonuc = 5; // instance olarak tanımlanan variable methods icerisinde cagırmal için this kelimesi kullanılır.

        System.out.println("sonuc = " + sonuc);
        System.out.println(this.sonuc2);
    }

    public static void main(String[] args) {
        C01_this obj = new C01_this();
        obj.test();

    }
    // ımmutable demek olusturdugumuz bir objenin üzerine yeni birsey eklenmez onun yerine yeni bi deger olusturulur ve tekrardan onun yerine aynı variable ataması yapılır.
}
