package day16;

public class LastDigit {
    public static void main(String[] args) {

        // Write a program that checks last digits of two numbers
        // Iki sayinin son rakamlarini karsilastiran bir program yaziniz

        int num1 = 25325;
        int num2 = 235252;
        boolean b;

        // 1. yol
        if(num1%10 == num2%10){
            b = true;
        }else{
            b = false;
        }
        System.out.println("b = " + b);

        // 2. yol
        b = num1%10 == num2%10;
        System.out.println("b = " + b);

        // 3. yol
        System.out.println("b = " + (num1%10 == num2%10));
    }
}
