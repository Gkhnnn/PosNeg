package alistirmalar1;

public class StringContains {
    public static void main(String []args){
        String x = "Java ogren, mutlu ol";

        // x mutlu içeriyor mu? şu şekilde buluruz.
        System.out.println(x.contains("mutlu")); // true cevirir.

        // bir metinde bir kelimeyi aramaya calıştıgımızda yukarıdaki gibi .contains koyarak buluruz. ve bu bize ture veya false döndürür.

        System.out.println(x.contains("J"));

        // contains metotu kac tane olduguna degil var olup olmadıgına bakar.

    }
}
