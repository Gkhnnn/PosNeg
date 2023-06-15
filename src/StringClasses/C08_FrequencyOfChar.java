package StringClasses;

public class C08_FrequencyOfChar {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAACDDDWCEFQ"));

    }

    public static String removeDuplicate(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (!input.contains(str.charAt(i) + "")) {
                input += str.charAt(i);
            }
        }
        String expectedResult = "";

        for (int i = 0; i < input.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (input.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            expectedResult += input.charAt(i) + "" + counter;
        }
        return expectedResult;
    }
}
//A3C2D3W1E1F1Q1