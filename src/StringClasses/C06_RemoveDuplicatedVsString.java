package StringClasses;

public class C06_RemoveDuplicatedVsString {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("ABCDAEBCDAABDESEADNHA"));
    }
    public static String removeDuplicate(String str){
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if(!input.contains(str.charAt(i)+"")){
                input += str.charAt(i);
            }
        }
        return input;
    }
}
