package encapsulationExercisess;

public class C01_BirdTest {
    public static void main(String[] args) {
        C01_Bird bird1 = new C01_Bird();
        bird1.setName("mias");
        System.out.println(bird1.getName());

        bird1.setCins("huhu");
        System.out.println(bird1.getCins());

        // encapsulation da get return typeli olup verilen degeri yazdırmaya yarar.
        // encapsulation da set private olarak deger verilen bir instance variabla deger atamak için kullanılır ve void type  kullanılır.
        // constractors içerine set ve get encapsulation methods yerlestirebiliriz.....
        // constractors ile dogrudan bir deger atfetme olursa bu bizim private olarak tanımladıgımız kosullarda bir açık olusturabilir
        //          bu yuzden constractors içerisinde get ve set methodsları kullanarak deger vermek
        //          kosullu degistirmelerimiz acısından daha iyidir.....


    }
}
