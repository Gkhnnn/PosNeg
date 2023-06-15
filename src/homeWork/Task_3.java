package homeWork;

public class Task_3 {
    public static void main(String[] args) {

        String isim = "Gökhan";
        int yas = 32;
        int mulakatNotunuz = 65;
        String result = "";
        result = (mulakatNotunuz >= 70) ? "Merhaba " + isim + ", ("+yas+") QG Mühendisi secildiniz"
                : "Merhaba " + isim + ", ("+yas+") QG Mühendisi olarak secilmediniz ";
        System.out.println("result = " + result);
    }
}
