package ExercisessTwo;



import static java.lang.Character.isAlphabetic;

public class Aaaa {
    public static void main(String[] args) {
        String str = "Aysegul";
        String newstr = "";
        newstr+=str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (isAlphabetic(str.charAt(i)) && i >= 1) {

                newstr += "-"+str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
