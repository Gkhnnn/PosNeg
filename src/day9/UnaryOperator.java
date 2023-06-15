package day9;

public class UnaryOperator {
    public static void main(String[] args) {
        int sum = 5 + 20; // (5, 20) operands       (+=)operators

        System.out.println(sum);
        sum++;
        System.out.println("sum = " + sum);//26
        ++sum;
        System.out.println("sum = " + sum);//27
        int num = sum;//27
        int num2 = ++sum;//28
        System.out.println("num2 = " + num2);
        System.out.println("sum = " + sum);
        int num3 = sum++;
        System.out.println("num3 = " + num3);
        System.out.println("sum = " + sum);//29
        System.out.println("sum = " + sum++);//29
        System.out.println("sum = " + sum++);//30
        System.out.println("sum = " + sum++);//31


        int a = 30;
        int b = a--;
        System.out.println("b = " + b);//30
        System.out.println("a = " + a);//29
        System.out.println("a = " + --a);//29
    }
}
