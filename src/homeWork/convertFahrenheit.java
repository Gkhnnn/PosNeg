package homeWork;

public class convertFahrenheit {
    public static double convert(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(convert(45));

    }
}
