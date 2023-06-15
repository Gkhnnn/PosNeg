package singleton;

public class Araba {
    static Araba instance;
    static int instanceSayisi;
    static int maxInstance;
    String marka;
    String model;

    private Araba() {
        instanceSayisi++;
    }

    private Araba(String marka, String model) {
        instanceSayisi++;
        this.marka = marka;
        this.model = model;

    }

    public static Araba instanceOlustur() {
        if (instanceSayisi<maxInstance) {
            instance = new Araba();
        }else
            instance = null;

        return instance;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
