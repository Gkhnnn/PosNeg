package homeWork;

public class Task_4 {
    public static void main(String[] args) {

        int Aci1 = 60;
        int Aci2 = 60;
        int Aci3 = 60;
        int kenar1 = -12;
        int kenar2 = 13;
        int kenar3 = 5;
        String UcgenTuru = "";
        UcgenTuru = (Aci1+Aci2+Aci3==180&&kenar1*kenar2*kenar3>0) ? "Bu üçgen gecerli bir ücgendir."
                : "Bu gecerli bir ucgen degildir. Ucgenin iç aciları toplamı 180 olmak zorunda ve kenar uzunlugu eksi veya sıfır olmamalıdır.";
        System.out.println("UcgenTuru = " + UcgenTuru);
    }
}
