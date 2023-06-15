package homeWork;

public class sumOfNumbers {
    /*
    Write a program that iterates numbers and checks if number is even or odd,
     according to evaluation it sums even and odd numbers,
     displays result in two different methods.
        sumOfOddNumbers();
        sumOfEvenNumbers();
     */

    public static int addOfEvenNumbers(int num1, int num2) {
        int sum=0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % 2 == 0) {
                return num1 += i;
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (num2 % 2 == 1) {
                return num2 += i;
            }

        }
        sum= num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
       int sum = addOfEvenNumbers(2, 3);
        System.out.println(sum);

    }
}
