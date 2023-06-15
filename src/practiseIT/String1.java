package practiseIT;

public class String1 {

    public static void main(String[] args) {

        String str = "Hi-There";

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            result = result+str.charAt(i)+str.charAt(i);
        }
        System.out.println(result);
    }
}
