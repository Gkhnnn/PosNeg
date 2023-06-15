package singleton;

public class ArabaTest {
    public static void main(String[] args) {
        Araba.maxInstance = 2;
        Araba araba1 = Araba.instanceOlustur();
        araba1.marka = "Honda";
        araba1.model = "Civic";
        System.out.println(araba1);
        Araba araba2 = Araba.instanceOlustur();

        System.out.println(araba2);
        Araba araba3 = Araba.instanceOlustur();

        System.out.println(araba1.hashCode());
        System.out.println(araba2.hashCode());


        System.out.println(araba3);
    }
}
