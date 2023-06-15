package encapsulationExercisess;

public class C02_NumberTest {
    public static void main(String[] args) {
        C02_Number number = new C02_Number();
        number.setNumber(-2);
        System.out.println("number.getNumber() = " + number.getNumber()); // - deger vermeye calıstıgımız zaman set methodu devreye girmez ve bu yuzden olusturdugumuz constractors default oldugu için
                                                                          // yazdırmaya calıstıgımız da java default deger yazdırır. buna dikkat etmeliyiz
                                                                          //number.getNumber() = 0 bu default constractors dan gelen degerdir.

    }
}
