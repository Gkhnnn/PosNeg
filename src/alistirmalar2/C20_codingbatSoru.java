package alistirmalar2;

public class C20_codingbatSoru {
    public static void main(String[] args) {
        String str = "dostum";
        int number = 3;
        String result ="";
        for (int i = 0; i < str.length(); i+=number) {
            result = result + str.charAt(i);

        }
        System.out.println("result = " + result);
    }
}
