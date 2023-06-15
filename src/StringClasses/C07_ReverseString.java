package StringClasses;

public class C07_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("alican"));
    }
    public static String reverse(String str){
        String input = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            input+=str.charAt(i);
        }
        return input;
    }
}
