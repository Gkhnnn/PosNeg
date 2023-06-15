package homeWork;

public class OperatorsOdev {
    public static void main(String[] args) {
        char operator = '*';
        String islem = "";
        int a = 20;
        switch (operator) {
            case '*':
                System.out.println("carpma işlemi operatoru");
                a *= a;
                break;
            case '/':
                System.out.println("bölme işlemi operatoru");
                a /= 2;
                break;
            case '%':
                System.out.println("modulus işlemi operatoru");
                a %= 4;


                break;
            case '-':
                System.out.println("çıkarma işlemi operatoru");
                a-=5;
                break;
            case '+':
                System.out.println("toplama işlemi operatoru");
                a+=a;
                break;
            default:
                System.out.println("operators yok.");
        }
        System.out.println("a = " + a);
    }
}
