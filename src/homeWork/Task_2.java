package homeWork;

public class Task_2 {
    public static void main(String[] args) {

        int sınavNotu = 45;
        String result = "";
        result = (sınavNotu >= 50) ? "Notunuz " + sınavNotu+  " ve gectiniz"
                : "Notunuz " +sınavNotu+  " ve basarısız oldunuz. Sınavı gecmek için 5 puana ihtiyacın vardı";
        System.out.println("result = " + result);
    }
}
