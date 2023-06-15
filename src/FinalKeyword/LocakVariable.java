package FinalKeyword;

public class LocakVariable {

    // Instance variable
    public String name;
    public int age;

    LocakVariable() {
        String lastName;
        lastName = "asfg";
        System.out.println(lastName);
    }

    public void method() {
        int number;
        number = 15;
        System.out.println(number);
    }

    // init block
    {
        double salary;
        salary = 4500;
        System.out.println(salary);

    }

    static class InnerClass {
        static int sayi;
        static void deneGor(){

            sayi = 5;
            System.out.println(sayi);
        }

    }

    public static void main(String[] args) {
        System.out.println(InnerClass.sayi);
        InnerClass.deneGor();
        LocakVariable locakVariable = new LocakVariable();
        locakVariable.method();
        System.out.println("LocakVariable.InnerClass.class = " + InnerClass.class);


    }
}
