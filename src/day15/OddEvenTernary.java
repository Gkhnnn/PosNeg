package day15;

public class OddEvenTernary {
    public static void main(String[] args) {

        // Write a ternary statement that checks whether a number is odd or even
        // Bir sayinin tek mi citf mi oldugunu check eden bit ternary yaziniz

        int num = -25;
        String message;

        // If Else
        if (num % 2 == 0) {
            message = "Even Number";
        } else {
            message = "Odd Number";
        }
        System.out.println("message = " + message);

        // Ternary
        message = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("message = " + message);

        // Lets check first whether number is bigger than 0 or not
        // Sayinin sifirdan buyuk olup olmadigini check edelim
        // nested if else with ternary

        if (num > 0) {
            message = (num % 2 == 0) ? "Even Number" : "Odd Number";
        } else {
            message = "Not a Valid Number";
        }

        System.out.println("message = " + message);
     


    }
}

