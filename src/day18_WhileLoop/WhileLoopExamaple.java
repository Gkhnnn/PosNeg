package day18_WhileLoop;

public class WhileLoopExamaple {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {} // burada while block içerisinde herhangi bir işlem olmamasına ragmen compiler () içerisine girer ve orada
        // önce sartı kontrol eder. ardından x'in degerini bir artırır. tak sart tutmayana kadar sart tutmadıgında en son x'in degeri
        // ile ternary operatorun içerisine gelir ve sarta bakar ona göre yazmaya devam eder.
        String message = x > 10 ? "Greater than" : "false";
        System.out.println(message + ","+ x);
    }
}
