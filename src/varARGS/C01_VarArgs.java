package varARGS;

public class C01_VarArgs {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum2(5, 6, 7, 8, 9);
    }

    public static void sum(int... numbers) {
        int sum = 0;
        for (int each : numbers) {
            sum += each;
        }
        System.out.println(sum);
    }

    public static void sum2(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
